package com.example.ProductMicroservice.cqrs;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ProductCreatedEvent {
    private final String id;
    private final String name;
    //private final String description;
    //private final double price;
    //private final int stock;


}
