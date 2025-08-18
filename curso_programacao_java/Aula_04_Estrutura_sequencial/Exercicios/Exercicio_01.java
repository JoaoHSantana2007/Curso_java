package Exercicios;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, soma;
		
		System.out.println("Digite o valor de n1: ");
		n1 = sc.nextInt();
		
		System.out.println("Digite o valor de n2: ");
		n2 = sc.nextInt();
		
		soma = n1 + n2;
		
		System.out.println("O resulrtado de soma eh: " + soma);
		
		sc.close();
	}

}
