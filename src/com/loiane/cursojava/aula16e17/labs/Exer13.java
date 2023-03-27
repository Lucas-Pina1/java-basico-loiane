package com.loiane.cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int base, pot;

		System.out.println("Digite a base da operação:");
		base = sc.nextInt();

		System.out.println("Digite a expoente da operação:");
		pot = sc.nextInt();

		int resultado = base;

		for (int i = 1; i < pot; i++) {

			resultado *= base;
		}

		System.out.println("Resultado é de : " + resultado);

		sc.close();

	}

}
