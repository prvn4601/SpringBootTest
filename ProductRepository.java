package com.prvntechie.Springbootexample2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prvntechie.Springbootexample2.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
	Product findByName(String name);

}
