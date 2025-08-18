package Entrada_de_dados;

import java.util.Locale;
import java.util.Scanner;

public class Scanner_numero_flutuante {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();
		
		System.out.println("Voce digitou: " + x);
		System.out.printf("Voce digitou: %.2f%n", x);
		
		sc.close();

	}

}
