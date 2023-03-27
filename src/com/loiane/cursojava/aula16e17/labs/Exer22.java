package com.loiane.cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o número de CDs:");
		int numCds = sc.nextInt();

		double preco;
		double soma = 0;

		for (int i = 1; i <= numCds; i++) {
			System.out.println("Entre com o valor CD " + i);
			preco = sc.nextDouble();

			soma += preco;
		}
		
		double media = soma / numCds;
		
		System.out.println("Média de gasto: " + media);

		sc.close();

	}

}
