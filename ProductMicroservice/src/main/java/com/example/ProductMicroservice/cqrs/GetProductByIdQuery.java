package com.example.ProductMicroservice.cqrs;

import lombok.Getter;

@Getter
public class GetProductByIdQuery {
    private final String id;
    public GetProductByIdQuery(String id) {
        this.id = id;
    }
}
