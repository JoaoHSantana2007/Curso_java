package funcaoSintaxe;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe 3 numeros para serem analisados");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int result = max(n1, n2, n3);

        infResult(result);

        sc.close();
    }

    public static int max(int a, int b, int c) {
        int temp;

        if(a > b && a > b) {
            temp = a;
        } else if(b > a && b > c) {
            temp = b;
        } else {
            temp = c;
        }

        return temp;
    }

    public static void infResult(int a) {
        System.out.println("Heith number is: " + a);
    }
}
