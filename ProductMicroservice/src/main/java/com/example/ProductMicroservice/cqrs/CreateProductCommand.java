package com.example.ProductMicroservice.cqrs;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.axonframework.modelling.command.TargetAggregateIdentifier;


@Getter
@AllArgsConstructor
public class CreateProductCommand {

    @TargetAggregateIdentifier
    private final String id;
    private final String name;
    //private final String description;
    //private final double price;
    //private final int stock;


}
