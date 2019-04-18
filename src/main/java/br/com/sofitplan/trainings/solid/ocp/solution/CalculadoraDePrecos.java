package br.com.sofitplan.trainings.solid.ocp.solution;

import br.com.sofitplan.trainings.solid.ocp.violation.Produto;

public class CalculadoraDePrecos {

    private TabelaDePreco tabela;
    private ServicoDeEntrega entrega;

    public CalculadoraDePrecos(TabelaDePreco tabela, ServicoDeEntrega entrega) {
        this.tabela = tabela;
        this.entrega = entrega;
    }

    public double calcula(Produto produto) {
        //TabelaDePrecoPadrao tabela = new TabelaDePrecoPadrao();
        //Frete correios = new Frete();

        double desconto = tabela.descontoPara(produto.getValor());

        double frete = entrega.para(produto.getCidade());
        return produto.getValor() * (1 - desconto) + frete;
    }
}
