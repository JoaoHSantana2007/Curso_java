package Exercicios.While_Codigos;

import java.util.Scanner;

public class Exercicio_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X, Y;

        System.out.println("Informe as cordenadas X e Y");
        X = sc.nextInt();
        Y = sc.nextInt();

        while(X != 0 && Y != 0) {
            if (X < 0.0 && Y > 0.0) {
                System.out.println("primeiro");
            } else if (X < 0.0 && Y < 0.0) {
                System.out.println("Segundoi");
            } else if (X > 0.0 && Y < 0.0) {
                System.out.println("Terceiro");
            } else if (X > 0.0 && Y > 0.0) {
                System.out.println("Quarto");
            }

            System.out.println();
            System.out.println("Informe as cordenadas X e Y");
            X = sc.nextInt();
            Y = sc.nextInt();
        }

        sc.close();
    }
}
