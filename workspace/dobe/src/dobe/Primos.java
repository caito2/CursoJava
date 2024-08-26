package dobe;

import java.util.Scanner;

public class Primos {

	public static void main(String[] args) {
		int numero;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira aqui seu numero para veriicação de numeros primos");
		numero = entrada.nextInt();
		boolean eprimo = true;
		if(numero <= 1) {
			System.out.println("Não é o el primo");
		}
		for (int i=2; i < numero ; i++) {
			if (numero % i == 0 ) {
				eprimo = false;
			} 
			}
		
	
		if (eprimo == true) {
			System.out.println("El PRIMO");
		} else {
			System.out.println("Nao é o El primo");
		}
	}
	
}
