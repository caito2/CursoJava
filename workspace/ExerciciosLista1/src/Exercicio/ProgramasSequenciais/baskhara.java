package ProgramasSequenciais;

import java.util.Scanner;

public class baskhara {

	public static void main(String[] args) {
		double formulaPositiva,formulaNegativa, raizDelta;
		int numeroA, numeroB, numeroC;
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Insira o valor do coeficiente A");
		numeroA = entrada.nextInt();
		System.out.println("Insira o valor do coeficiente B");
		numeroB = entrada.nextInt();
		System.out.println("Insira o valor do coeficiente C");
		numeroC = entrada.nextInt();
		raizDelta = numeroB*numeroB - 4*numeroA*numeroC;
		formulaPositiva = (-1*numeroB + Math.sqrt(raizDelta))/2*numeroA;
		
		formulaNegativa = (-1*numeroB - Math.sqrt(raizDelta))/2*numeroA;
		
		
		System.out.println("Aqui esta o Delta x1   " + formulaPositiva);
		System.out.println("Aqui esta o Delta x2   " + formulaNegativa);
	}

}
