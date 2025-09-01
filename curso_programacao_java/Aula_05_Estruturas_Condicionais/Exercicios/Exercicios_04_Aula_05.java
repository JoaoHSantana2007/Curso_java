package Exercicios;

import java.util.Scanner;

    public class Exercicios_04_Aula_05 {

        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hora1, hora2, resultado;

        System.out.println("Informe a hora de inicio e a hora de temino: ");
        hora1 = sc.nextInt();
        hora2 = sc.nextInt();

        if(hora1 < hora2) {
            resultado = hora2 - hora1;
        }
        else {
            resultado = 24 - hora1 + hora2;
        }

        System.out.printf("Horas jogadas: %d", resultado);

        sc.close();

    }
}
