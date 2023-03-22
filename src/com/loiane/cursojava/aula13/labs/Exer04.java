package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a primeiro nota:");
		double nota1 = scanner.nextDouble();

		System.out.println("Digite a segundo nota:");
		double nota2 = scanner.nextDouble();

		System.out.println("Digite a terceiro nota:");
		double nota3 = scanner.nextDouble();

		System.out.println("Digite a quarto nota:");
		double nota4 = scanner.nextDouble();

		double media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("A media das notas foi: " + media);

		scanner.close();
	}

}
