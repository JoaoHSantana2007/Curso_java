package Exercicios;

import java.util.Scanner;

public class Exercicios_03_Aula_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n1, n2;
		
		System.out.println("Informe o n1 e o n2: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if(n1 % n2 == 0) {
			System.out.printf("%d e %d SAO MULTIPLOS", n1, n2);
		}
		else {
			System.out.printf("%d e %d NAO SAO MULTIPLOS", n1, n2);
		}
		
		sc.close();
	}

}
