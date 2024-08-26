package EstruturasDeDecisão;

import java.util.Scanner;

public class Ascendente {

	public static void main(String[] args) {
		int numeroA, numeroB, numeroC;
		Scanner entrada = new Scanner(System.in);
			System.out.println("Insira o numero A");
			numeroA = entrada.nextInt();
			
			System.out.println("Insira o numero B");
			numeroB = entrada.nextInt();
			
			System.out.println("Insira o numero C");
			numeroC = entrada.nextInt();
			
			if (numeroA > numeroB && numeroA > numeroC && numeroB> numeroC) {
				System.out.println(numeroC +" " + numeroB +" "+ numeroA);
			} else {
				if (numeroA > numeroB && numeroA> numeroC && numeroC > numeroB) {
					System.out.println(numeroB +" " + numeroC +" " + numeroA);
				} else {
					if (numeroA > numeroB && numeroC >numeroB) {
						System.out.println(numeroB +" "+ numeroA +" " +numeroC);
					} else {
						if (numeroC > numeroA && numeroB > numeroA) {
							System.out.println(numeroA+ " " + numeroB + " " + numeroC);
						} else {
								if (numeroB > numeroC && numeroA >numeroC) {
									System.out.println(numeroC + " " + numeroA +" " +numeroB);
								} else {
									System.out.println(numeroA +" " + numeroC+" " + numeroB);
								}
						}

					}

				}
			}
			
	}

}
