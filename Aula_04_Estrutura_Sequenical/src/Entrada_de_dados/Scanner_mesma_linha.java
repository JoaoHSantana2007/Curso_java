package Entrada_de_dados;

import java.util.Scanner;

public class Scanner_mesma_linha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Dados digitado: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}

}
