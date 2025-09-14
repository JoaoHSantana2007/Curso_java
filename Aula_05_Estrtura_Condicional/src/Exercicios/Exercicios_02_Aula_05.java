package Exercicios;

import java.util.Scanner;

public class Exercicios_02_Aula_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int num;
		
		System.out.println("Informe o numero: ");
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.printf("%d EH PAR", num);
		}
		else {
			System.out.printf("%d EH IMPAR", num);
		}
		
		sc.close();
	}
}
