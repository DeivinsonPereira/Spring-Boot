package com.cursospringboot.primeirospassosspringboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.gson.Gson;

@Configuration
public class BeansFactory {

	@Bean
	public CommandLineRunner run(ConversorJson conversor) throws Exception{
		return args -> {
			String json = "{\"cep\": \"01001-000\", \"logradouro\": \"Praça da Sé\",\"localidade\": \"São Paulo\"}";
			ViaCepResponse response = conversor.converter(json);
			System.out.println("Dados do CEP:"  + response);
			
		};
	}
	
	@Bean
	public Gson gson() {
		return new Gson();
	}
	
}
