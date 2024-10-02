package dobe;
import java.util.Scanner;
public class CopiaFribonaciComFunçao {

	public static void main(String[] args) {
		int tamanhoCalculo = 0;
		int	inicializarQTD;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva abaixo ate que numero vai o seu calculo");
		tamanhoCalculo = entrada.nextInt();
		
		System.out.println("Você vai inicializar com quantos numeros ? (No minimo 2)");
		inicializarQTD = entrada.nextInt();
		if (inicializarQTD <=1) {
			System.out.println("Não podemos inicializar com 1 numero ou um numero menor que 1, tem que ser no minimo com 2"); //Será impossivel fazer com 1 numero entao fiz isso para caso o usuario coloque 1
			System.out.print("Insira agora com quantos numero vai iniciaizar  ");
			inicializarQTD = entrada.nextInt();
		}
		int [] vetorFribonacci = PreencherVetorFribonacci (entrada, inicializarQTD, tamanhoCalculo);
		
		 vetorFribonacci = CalculoFribonacci (inicializarQTD, tamanhoCalculo,  vetorFribonacci);
		
		 PrintandoVetor(vetorFribonacci, tamanhoCalculo);
		
	}
	public static int [] PreencherVetorFribonacci (Scanner entrada, int inicializarQTD, int tamanhoCalculo) {
		int [] vetorFribonacci = new int[tamanhoCalculo];
		int j=0;
		while(j < inicializarQTD) {
			System.out.println("Quais são os numeros ? ");
			vetorFribonacci [j] = entrada.nextInt(); //Recebemos até que numero vai nosso vetor e com quais numeros ele vai inicializar
			j++;
		}
		
		return vetorFribonacci; //retorna o vetor de fribonacci completo
		
		}
		
	
	 public static int[] CalculoFribonacci(int inicializarQTD, int tamanhoCalculo, int[] vetorFribonacci) {
	        
	        for (int i = inicializarQTD; i < tamanhoCalculo; i++) {
	            vetorFribonacci[i] = vetorFribonacci[i - 1] + vetorFribonacci[i - 2]; //Calculo de fribonacci
	        }
	        return vetorFribonacci; //retorno com o calculo do vetor
	        }
	 
	public static void  PrintandoVetor(int [] vetorFribonacci, int tamanhoCalculo) {
		for (int mostrar = 0; mostrar <tamanhoCalculo; mostrar++) {
			System.out.println(vetorFribonacci[mostrar]);
		}
		
	}

}
