package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a temperatura em graus Farenheit:");
		double grausFarenheit = scanner.nextDouble();

		double grausCelsius = (5 * (grausFarenheit - 32) / 9);

		System.out.println("A temperatura " + grausFarenheit + " F é igual a: " + grausCelsius + " C");

		scanner.close();

	}

}
