package Exercicios;

import java.util.Scanner;

public class Exercicios_05_Aula_05 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numProduto, quantidade;
        double valorTotal;

        System.out.println("Informe o numero do item e a quantidade: ");
        numProduto = sc.nextInt();
        quantidade = sc.nextInt();

        if(numProduto == 1) {
            valorTotal = quantidade * 4.00;
        }
        else if(numProduto == 2) {
            valorTotal = quantidade * 4.50;
        }
        else if(numProduto == 3) {
            valorTotal = quantidade * 5.00;
        }
        else if(numProduto == 4) {
            valorTotal = quantidade * 2.00;
        }
        else {
            valorTotal = quantidade * 1.50;
        }

        System.out.printf("Total = R$ %.2f %n", valorTotal);

        sc.close();
    }

}
