package Exercicio;

import java.util.Scanner;
public class volume {

	public static void main(String[] args) {
		double largura, comprimento, altura, conta;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira aqui o valor da Largura");
		largura = entrada.nextDouble();
		System.out.println("Insira aqui o valor do comprimento");
		comprimento = entrada.nextDouble();
		System.out.println("Insira aqui o valor da altura");
		altura = entrada.nextDouble();

		conta = largura*altura*comprimento;

		System.out.println(conta);
	}

}
