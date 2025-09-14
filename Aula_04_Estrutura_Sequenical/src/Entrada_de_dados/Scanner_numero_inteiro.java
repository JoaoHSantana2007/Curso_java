package Entrada_de_dados;

import java.util.Scanner;

public class Scanner_numero_inteiro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		x = sc.nextInt();
		
		System.out.println("Voce digitou: " + x);
		
		sc.close();

	}

}
