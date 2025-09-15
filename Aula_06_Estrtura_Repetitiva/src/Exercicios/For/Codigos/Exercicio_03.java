package Exercicios.For.Codigos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_03 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Inforem o numero de casos");
        int x = sc.nextInt();
        double soma;
        double resultado;
        double n1;
        double n2;
        double n3;

        for(int i = 1; i <= x; i++) {
            System.out.println();
            System.out.println("Informe os 3 numeros do caso " + i);
            n1 = sc.nextDouble() * 2;
            n2 = sc.nextDouble() * 3;
            n3 = sc.nextDouble() * 5;
            soma = n1 + n2 + n3;
            resultado = soma / 10;
            System.out.printf("Media ponderada %.1f %n", resultado);
        }

        sc.close();
    }

}
