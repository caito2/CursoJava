package dobe;

import java.util.Scanner;

public class SomandoVetor {

	public static void main(String[] args) {
		int tamanho = 0;
		
		int numerossomados = 0 ;
		int i=0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual vai ser o tamanho do seu veto ?");
		tamanho = entrada.nextInt();
		int vetor[] = new int[tamanho];
		while( i  < tamanho ) {
			System.out.println("Insira o numero " );
			vetor[i] = entrada.nextInt();
			i++;
				
		}
		
		for ( int j=0; j< tamanho; j++) {
			numerossomados = numerossomados + vetor[j];
		}
		
		System.out.println(numerossomados);
	}
		
}
