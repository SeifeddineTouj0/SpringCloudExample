package com.example.ProductMicroservice.Repositories;

import com.example.ProductMicroservice.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Object> findById(String id);
    // Additional custom methods if needed
}
