package Operadores_Bitwise;

import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int mask = 0b00100000;
        int n = sc.nextInt();

        if((n & mask) != 0){
            System.out.println("6th bit eh verdadeiro");
        } else {
            System.out.println("6th bit eh falso");
        }

    }

}
