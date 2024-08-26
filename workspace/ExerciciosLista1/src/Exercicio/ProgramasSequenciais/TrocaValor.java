package ProgramasSequenciais;

import java.util.Scanner;

public class TrocaValor {

	public static void main(String[] args) {
		int numero1, numero2, slotTroca;
		Scanner entrada= new Scanner(System.in);
		System.out.println("Insira numero A");
		numero1 = entrada.nextInt();
		System.out.println("Insira numero B");
		numero2 = entrada.nextInt();
		
		slotTroca = numero1;
		numero1 = numero2;
		numero2 =slotTroca;
		
		System.out.println("Aqui esta o numero A  " + numero1);
		System.out.println("Aqui esta o numero B  " + numero2);
	}

}
