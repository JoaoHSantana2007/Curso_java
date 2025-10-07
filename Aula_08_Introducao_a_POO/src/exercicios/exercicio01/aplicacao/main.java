package exercicios.exercicio01.aplicacao;

import exercicios.exercicio01.entidades.ConverterDolar;

import java.util.Locale;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do dolar: ");
        double valorDolar = sc.nextDouble();
        System.out.println("Informe a quantidade de dolares que deseja compra:");
        double quantidade = sc.nextDouble();
        double resultado = ConverterDolar.valorcompra(valorDolar, quantidade);
        System.out.printf("Valor total da compra: %.2f", resultado);

        sc.close();
    }

}
