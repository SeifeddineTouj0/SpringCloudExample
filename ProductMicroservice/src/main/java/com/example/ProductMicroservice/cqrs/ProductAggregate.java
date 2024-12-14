package com.example.ProductMicroservice.cqrs;

import com.example.ProductMicroservice.Entities.Product;
import com.example.ProductMicroservice.Repositories.ProductRepository;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;
import org.springframework.beans.factory.annotation.Autowired;


@Aggregate
public class ProductAggregate {
    @AggregateIdentifier
    private String id;
    private String name;


    private final ProductRepository productRepository;

    //private String description;
    //private double price;
    //private int stock;

    @Autowired
    public ProductAggregate(ProductRepository productRepository) {
        this.productRepository= productRepository;
        // Constructeur sans argument requis par Axon
    }

    @CommandHandler
    public ProductAggregate(CreateProductCommand command, ProductRepository productRepository) {
        this.productRepository = productRepository;
        // Publier un événement
        AggregateLifecycle.apply(new ProductCreatedEvent(
                command.getId(),
                command.getName()
        ));
    }

    @EventSourcingHandler
    public void on(ProductCreatedEvent event) {
        this.id = event.getId();
        this.name = event.getName();

        Product product = new Product();
        product.setId(this.id);
        product.setName(this.name);
        productRepository.save(product);

        //this.description = event.getDescription();
        //this.price = event.getPrice();
        //this.stock = event.getStock();
    }

}
