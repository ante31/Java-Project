package com.javaProject.javaProject.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "users")  // Rename the table to something else, e.g., "app_user"
public class User {
    @Id
    private long Id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String role;

}
