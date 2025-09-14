package Sintaxe_opcional;

import java.util.Scanner;

public class Operadores_atribuicao_acumulativos {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int minutos = sc.nextInt();
		
		double conta = 50;
		
		if(minutos > 100) {
			conta += (minutos - 100) * 2.0;	
		}
		
		System.out.printf("Conta = %.2f%n", conta);
		
		sc.close();

	}

}
