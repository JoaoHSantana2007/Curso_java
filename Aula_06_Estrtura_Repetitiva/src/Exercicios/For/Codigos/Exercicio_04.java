package Exercicios.For.Codigos;

import java.util.Scanner;

public class Exercicio_04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o numero de Pares a serem analizados");
        int x = sc.nextInt();

        int n1;
        int n2;
        double resultado;

        for(int i = 1; i <= x; i++){
            System.out.println();
            System.out.println("Informe os dois numeros do Par: " + i);
            n1 = sc.nextInt();
            n2 = sc.nextInt();

            if(n2 == 0){
                System.out.println("Divisao impossivel");
            } else {
                resultado = (double)n1 / n2;
                System.out.printf("Resultado = %.1f", resultado);
            }

            System.out.println();
        }

        sc.close();
    }

}
