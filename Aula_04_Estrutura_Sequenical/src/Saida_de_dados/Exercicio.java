package Saida_de_dados;

import java.util.Locale;

public class Exercicio {

	public static void main(String[] args) {
		
		String produto1 = "Computador";
		String produto2 = "Mesa de escritorio";
		
		int idade = 30;
		int codigo = 5290;
		char genero = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.234567;
		
		System.out.println("Produtos:");
		
		System.out.printf("%s, cujo preco eh R$ %.2f%n", produto1, preco1);
		System.out.printf("%s, cujo preco eh R$ %.2f%n", produto2, preco2);
		
		System.out.println();
		System.out.printf("Registro: %d anos, codigo %d e genero: %c%n", idade, codigo, genero);

		System.out.println();
		System.out.printf("Medida com oito casas decimai: %.8f%n", medida);
		System.out.printf("Aredondado (com 3 casas decimais): %.3f%n", medida);
		Locale.setDefault(Locale.US);
		System.out.printf("Ponto decimal americano: %.3f%n", medida);
		
	}

}
