package Exercicios;

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int codigo_1, quantidade_1, codigo_2, quantidade_2;
		double valor_1, valor_2, pagamento;
		
		System.out.println("Digite o codigo, quantidade, valor do prudoto 01: ");
		codigo_1 = sc.nextInt();
		quantidade_1 = sc.nextInt();
		valor_1 = sc.nextDouble();
		
		System.out.println("Digite o codigo, quantidade, valor do prudoto 02: ");
		codigo_2 = sc.nextInt();
		quantidade_2 = sc.nextInt();
		valor_2 = sc.nextDouble();
		
		pagamento = (quantidade_1 * valor_1) + (quantidade_2 * valor_2);
		
		System.out.printf("VALOR A SER PAGO = %.2f %n", pagamento);
	}

}
