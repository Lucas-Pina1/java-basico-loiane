package com.loiane.cursojava.aula16e17.labs;

public class Exer04 {

	public static void main(String[] args) {

		int ano = 0;

		int populacaoA = 80000;
		int populacaoB = 200000;

		double taxaAnual;

		while (!(populacaoA >= populacaoB)) {
			taxaAnual = 3.0;
			populacaoA += (populacaoA / 100) * taxaAnual;

			taxaAnual = 1.5;
			populacaoB += (populacaoB / 100) * taxaAnual;

			ano++;
		}

		System.out.println("População A: " + populacaoA);
		System.out.println("População B: " + populacaoB);

		System.out.println("Demorou " + ano + " para a populaçao A chegar na B");
	}

}
