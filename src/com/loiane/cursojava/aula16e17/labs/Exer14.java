package com.loiane.cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero;
		int pares = 0;
		int impares = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um numero: ");
			numero = sc.nextInt();

			boolean numeroPar = numero % 2 == 0;

			if (numeroPar) {
				pares++;
			} else {
				impares++;
			}
		}

		System.out.println("Quantidade de pares: " + pares);
		System.out.println("Quantidade de impares: " + impares);

		sc.close();

	}

}
