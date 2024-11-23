package com.example.UserMicroservice.Repositories;

import com.example.UserMicroservice.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Additional custom methods if needed
}
