package Exercicios;

import java.util.Scanner;

public class Exercicio_01_Aula_05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Informe o numero: ");
		num = sc.nextInt();
		
		if(num < 0) {
			System.out.printf("%d eh NEGATIVO %n", num);
		}
		else {
			System.out.printf("%d eh NAO NEGATIVO %n", num);
		}
		
		sc.close();
		
	}
}
