package exercicios.exercicio04.aplicacao;

import exercicios.exercicio04.entidade.Aluno;

import javax.security.auth.login.AccountLockedException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno;
        aluno = new Aluno();

            System.out.println("Informacoes alunos");
            System.out.println("Nome: ");
            aluno.nome = sc.nextLine();

        do {
            System.out.println("Nota Primeiro trimestre: ");
            aluno.nota1 = sc.nextDouble();
            System.out.println("Nota Segundo trimestre: ");
            aluno.nota2 = sc.nextDouble();
            System.out.println("Nota Terceiro trimestre: ");
            aluno.nota3 = sc.nextDouble();
            if (aluno.nota1 > 30 || aluno.nota1 < 0 || aluno.nota2 > 35 || aluno.nota2 < 0 || aluno.nota3 > 35 || aluno.nota3 < 0) {
                System.out.println("Erro Informe as notas da maenira correta, 1 bimestre ate 30 pontos, 2 bimentre e 3 bimestre ate 35 pontos");
            }
        } while (aluno.nota1 > 30 || aluno.nota1 < 0 || aluno.nota2 > 35 || aluno.nota2 < 0 || aluno.nota3 > 35 || aluno.nota3 < 0);

        System.out.println();
        aluno.notaFinal();
        System.out.printf("Nota Final = %.2f\n", aluno.notaFinal());
        if (aluno.notaFinal() < 60.00) {
            System.out.println("Reprovado");
            System.out.printf("Quantidade faltante para aprovacao = %.2f\n", aluno.QtFaltaAprovacao());
        } else {
            System.out.println("Aprovado");
        }

        sc.close();

    }

}
