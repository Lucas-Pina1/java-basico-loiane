package com.loiane.cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero;
		int maior = Integer.MIN_VALUE;

		for (int i = 0; i < 5; i++) {

			System.out.println("Digite um numero: ");
			numero = sc.nextInt();

			if (numero > maior) {
				maior = numero;
			}
		}

		System.out.println("O maior numero digitado foi: " + maior);

		sc.close();

	}

}
