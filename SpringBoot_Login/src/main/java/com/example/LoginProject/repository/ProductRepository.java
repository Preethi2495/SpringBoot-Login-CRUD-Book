package com.example.LoginProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LoginProject.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
