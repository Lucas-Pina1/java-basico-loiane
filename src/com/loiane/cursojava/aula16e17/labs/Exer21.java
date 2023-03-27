package com.loiane.cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o número de turma:");
		int numTurmas = sc.nextInt();

		int numAlunos;
		int soma = 0;

		boolean invalido = true;

		for (int i = 1; i < numTurmas; i++) {

			invalido = true;

			do {
				System.out.println("Entre com numero de alunos da turma " + i);
				numAlunos = sc.nextInt();

				if (numAlunos > 40) {
					invalido = false;
				} else {
					System.out.println("Numero de alunos inválido. Digite novamente.");
				}
			} while (invalido);

			soma += numAlunos;

		}
		
		double media = soma / numTurmas;
		
		System.out.println("Media: " + media);

		sc.close();

	}

}
