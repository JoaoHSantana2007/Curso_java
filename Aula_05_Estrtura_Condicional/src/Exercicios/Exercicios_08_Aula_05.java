package Exercicios;

import java.util.Scanner;

public class Exercicios_08_Aula_05 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double salario, imposto;

        System.out.println("Indorme o salario do individuo: ");
        salario = sc.nextDouble();

        if (salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();

    }

}
