package areaTriangulo.entidades;

public class Triangulo {

    public double A;
    public double B;
    public double C;

    public double calcularArea() {
        double p = (A + B + C) / 2;
        return Math.sqrt(p * (p - A) * (p - B) * (p - C));
    }
}

