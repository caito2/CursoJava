package EstruturasDeDecisão;

import java.util.Scanner;

public class VerificarPositivo {

	public static void main(String[] args) {
		int numero;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira abaixo o seu numero para verificar ");
		numero = entrada.nextInt();
		
		if (numero > 0) {
			System.out.println("Seu numero é positivo");
		} else {
			if (numero == 0) {
				System.out.println("Seu numero é nulo");
			} else {
					System.out.println("Seu numero é negativo");
			}
		}

	}

}
