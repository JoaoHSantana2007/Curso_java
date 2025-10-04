package resolvendoProbelmaSemPOO;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC;
        double yA, yB, yC;

        System.out.println("Informe o valor dos lados X");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Informe o valor dos lados Y");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double pX = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));

        double pY = (yA + yB + yC) / 2;
        double areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));

        System.out.printf("Area X = %.4f\n", areaX);
        System.out.printf("Area Y = %.4f\n", areaY);

        if(areaX > areaY) {
            System.out.println("Maior area triangulo X");
        } else {
            System.out.println("Maior area triangulo Y");
        }

        sc.close();

    }

}
