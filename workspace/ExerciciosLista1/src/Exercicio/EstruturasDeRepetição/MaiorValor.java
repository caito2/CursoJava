package EstruturasDeRepetição;

import java.util.Scanner;

public class MaiorValor {
	public static void main(String[] args) {
		int armazenamento = 0, valor;
		Scanner entrada= new Scanner (System.in);
		
		
		for(int i=0; i<=10; i++) {
			System.out.println("Insira o numero");
			valor = entrada.nextInt();
			if (valor > armazenamento) {
				armazenamento = valor;
			}
		}
		System.out.println("Maio valor inserido:  " +armazenamento);
	}
}