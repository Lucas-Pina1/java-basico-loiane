package com.loiane.cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nome, sexo, estadoCivil;
		int idade;
		double salario;

		boolean infoValida = false;

		do {
			System.out.println("Digite seu nome: ");
			nome = sc.nextLine();

			if (nome.length() >= 3) {
				infoValida = true;
			} else {
				System.out.println("Nome precisa no mínimo de 3 caracteres.");
			}
		} while (!infoValida);

		infoValida = false;

		do {
			System.out.println("Digite sua idade: ");
			idade = sc.nextInt();

			if (idade >= 0 && idade <= 150) {
				infoValida = true;
			} else {
				System.out.println("Idade precisa ser um valor entre 0 e 150.");
			}
		} while (!infoValida);

		infoValida = false;

		do {
			System.out.println("Digite seu salário: ");
			salario = sc.nextDouble();

			if (salario > 0) {
				infoValida = true;
			} else {
				System.out.println("Salário precisa ser maior que 0.");
			}
		} while (!infoValida);

		infoValida = false;

		do {
			System.out.println("Digite seu sexo: M ou F");
			sexo = sc.next();

			if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
				infoValida = true;
			} else {
				System.out.println("sexo so pode ser 'f' ou 'm'");
			}
		} while (!infoValida);

		infoValida = false;

		do {
			System.out.println("Digite seu estado civil: S, C, V, D ");
			estadoCivil = sc.next();

			if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
					|| estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
				infoValida = true;
			} else {
				System.out.println("estado civil invalido! so pode ser 's', 'c', 'v' ou 'd'");
			}
		} while (!infoValida);

		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);

		sc.close();

	}

}
