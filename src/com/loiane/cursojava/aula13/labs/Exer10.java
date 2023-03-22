package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a temperatura em graus Celsius:");
		double grausCelsius = scanner.nextDouble();

		double grausFarenheit = (grausCelsius * 1.8) + 32;

		System.out.println("A temperatura " + grausCelsius + " C é igual a: " + grausFarenheit + " F");

		scanner.close();

	}

}
