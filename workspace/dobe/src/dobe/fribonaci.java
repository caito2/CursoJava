package dobe;

import java.util.Scanner;

public class fribonaci {

	public static void main(String[] args) {
		int tamanhoCalculo = 0;
		int inicializarqtd;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escreva abaixo ate que numero vá o seu calculo");
		tamanhoCalculo = entrada.nextInt();
		System.out.println("Voce vai inicializar com quantos numero ? ");
		inicializarqtd = entrada.nextInt();
		
		int [] vetorFribonaci = new int[tamanhoCalculo];
		int j = 0;
		while( j < inicializarqtd) {
		System.out.println("Quais são os numeros ? ");
		vetorFribonaci [j] = entrada.nextInt();
		j++;
		}
		
		for (int i=inicializarqtd; i < tamanhoCalculo; i++) {
			vetorFribonaci[i] = vetorFribonaci[i-1 ] + vetorFribonaci[i-2];
		}
		
		for ( int mostrar = 0; mostrar < tamanhoCalculo; mostrar++) {
			System.out.println(vetorFribonaci[mostrar]);
		}
			
	} 

}
