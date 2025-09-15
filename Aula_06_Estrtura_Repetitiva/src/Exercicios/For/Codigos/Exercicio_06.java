package Exercicios.For.Codigos;

import java.util.Scanner;

public class Exercicio_06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("informe o numero que deseja saber os divisores");
        int n = sc.nextInt();

        int divisor = 0;
        System.out.println();
        for(int i = 1; i <= n; i++) {
            if(n % i == 0){
                System.out.println(i);
            }
        }

        sc.close();
    }

}
