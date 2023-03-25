package com.loiane.cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean infosValidas = true;

		int cont = 0;

		int populacaoA = 80000;
		int populacaoB = 200000;

		double taxaAnualPopA;
		double taxaAnualPopB;

		infosValidas = false;

		do {
			System.out.println("Digite o valor da População A: ");
			populacaoA = sc.nextInt();

			if (populacaoA > 0) {
				infosValidas = true;
			} else {
				System.out.println("População precisa ser maior que 0.");
			}

		} while (!infosValidas);

		infosValidas = false;

		do {
			System.out.println("Digite o valor da População B: ");
			populacaoA = sc.nextInt();

			if (populacaoB > 0) {
				infosValidas = true;
			} else {
				System.out.println("População precisa ser maior que 0.");
			}

		} while (!infosValidas);

		infosValidas = false;

		do {
			System.out.println("Digite o valor da taxa População A: ");
			taxaAnualPopA = sc.nextInt();

			if (taxaAnualPopA > 0) {
				infosValidas = true;
			} else {
				System.out.println("Taxa precisa ser maior que 0.");
			}

		} while (!infosValidas);

		infosValidas = false;

		do {
			System.out.println("Digite o valor da taxa População B: ");
			taxaAnualPopB = sc.nextInt();

			if (taxaAnualPopB > 0) {
				infosValidas = true;
			} else {
				System.out.println("Taxa precisa ser maior que 0.");
			}

		} while (!infosValidas);

		while (populacaoA >= populacaoB) {

			infosValidas = true;

			populacaoA += (populacaoA / 100) * taxaAnualPopA;

			populacaoB += (populacaoB / 100) * taxaAnualPopB;

			cont++;
		}

		System.out.println("População A: " + populacaoA);
		System.out.println("População B: " + populacaoB);

		System.out.println("Demorou " + cont + " anos para a populaçao A chegar na B");

		sc.close();

	}

}
