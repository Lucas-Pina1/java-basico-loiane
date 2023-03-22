package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o numero em metros ue deseja converter:");
		double numero = scanner.nextDouble();

		double resultado = numero * 100;

		System.out.println(numero + " m" + " convertido para cm: " + resultado);

		scanner.close();

	}

}
