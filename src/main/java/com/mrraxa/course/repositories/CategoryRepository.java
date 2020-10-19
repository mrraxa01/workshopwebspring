package com.mrraxa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrraxa.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
