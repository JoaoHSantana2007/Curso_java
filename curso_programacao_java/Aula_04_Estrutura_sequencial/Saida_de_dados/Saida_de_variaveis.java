package Saida_de_dados;

// Para que os numeros de flutuante tenham separador . inves de , devemos importar.
import java.util.Locale;
// Apos importa a bilbioteca devemos escrever o seguinte comando
// Locale.setDefault(Locale.US);

public class Saida_de_variaveis {

	public static void main(String[] args) {
		
		// Variavel de tipo interia.
		
		int y = 32;
		
		System.out.println(y);
		
		// Variavel de Ponto Flutuante.
		
		double x = 10.35784;
		
		System.out.println(x);
		
		/* printf -> Imprime algo formatado.
		   Para delimitar a formatacao deve escrever %. 'n° de algarismos imprissos'f 
		   												EX: %.2f
		   Para quebrar a linha colocase o %n.
		*/
		
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		// Impresso com separador ponto.
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
	}

}
