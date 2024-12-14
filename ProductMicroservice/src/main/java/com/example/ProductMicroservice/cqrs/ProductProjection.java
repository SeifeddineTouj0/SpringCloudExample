package com.example.ProductMicroservice.cqrs;
import com.example.ProductMicroservice.Repositories.ProductRepository;
import com.example.ProductMicroservice.Entities.Product;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ProductProjection {

    @Autowired
    private ProductRepository productRepository;
    @QueryHandler
    public Product handle(GetProductByIdQuery query) {
        return (Product) productRepository.findById(query.getId()).orElse(null);
    }
}


