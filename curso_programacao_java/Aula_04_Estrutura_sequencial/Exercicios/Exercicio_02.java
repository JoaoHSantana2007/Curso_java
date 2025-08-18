package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, area;
		double pi = 3.14159;
		
		System.out.println("Digite o valor do raio do circulo: ");
		raio = sc.nextDouble();
		
		area = Math.pow(raio,2.0) * pi;
		
		System.out.printf("O valor da area eh: %.4f%n", area);
		
		sc.close();
	}

}
