package com.loiane.cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nomeUsuario;
		String senha;

		boolean login = false;

		do {

			System.out.println("Digite seu usuario: ");
			nomeUsuario = sc.nextLine();

			System.out.println("Digite sua senha: ");
			senha = sc.nextLine();

			if (nomeUsuario.equalsIgnoreCase(senha)) {
				System.out.println("Senha invalida! Não pode ser igual ao nome de usuario, tente novamente.");
			} else {
				login = true;
				System.out.println("Login realizado com sucesso!");
			}

		} while (!login);

		sc.close();

	}

}
