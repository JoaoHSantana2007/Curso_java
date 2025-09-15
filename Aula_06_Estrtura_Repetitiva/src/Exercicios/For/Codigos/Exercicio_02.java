package Exercicios.For.Codigos;

import java.util.Scanner;

public class Exercicio_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero de algarismos a ser analizado");
        int N = sc.nextInt();
        System.out.println();

        int in = 0;
        int out = 0;
        int x;
        for(int i = 0; i < N; i++){
            System.out.println("Informe o algarismo " + i);
            x = sc.nextInt();
            if(x >= 10 && x <= 20){
                in += 1;
            } else{
                out += 1;
            }
            System.out.println();
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }

}
