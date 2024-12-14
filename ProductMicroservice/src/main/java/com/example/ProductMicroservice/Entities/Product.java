package com.example.ProductMicroservice.Entities;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "products")
@Getter
@Setter
public class Product {
    @Id
    private String id;
    //@GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(nullable = false)
    private String name;





}