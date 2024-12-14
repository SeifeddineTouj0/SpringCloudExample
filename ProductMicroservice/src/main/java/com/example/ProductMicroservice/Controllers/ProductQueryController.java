package com.example.ProductMicroservice.Controllers;

import com.example.ProductMicroservice.Entities.Product;
import com.example.ProductMicroservice.cqrs.GetProductByIdQuery;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/products-cqrs")
public class ProductQueryController {

    @Autowired
    private QueryGateway queryGateway;

    @GetMapping("/{id}")
    public CompletableFuture<Product> getProductById(@PathVariable String id) {
        // Create a query object
        GetProductByIdQuery query = new GetProductByIdQuery(id);

        // Send the query and return the result
        return queryGateway.query(query, Product.class);
    }
}
