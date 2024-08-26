package EstruturasDeRepetição;

import java.util.Scanner;

public class Divisores {

	public static void main(String[] args) {
		int numero;
		Scanner entrada= new Scanner (System.in);
		System.out.println("Insira o numero aqui");
		numero= entrada.nextInt(); 
		
		for (int i = 1; i<=numero; i++) {
			if (numero % i ==0) {
				System.out.println( i);
			}
		}
	}

}
