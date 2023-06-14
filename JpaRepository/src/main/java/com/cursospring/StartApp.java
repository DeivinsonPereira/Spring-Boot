package com.cursospring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cursospring.model.User;
import com.cursospring.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner{

	@Autowired
	private UserRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		List<User> users = repository.findByNameContaining("Deivinson");
		
		for (User u : users) {
			System.out.println(u);
		}
	}
	
}
