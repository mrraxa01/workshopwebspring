package com.mrraxa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrraxa.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
