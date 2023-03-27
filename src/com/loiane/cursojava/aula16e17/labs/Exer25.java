package com.loiane.cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Lojas Tabajara");

		boolean sair = false;
		String continuarCompra;
		int qtdProdutos;
		double preco;
		double total;
		String output;
		double valorPago, troco;

		do {

			System.out.println("Deseja informar uma nova compra? S/N");
			continuarCompra = sc.next();

			if (continuarCompra.equalsIgnoreCase("s")) {
				output = "Lojas Tabajara\n";

				System.out.println("Digite a quantidade de produtos da compra:");
				qtdProdutos = sc.nextInt();

				total = 0;

				for (int i = 1; i < qtdProdutos; i++) {
					System.out.println("Informe o preço do produto " + i);
					preco = sc.nextDouble();

					total += preco;

					output += "Produto " + i + ": R$ " + preco + "\n";
				}

				output += "Total: R$ " + total;

				System.out.println("Total: R$ " + total);

				System.out.println("Entre com o valor pago:");
				valorPago = sc.nextDouble();

				output = "Dinheiro: R$ " + valorPago + "\n";

				troco = valorPago - total;

				output = "Troco: R$ " + troco + "\n";

				System.out.println(output);
			} else {
				sair = true;
			}

		} while (!sair);

		sc.close();

	}

}
