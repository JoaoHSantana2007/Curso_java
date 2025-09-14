package Exercicios;

import java.util.Scanner;

public class Exercicios_06_Aula_05 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Informe o numero: ");
        numero = sc.nextInt();

        if(numero < 0 || numero > 100) {
            System.out.println("Numero invalido %n informe um numero enntre 0 e 100");
        }
        else if(numero < 25) {
            System.out.println("Intervalo = De 0 a 25");
        }
        else if(numero < 50) {
            System.out.println("Intervalo = De 25 a 50");
        }
        else if(numero < 75) {
            System.out.println("Intervalo = De 50 a 75");
        }
        else if(numero < 100) {
            System.out.println("Intervalo = De 75 a 100");
        }
        else {
            System.out.println("Numero invalido informe um numero enntre 0 e 100");
        }

        sc.close();

    }

}
