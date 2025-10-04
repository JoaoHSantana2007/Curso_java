package areaTriangulo.aplicacao;

import areaTriangulo.entidades.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Informe o valor dos lados X");
        x.A = sc.nextDouble();
        x.B = sc.nextDouble();
        x.C = sc.nextDouble();

        System.out.println("Informe o valor dos lados Y");
        y.A = sc.nextDouble();
        y.B = sc.nextDouble();
        y.C = sc.nextDouble();

        double areax = x.calcularArea();
        double areay = y.calcularArea();

        System.out.printf("Area X = %.4f\n", areax);
        System.out.printf("Area Y = %.4f\n", areay);

        if(areax > areay) {
            System.out.println("Maior area triangulo X");
        } else {
            System.out.println("Maior area triangulo Y");
        }

        sc.close();

    }

}
