package br.com.sofitplan.trainings.solid.dip.solution;

import br.com.sofitplan.trainings.solid.dip.violation.Fatura;
import br.com.sofitplan.trainings.solid.dip.violation.NotaFiscal;

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
