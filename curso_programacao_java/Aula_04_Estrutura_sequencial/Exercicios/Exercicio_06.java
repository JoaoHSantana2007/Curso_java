package Exercicios;

import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.println("Digite os valores de a, b, c: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		System.out.printf("Area do triangulo retangulo = %.3f %n", ((a * c) / 2));
		System.out.printf("Area do circulo = %.3f %n", (Math.pow(c,2) * Math.PI));
		System.out.printf("Area do trapazio = %.3f %n", ((a + b) * c / 2));
		System.out.printf("Area do quadrado = %.3f %n", Math.pow(b,2));
		System.out.printf("Area do retangulo = %.3f %n", a * b);
		
		sc.close();
	}

}