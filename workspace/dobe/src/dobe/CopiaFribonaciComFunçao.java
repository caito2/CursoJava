package dobe;
import java.util.Scanner;
public class CopiaFribonaciComFunçao {

	public static void main(String[] args) {
		int tamanhoCalculo = 0;
		int	inicializarQTD;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva abaixo ate que numero vai o seu calculo");
		tamanhoCalculo = entrada.nextInt();
		
		System.out.println("Você vai inicializar com quantos numeros ? ");
		inicializarQTD = entrada.nextInt();
		
		int [] vetorFribonacci = PreencherVetorFribonacci (entrada, inicializarQTD, tamanhoCalculo);
		
		 vetorFribonacci = CalculoFribonacci (inicializarQTD, tamanhoCalculo,  vetorFribonacci);
		
		 PrintandoVetor(vetorFribonacci, tamanhoCalculo);
		
	}
	public static int [] PreencherVetorFribonacci (Scanner entrada, int inicializarQTD, int tamanhoCalculo) {
		int [] vetorFribonacci = new int[tamanhoCalculo];
		int j=0;
		while(j < inicializarQTD) {
			System.out.println("Quais são os numeros ? ");
			vetorFribonacci [j] = entrada.nextInt();
			j++;
		}
		
		return vetorFribonacci;
		}
		
	
	 public static int[] CalculoFribonacci(int inicializarQTD, int tamanhoCalculo, int[] vetorFribonacci) {
	        
	        for (int i = inicializarQTD; i < tamanhoCalculo; i++) {
	            vetorFribonacci[i] = vetorFribonacci[i - 1] + vetorFribonacci[i - 2];
	        }
	        return vetorFribonacci;
	        }
	public static void  PrintandoVetor(int [] vetorFribonacci, int tamanhoCalculo) {
		for (int mostrar = 0; mostrar <tamanhoCalculo; mostrar++) {
			System.out.println(vetorFribonacci[mostrar]);
		}
		
	}

}
