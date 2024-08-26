package Exercicio;
import java.util.Scanner;
public class Temperatura {

	public static void main(String[] args) {
	double temperatura, faren, kelvin;
	Scanner entrada = new Scanner(System.in);
	System.out.println("Insira a temperatura em celsius");
	temperatura = entrada.nextDouble();
	
	faren = (9*temperatura + 160)/5;
	kelvin = temperatura + 273;
	
	System.out.println("Aqui esta a temperatura em Farenheit " + faren + "°");
	System.out.println("Aqui esta a temperatura em Kelvin " + kelvin + "°");
	}

}
