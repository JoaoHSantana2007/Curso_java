package Exercicios.For.Codigos;

import java.util.Scanner;

public class Exercicio_07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("informe o numero que deseja saber o quadrado e o cubo");
        int n = sc.nextInt();

        int quadrado = 1;
        int cubo = 1;
        for(int i = 1; i <= n; i++){
            quadrado = (int) Math.pow(i,2);
            cubo = (int) Math.pow(i,3);
            System.out.println("\t" + n + "\t" + quadrado + "\t" + cubo);
        }

        sc.close();
    }
}
