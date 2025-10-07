package exercicios.exercicio03.aplicacao;

import exercicios.exercicio03.entidades.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario X;
        X = new Funcionario();

        System.out.println("Informe o nome do funcionario");
        X.nome = sc.nextLine();
        System.out.println("Informe o salario bruto do funcionario");
        X.salarioBruto = sc.nextDouble();
        System.out.println("Informe a taxa do salario do funcionario");
        X.taxa = sc.nextDouble();

        System.out.println();
        System.out.println("Dados: " + X);
        System.out.println();
        System.out.println("Comisao do funcionario:");
        double porcentagem = sc.nextDouble();
        System.out.println();
        X.acrecentarSalario(porcentagem);
        System.out.println("Dados Atualizados: " + X);


    }

}
