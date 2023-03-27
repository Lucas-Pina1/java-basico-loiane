package com.loiane.cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o n-ésimo termo da série de fibonacci:");
		int n = sc.nextInt();

		int primeiro = 1;
		int segundo = 1;
		int proximo;
		
		System.out.println(primeiro);
		System.out.println(segundo);

		for (int i = 3; i < n; i++) {

			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;

			System.out.println(proximo);

		}

		sc.close();

	}

}
