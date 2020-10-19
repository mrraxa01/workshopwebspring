package com.mrraxa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrraxa.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
}
