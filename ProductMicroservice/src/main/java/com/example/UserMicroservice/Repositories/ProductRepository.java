package com.example.UserMicroservice.Repositories;

import com.example.UserMicroservice.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Additional custom methods if needed
}
