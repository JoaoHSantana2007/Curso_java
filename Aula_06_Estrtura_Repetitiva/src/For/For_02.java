package For;

import java.util.Scanner;

public class For_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o numero de algarismos que deseja somar.");
        int N = sc.nextInt();

        int soma = 0;
        for(int i = 1; i <= N; i++){
            System.out.println("informe o algarismo " + i);
            int x = sc.nextInt();
            soma += x;
            System.out.println();
        }

        System.out.println("Soma = " + soma);

        sc.close();
    }

}
