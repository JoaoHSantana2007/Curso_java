package Exercicios.While.Codigos;

import java.util.Scanner;

public class Exercicio_03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int gasolina = 0;
        int alcool = 0;
        int disel = 0;

        System.out.println("Informe o tipo de combustivel");
        int tipoCombustivel = sc.nextInt();

        while(tipoCombustivel != 4) {
            if(tipoCombustivel < 1 || tipoCombustivel > 4) {
                System.out.println("Erro: Informe um codigo valido");
            } else if (tipoCombustivel == 1) {
                gasolina += 1;
                System.out.println("Registrado com sucesso");
            } else if (tipoCombustivel == 2) {
                alcool += 1;
                System.out.println("Registrado com sucesso");
            } else if (tipoCombustivel == 3) {
                disel += 1;
                System.out.println("Registrado com sucesso");
            }
            System.out.println();
            System.out.println("Informe o tipo de combustivel");
            tipoCombustivel = sc.nextInt();

        }


        System.out.println("Muito obrigado");
        System.out.printf("Gasolina: %d %nAlcool: %d %nDisel: %d %n", gasolina, alcool, disel);

        sc.close();
    }
}
