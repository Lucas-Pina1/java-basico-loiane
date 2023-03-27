package com.loiane.cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero;
		int soma = 0;
		double media;

		for (int i = 0; i < 5; i++) {

			System.out.println("Digite um numero: ");
			numero = sc.nextInt();

			soma += numero;
		}

		media = soma / 5;

		System.out.println("Soma: " + soma);
		System.out.println("Media: " + media);

		sc.close();

	}

}
