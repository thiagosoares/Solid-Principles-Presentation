package br.com.sofitplan.trainings.solid.dip.solution;

import br.com.sofitplan.trainings.solid.dip.violation.NotaFiscal;

public class NotaFiscalDao implements AcaoAposGerarNota {

    public void persiste(NotaFiscal nf) {

    }

    @Override
    public void executa(NotaFiscal nf) {
        persiste(nf);
    }
}
