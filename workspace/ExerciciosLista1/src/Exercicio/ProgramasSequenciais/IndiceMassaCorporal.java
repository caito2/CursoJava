package ProgramasSequenciais;

import java.util.Scanner;

public class IndiceMassaCorporal {

	public static void main(String[] args) {
		int peso, altura, formula;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira o seu peso");
		peso =entrada.nextInt();
		System.out.println("Insira altura");
		altura = entrada.nextInt();
		formula = peso/(altura *altura);
		
		System.out.println("Aqui está o resultado do IMC" + formula);
	}

}
