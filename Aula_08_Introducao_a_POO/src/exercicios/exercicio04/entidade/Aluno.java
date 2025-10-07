package exercicios.exercicio04.entidade;

public class Aluno {

    public String nome;
    public double nota1, nota2, nota3;

    public double notaFinal() {
        return nota1 + nota2 + nota3;
    }

    public double QtFaltaAprovacao() {
        if(notaFinal() < 60.00) {
            return 60.00 - notaFinal();
        }
        else {
            return 0.0;
        }
    }
}
