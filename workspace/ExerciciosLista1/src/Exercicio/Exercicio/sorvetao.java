package Exercicio;
import java.util.Iterator;
import java.util.Scanner;
public class sorvetao {

	public static void main(String[] args) {
		float espaço, velocidade, tempom, conta;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira o SO");
		espaço= entrada.nextFloat();
		System.out.println("Insira velocidade");
		velocidade = entrada.nextFloat();
		System.out.println("Insira tempo");
		tempom= entrada.nextFloat();
		
		conta = espaço + velocidade * tempom;
		
		System.out.println(conta);
	}

}
