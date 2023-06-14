package com.cursospring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cursospring.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	//Query Method
	List<User> findByNameContaining (String name);
	
	//Query Method
	User findByUsername(String username);
	
	//Query Override
	@Query("Select u From User u Where u.name LIKE %:name%")
	List<User> filtrarPorNome(@Param("name")String name);

}
