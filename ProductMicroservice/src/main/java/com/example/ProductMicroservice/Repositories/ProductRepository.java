package com.example.ProductMicroservice.Repositories;

import com.example.ProductMicroservice.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Additional custom methods if needed
}
