package com.loiane.cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean notaValida = false;

		double nota;

		do {

			System.out.print("Digite uma nota de 0 a 10: ");

			nota = sc.nextDouble();

			if (nota >= 0 && nota <= 10) {

				notaValida = true;
				System.out.println("Você digitou a nota " + nota);

			} else {

				System.out.println("Você digitou uma nota invalida, digite novamente.");
			}

		} while (!notaValida);

		sc.close();

	}

}
