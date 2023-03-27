package com.loiane.cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numeroNotas;

		System.out.println("Entre com o numero de notas:");
		numeroNotas = sc.nextInt();

		double soma = 0;
		double media;
		double nota;

		for (int i = 0; i < numeroNotas; i++) {
			System.out.println("Entre com a nota " + (i + 1));
			nota = sc.nextDouble();

			soma += nota;
		}

		media = soma / numeroNotas;

		System.out.println("Soma: " + soma);
		System.out.println("Media é: " + media);

		sc.close();

	}

}
