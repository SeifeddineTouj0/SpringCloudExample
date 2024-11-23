package com.example.UserMicroservice.Services;

import com.example.UserMicroservice.Entities.Product;
import com.example.UserMicroservice.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product productDetails) {
        return productRepository.findById(id).map(product -> {
            product.setName(productDetails.getName());
            return productRepository.save(product);
        }).orElseThrow(() -> new RuntimeException("User not found"));
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
