package exercicios.exercicio02.aplicacao;

import exercicios.exercicio02.entidades.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo X;
        X = new Retangulo();

        System.out.println("Informe a altura do retangulo:");
        X.altura = sc.nextDouble();
        System.out.println("Informe a largura do retangulo:");
        X.largura = sc.nextDouble();

        System.out.println("Area = " + X.area());
        System.out.println("Perimetro = " + X.perimetro());
        System.out.println("Diagonal = " + X.diagonal());

        sc.close();

    }

}
