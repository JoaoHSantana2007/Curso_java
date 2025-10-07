package exercicios.exercicio01.entidades;

public class ConverterDolar {

    public static double IOF = 0.06;

    public static double valorcompra(double valorDolar, double quantidade) {
        return (valorDolar * quantidade) * (1.0 + IOF);
    }
}
