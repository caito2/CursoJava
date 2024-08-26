package ProgramasSequenciais;
import java.util.Scanner;
public class Temperatura {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero, fahrenheit, kelvin;
		System.out.println("Insira a temperatura em Celsius");
		numero = entrada.nextInt();
		fahrenheit = (9*numero + 160)/5;
		kelvin = numero + 273;
		
		System.out.println("Aqui está o seu numero em Fahrenheit  " + fahrenheit);
		System.out.println("Aqui está o seu numero em Kelvin  " + kelvin);
	}

}
