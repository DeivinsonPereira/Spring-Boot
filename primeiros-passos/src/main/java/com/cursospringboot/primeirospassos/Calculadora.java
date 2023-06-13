package com.cursospringboot.primeirospassos;

import org.springframework.stereotype.Component;

@Component // diz que é um componente da aplicação;
public class Calculadora {

	public double somar(double num1, double num2) {
		return num1 + num2;
	}
}
