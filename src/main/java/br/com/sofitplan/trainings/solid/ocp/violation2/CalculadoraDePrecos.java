package br.com.sofitplan.trainings.solid.ocp.violation2;

import br.com.sofitplan.trainings.solid.ocp.violation.Produto;
import br.com.sofitplan.trainings.solid.ocp.violation.Frete;
import br.com.sofitplan.trainings.solid.ocp.violation.TabelaDePrecoPadrao;

public class CalculadoraDePrecos {

    public double calcula(Produto produto, Regra regra) {

        Frete correios = new Frete();

        double desconto = 0;
        if (Regra.REGRA1.equals(regra)) {
            TabelaDePrecoPadrao tabela =
                    new TabelaDePrecoPadrao();
            desconto = tabela.descontoPara(produto.getValor());
        }
        if (Regra.REGRA2.equals(regra)) {
            TabelaDePrecoDiferenciada tabela =
                    new TabelaDePrecoDiferenciada();
            desconto = tabela.descontoPara(produto.getValor());
        }

        // .......

        double frete = correios.para(produto.getCidade());
        return produto.getValor() * (1 - desconto) + frete;
    }
}
