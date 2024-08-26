package EstruturasDeDecisão;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		int numero ;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira aqui p seu numero");
		numero = entrada.nextInt();
		if (numero %2 ==0) {
			System.out.print("Numero Par");
		} else {
			System.out.print("Numero Impar");
		}

	}

}
