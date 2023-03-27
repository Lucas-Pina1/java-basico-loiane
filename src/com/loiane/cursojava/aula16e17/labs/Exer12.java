package com.loiane.cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero;

		boolean infoValida = false;

		do {

			System.out.println("Entre com um numero de 1 a 10 para saber a Tabuada:");
			numero = sc.nextInt();

			if (numero >= 1 && numero <= 10) {
				infoValida = true;
			} else {
				System.out.println("Opçãp invalida! tente novamente\n");
			}

		} while (!infoValida);

		System.out.println("Tabuada de " + numero + ":\n");

		for (int i = 1; i <= 10; i++) {

			int resultado = numero * i;

			System.out.println(numero + " X " + i + " = " + resultado + "\n");

		}

		sc.close();

	}

}
