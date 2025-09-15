package Exercicios.For.Codigos;

import java.util.Scanner;

public class Exercicio_05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o numero que deseja calcular o fatorial");
        int n = sc.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println("Fatorial = " + fatorial);

        sc.close();
    }

}
