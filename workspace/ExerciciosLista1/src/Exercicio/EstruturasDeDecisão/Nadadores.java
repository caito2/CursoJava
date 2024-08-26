package EstruturasDeDecisão;

import java.util.Scanner;

public class Nadadores {

	public static void main(String[] args) {
		int idade;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira sua idade para verificação");
		idade = entrada.nextInt();
		
		if (idade >= 18) {
			System.out.println("Você está na categoria adulto");
		} else {
			if (idade >= 14 ) {
				System.out.println("Você está na categoria Juvenil B");
			} else {
				if (idade >= 11) {
					System.out.println("Você está na categoria juvenil A");
				} else {
					if (idade >= 8) {
						System.out.println("Você está na categoria Infantil B");
					} else {
						if (idade >= 5) {
							System.out.println("Você está na categoria Infantil A");
						} else {
								System.out.println("Infelizmente você ainda não pode nadar :(");
						}

					}

				}
			}
		}

	}

}
