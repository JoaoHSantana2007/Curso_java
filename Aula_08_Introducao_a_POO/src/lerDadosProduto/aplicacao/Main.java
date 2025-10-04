package lerDadosProduto.aplicacao;

import lerDadosProduto.entidades.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Produto produto = new Produto();
    System.out.println("Inserir produto");
    System.out.print("Nome: ");
    produto.nome = sc.nextLine();
    System.out.print("Preco: ");
    produto.preco = sc.nextDouble();
    System.out.print("Quantidade: ");
    produto.quantidade = sc.nextInt();

    System.out.println();
    System.out.println("Produto dados: " + produto);

    System.out.println();
    System.out.println("Informe o numero de pordutos que deseja acrecentar no estoque: ");
    int quantidade = sc.nextInt();
    produto.addProduto(quantidade);

    System.out.println();
    System.out.println("Produto dados: " + produto);

    System.out.println();
    System.out.println("Informe o numero de pordutos que deseja remover do estoque: ");
    quantidade = sc.nextInt();
    produto.removerProduto(quantidade);

    System.out.println();
    System.out.println("Produto dados: " + produto);

    sc.close();

    }
}
