package Exercicios;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n_fun, horas;
		double salario;
		
		System.out.println("Digite o numero do funcionario: ");
		n_fun = sc.nextInt();
		
		System.out.println("Digite a quantidade de horas trabalahadas pelo funcionario: ");
		horas = sc.nextInt();
		
		System.out.println("Digite o Valor da hora pago ou funcionario: ");
		salario = sc.nextDouble();
		
		salario *= horas;
		
		System.out.println();
		System.out.printf("Numero do funcionario = %d %n Salrio do funcionario = %.2f %n", n_fun, salario);
		
		sc.close(); 

	}

}
