package com.loiane.cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com a quantidade de temperaturas");
		int qtdTemperaturas = sc.nextInt();

		double temp;
		int soma = 0;
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;

		for (int i = 1; i <= qtdTemperaturas; i++) {
			System.out.println("Entre com temperatura " + i);
			temp = sc.nextDouble();

			soma += temp;

			if (temp > maior) {
				maior = temp;
			}

			if (temp < menor) {
				menor = temp;
			}
		}

		double media = soma / qtdTemperaturas;

		System.out.println("Média: " + media);
		System.out.println("Maior tempetarura " + maior);
		System.out.println("Menor tempetarura " + menor);

		sc.close();

	}

}
