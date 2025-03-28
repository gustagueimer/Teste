package br.com.desconto;


import br.com.desconto.model.Produto;
import br.com.desconto.service.DescontoService;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DescontoService service = new DescontoService();

        System.out.println("Digite o nome do produto:");
        String nome = scanner.nextLine();

        System.out.println("Digite o preço do produto:");
        double preco = scanner.nextDouble();

        System.out.println("Digite o percentual de desconto:");
        double percentual = scanner.nextDouble();

        Produto produto = new Produto(nome, preco);
        double precoComDesconto = service.calcularDesconto(produto, percentual);

        System.out.println("Preço final com desconto: " + precoComDesconto);
    }

}
