package EstruturasDeDecisão;

import java.util.Scanner;

public class PesoPlaneta {

	public static void main(String[] args) {
		double peso, calculo;
		int planeta;
		Scanner entrada= new Scanner(System.in);
		System.out.println("Insira o peso");
		peso = entrada.nextDouble();
		System.out.println("Insira o numero correspondente ao planeta");
		planeta= entrada.nextInt();
		switch (planeta) {
		case 1:
			calculo = peso * (0.37);
			System.out.println("Aqui está o peso no planeta selecionado:"+ calculo);
			break;
		case 2:
			calculo = peso * 0.88;
			System.out.println("Aqui está o peso no planeta selecionado:"+ calculo);
			break;
		case 3:
			
			calculo = peso * 0.38;
			System.out.println("Aqui está o peso no planeta selecionado:"+ calculo);
			break;
		case 4:
			calculo = peso* 2.64;
			System.out.println("Aqui está o peso no planeta selecionado:"+ calculo);
			break;
		case 5:
			calculo = peso* 1.15;
			System.out.println("Aqui está o peso no planeta selecionado:"+ calculo);
			break;
		case 6:
			calculo = peso * 1.17;
			System.out.println("Aqui está o peso no planeta selecionado:"+ calculo);
			break;
		default :
			System.out.println("Insira um numero valido");
			break;
		}
		

	}

}
