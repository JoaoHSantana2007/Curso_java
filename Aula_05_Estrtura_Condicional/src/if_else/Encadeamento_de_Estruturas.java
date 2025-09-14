package if_else;

import java.util.Scanner;

public class Encadeamento_de_Estruturas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int horas;
		
		System.out.println("Que Horas?");
		horas = sc.nextInt();
		
		if(horas < 12) {
			System.out.println("Bom Dia!");
		}else {
			if(horas < 18) {
				System.out.println("Boa Tarde!");
			}else {
				System.out.println("Boa noite!");
			}
		}

	}

}

