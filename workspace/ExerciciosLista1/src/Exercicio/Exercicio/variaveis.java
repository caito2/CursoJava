package Exercicio;

import java.util.Scanner;

public class variaveis {

	public static void main(String[] args) {
		byte a, b, c;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira valor da variavel 1");
		a = entrada.nextByte();
		System.out.println("Insira valor da variavel 2");
		b = entrada.nextByte();
		
		
		c = a;
		a = b;
		b = c;
		System.out.println("Resultado de A " + a + "Resultado de B " +b);
	}

}
