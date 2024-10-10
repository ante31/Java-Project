package com.javaProject.javaProject.repositories;

import com.javaProject.javaProject.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // JpaRepository provides basic CRUD operations, so no additional code is needed
}
