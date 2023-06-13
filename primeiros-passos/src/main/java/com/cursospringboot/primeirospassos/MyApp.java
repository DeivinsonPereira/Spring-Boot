package com.cursospringboot.primeirospassos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component // diz que é um componente da aplicação;
public class MyApp implements CommandLineRunner{ //Essa implementação traz o método run abaixo.

	@Autowired //Injeção de dependencia... diz que o Objeto calculadora é uma dependencia de myApp para não dar NullPointerException.
	private Calculadora calculadora;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("O resultado é " + calculadora.somar(2,7));
	}

	
}
