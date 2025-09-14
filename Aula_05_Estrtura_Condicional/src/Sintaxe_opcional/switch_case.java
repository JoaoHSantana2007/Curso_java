package Sintaxe_opcional;

import java.util.Scanner;

public class switch_case {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia;
		
		switch(x) {
		case 1:
			dia = "segunda";
			break;
		case 2: 
			dia = "terca";
			break;
		case 3:
			dia = "quarta";
			break;
		case 4: 
			dia = "quinta";
			break;
		case 5:
			dia = "sexta";
			break;
		case 6: 
			dia = "sabado";
			break;
		case 7:
			dia = "domingo";
			break;
		default:
			dia = "Valor invalido";
			break;
		}
		
		System.out.println("Dia da semana: " + dia);
		
		sc.close();
	}

}
