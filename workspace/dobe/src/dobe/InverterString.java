package dobe;

import java.util.Scanner;

public class InverterString {
	public static void main(String[] args) {
		String normal;
		String inverter = "";
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira a palavra que vc quer inverter");
		normal = entrada.next();
		for(int i =normal.length() -1; i>=0; i-- ) {
			inverter += normal.charAt(i);
		}
		System.out.println("Aqui está a palavra invertida  " + inverter);
	}
}
