package com.mrraxa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrraxa.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
