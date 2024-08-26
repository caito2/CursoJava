package dobe;

import java.util.Scanner;

public class MenorNumeroVetor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int qtdNumeros =0;
		int comparar = 99999;
		System.out.println("Coloque abaixo a quantidade de numeros que vc quer colocar");
		qtdNumeros = entrada.nextInt();
		int numeros[]= new int[qtdNumeros];
		int i = 0;
		while(i < qtdNumeros) {
			System.out.println("Agora insira os numeros que você quer");
			 numeros [i] = entrada.nextInt();
			i++;
		}
		
		for(int j = 0; j < qtdNumeros; j++) {
			
			if (numeros[j] < comparar) {
				comparar = numeros [j];
			}
		}
		
		System.out.println("Aqui está o menos numero que vc colocou " + comparar);
	}

}
