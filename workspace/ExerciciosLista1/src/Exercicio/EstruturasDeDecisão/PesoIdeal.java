package EstruturasDeDecisão;

import java.util.Scanner;

public class PesoIdeal {

	public static void main(String[] args) {
		
		int altura; double formula, peso;
		char genero;
		Scanner entrada = new Scanner (System.in );
		
		System.out.println("Insira seu gênero ( M ou H)");
		genero = entrada.next().charAt(0);
		
		System.out.println("Insira a altura em cm");
		altura = entrada.nextInt();
		
		System.out.println("Insira o seu peso");
		peso = entrada.nextDouble();
		
		double alturaMetros = altura/100.0;
		if (genero =='M' || genero =='m') {
			formula =  ((62.10* alturaMetros) - 44.7);
			
			
		} else {
			formula =((72.70*alturaMetros) - 58);
			
			
		}
		if (formula == peso) {
			System.out.println("Você está no peso ideal "
			 +"Aqui está o peso ideal" + formula + "Aqui esta seu peso" + peso);
		} else {
			if (formula > peso) {
				System.out.println("Você está abaixo do peso " );
				System.out.println("Aqui está seu peso ideal " + formula +" Aqui está o seu peso " + peso );
			} else {
				System.out.println("Você está acima do peso ideal ");
				System.out.println("Aqui está seu peso ideal " + formula +" Aqui está o seu peso " + peso );
			}
		}

	}

}
