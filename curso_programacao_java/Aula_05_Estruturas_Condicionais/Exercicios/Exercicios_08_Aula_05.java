package Exercicios;

import java.util.Scanner;

public class Exercicios_08_Aula_05 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double salario;

        System.out.println("Indorme o salario do individuo: ");
        salario = sc.nextDouble();

        if(salario <= 2000.00) {
            System.out.println("Isento");
        }
        else if(salario >= 3000) {
            System.err.printf("imposto = R$%.2f", 1000 * 0.8);
        }

        sc.close();

    }

}
