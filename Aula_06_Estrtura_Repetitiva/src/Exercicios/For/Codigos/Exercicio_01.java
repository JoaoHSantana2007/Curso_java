package Exercicios.For.Codigos;

import java.util.Scanner;

public class Exercicio_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero de 0 a 100");
        System.out.println();
        int x = sc.nextInt();
        if(x < 0){
            System.out.println("Erro: X deve valer entre 0 e 100");
        }

        for(int i = x; i <= 100; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

        sc.close();
    }

}
