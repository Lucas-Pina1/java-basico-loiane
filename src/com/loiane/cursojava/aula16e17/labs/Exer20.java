package com.loiane.cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o numero de idades:");
		int numeroIdades = sc.nextInt();

		int idade;
		int soma = 0;

		for (int i = 0; i < numeroIdades; i++) {
			System.out.println("Entre com a idade da pessoa " + (i + 1));
			idade = sc.nextInt();

			soma += idade;
		}

		double media = soma / numeroIdades;

		if (media >= 0 && media <= 25) {
			System.out.println("jovem");
		} else if (media >= 26 && media <= 60) {
			System.out.println("adulta");
		} else if (media > 60) {
			System.out.println("idosa");
		}

		sc.close();

	}

}
