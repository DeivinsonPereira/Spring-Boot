package com.cursospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursospring.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
}
