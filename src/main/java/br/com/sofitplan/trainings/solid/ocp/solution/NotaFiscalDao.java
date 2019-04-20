package br.com.sofitplan.trainings.solid.ocp.solution;

import br.com.sofitplan.trainings.solid.ocp.violation.NotaFiscal;

public class NotaFiscalDao implements AcaoAposGerarNota {

    public void persiste(NotaFiscal nf) {

    }

    @Override
    public void executa(NotaFiscal nf) {
        persiste(nf);
    }
}
