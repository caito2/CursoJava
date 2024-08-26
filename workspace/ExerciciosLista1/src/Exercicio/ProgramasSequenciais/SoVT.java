package ProgramasSequenciais;

import java.util.Scanner;

public class SoVT {

	public static void main(String[] args) {
		int SO,velocidade,tempo, formula;
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Insira o numero da posição inicial(SO)");
		SO = entrada.nextInt();
		System.out.println("Insira o numero da Velocidade(V)");
		velocidade = entrada.nextInt();
		System.out.println("Insira o numero do Tempo(T)");
		tempo = entrada.nextInt();
		formula = SO + (velocidade + tempo);
		System.out.println("Aqui está o resultado da conta "+ formula);
		
	}

}
