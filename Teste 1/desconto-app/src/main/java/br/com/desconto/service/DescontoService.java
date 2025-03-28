package br.com.desconto.service;

import br.com.desconto.model.Produto;

public class DescontoService {
    //Calculando o desconto
    public double calcularDesconto(Produto produto, double percentual) {
        if (percentual < 0 || percentual > 100) {
            throw new IllegalArgumentException("Percentual de desconto inválido");
        }
        return produto.getPreco() - (produto.getPreco() * (percentual / 100));
    }

}
