package Exercicios;

import java.util.Scanner;

public class Exercicios_07_Aula_05 {

    public static void main(String[] var0) {
        Scanner sc = new Scanner(System.in);

        double X, Y;

        System.out.println("Informe as cordenadas de X e Y: ");
        X = sc.nextDouble();
        Y = sc.nextDouble();

        if (X == 0.0 && Y == 0.0) {
            System.out.println("Origem");
        } else if (X == 0.0) {
            System.out.println("EiXo X");
        } else if (Y == 0.0) {
            System.out.println("EiXo Y");
        } else if (X < 0.0 && Y > 0.0) {
            System.out.println("Q1");
        } else if (X < 0.0 && Y < 0.0) {
            System.out.println("Q2");
        } else if (X > 0.0 && Y < 0.0) {
            System.out.println("Q3");
        } else if (X > 0.0 && Y > 0.0) {
            System.out.println("Q4");
        }

        sc.close();
    }
}