package br.com.sofitplan.trainings.solid.ocp.violation;

public class CalculadoraDePrecos {

    public double calcula(Produto produto) {
        TabelaDePrecoPadrao tabela = new TabelaDePrecoPadrao();
        Frete correios = new Frete();

        double desconto = tabela.descontoPara(produto.getValor());

        double frete = correios.para(produto.getCidade());
        return produto.getValor() * (1 - desconto) + frete;
    }
}
