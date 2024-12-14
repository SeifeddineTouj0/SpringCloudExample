package com.example.ProductMicroservice.Controllers;
import com.example.ProductMicroservice.Entities.Product;
import com.example.ProductMicroservice.cqrs.CreateProductCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/products-cqrs")
public class ProductCommandController {
    @Autowired
    private CommandGateway commandGateway;
    @PostMapping
    public String createProduct(@RequestBody Product product) {
        String id = UUID.randomUUID().toString();
        CreateProductCommand command = new CreateProductCommand(
                id, product.getName());
        commandGateway.sendAndWait(command);
        return id;
    }
}
