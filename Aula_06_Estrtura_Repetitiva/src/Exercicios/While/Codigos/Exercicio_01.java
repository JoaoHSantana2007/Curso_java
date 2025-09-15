package Exercicios.While.Codigos;

import java.util.Scanner;

public class Exercicio_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a senha");

        int x = sc.nextInt();

        while(x != 2002) {
            System.out.println("Senha Invalida");
            System.out.println();
            System.out.println("Informe a senha");
            x = sc.nextInt();
        }

        System.out.println("Acesso permitido");

        sc.close();
    }

}
