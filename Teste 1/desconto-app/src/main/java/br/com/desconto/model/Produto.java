package br.com.desconto.model;

public class Produto {
    //Declara duas variáveis privadas
    private String nome;
    private double preco;

    //Contrutor da Clase
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    //Acessando os valores da variaveis
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
}
