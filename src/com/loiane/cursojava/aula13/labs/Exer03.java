package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro numero:");
		int numero1 = scanner.nextInt();

		System.out.println("Digite o segundo numero:");
		int numero2 = scanner.nextInt();

		int soma = numero1 + numero2;

		System.out.println("A soma de " + numero1 + " + " + numero2 + " é: " + soma);

		scanner.close();

	}

}
