package br.com.sofitplan.trainings.solid.dip.solution;

import br.com.sofitplan.trainings.solid.dip.violation.NotaFiscal;

public interface AcaoAposGerarNota {

    void executa(NotaFiscal nf);

}
