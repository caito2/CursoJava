package EstruturasDeRepetição;

import java.util.Scanner;

public class FIM {

	public static void main(String[] args) {
		int contador = 0;
		boolean confirmar = true;
		String palavra;
		Scanner entrada= new Scanner(System.in);
			while(confirmar) {
				System.out.println("Insira a palavra ou 'FIM' caso queira terminar");
				palavra = entrada.next();
				if (palavra.equals("FIM")) {
					confirmar = false;
				} else {
					contador++;
				}
	}
			System.out.println("Aqui está a quantidade de palavras que você colocou "+ contador);
	}

}
