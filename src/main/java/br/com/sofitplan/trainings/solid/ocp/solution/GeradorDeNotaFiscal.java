package br.com.sofitplan.trainings.solid.ocp.solution;

import br.com.sofitplan.trainings.solid.ocp.violation.Fatura;
import br.com.sofitplan.trainings.solid.ocp.violation.NotaFiscal;

import java.util.List;

public class GeradorDeNotaFiscal {

    private final List<AcaoAposGerarNota> acoes;

    public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes) {
        this.acoes = acoes;
    }
    public NotaFiscal gerarNota(Fatura fatura) {
        double valor = fatura.getValorMensal();
        NotaFiscal nf = new NotaFiscal(
                valor,
                calculaImpostoSimples(valor)
        );

        for(AcaoAposGerarNota acao : acoes) {
            acao.executa(nf);
        }
        return nf;
    }

    private double calculaImpostoSimples(double valor) {
        return valor * 0.06;
    }
}
