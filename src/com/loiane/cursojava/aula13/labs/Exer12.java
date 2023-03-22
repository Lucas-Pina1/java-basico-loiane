package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a altura da pessoa:");
		double altura = scanner.nextDouble();

		double pesoIdeal = (72.7 * altura) - 58;

		System.out.println("O peso ideal é: " + pesoIdeal);

		scanner.close();

	}

}
