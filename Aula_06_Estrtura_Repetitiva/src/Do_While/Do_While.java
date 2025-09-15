package Do_While;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Do_While {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double C;

        char resp;
        do {
            System.out.print("Informe a temperatura em graus celcius: ");
            C = sc.nextDouble();

            double F = (double) 9 * C / 5 + 32;

            System.out.printf("Temperatura em Fahrenheit %.1f\n", F);
            System.out.println();

            System.out.print("Deseja repetir (s/n)");
            resp = sc.next().charAt(0);
        } while (resp != 'n');

        sc.close();
    }

}
