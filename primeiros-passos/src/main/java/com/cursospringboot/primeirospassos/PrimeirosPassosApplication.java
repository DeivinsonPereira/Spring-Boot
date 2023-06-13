package com.cursospringboot.primeirospassos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosApplication.class, args);
		
		//Calculadora calculadora = new Calculadora(); //Não usar mais o new para instanciar dentro do Spring Boot;
		
	}

}
