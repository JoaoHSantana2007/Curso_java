package Sintaxe_opcional;

import java.util.Scanner;

public class Expresao_condicional_ternaria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double preco = sc.nextDouble();
		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.5;
		
		System.out.println(desconto);
		
		sc.close();
		
	}

}
