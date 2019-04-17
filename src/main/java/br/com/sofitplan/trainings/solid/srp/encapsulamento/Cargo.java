package br.com.sofitplan.trainings.solid.srp.encapsulamento;

import br.com.sofitplan.trainings.solid.srp.encapsulamento.regras.QuinzeOuVinteCincoPorCento;
import br.com.sofitplan.trainings.solid.srp.encapsulamento.regras.DezOuVintePorCento;

public enum Cargo {

    DBA(new QuinzeOuVinteCincoPorCento()),
    TESTER(new QuinzeOuVinteCincoPorCento()),
    DESENVOLVEDOR(new DezOuVintePorCento());

    private RegraDeCalculo regra;

    Cargo(RegraDeCalculo regra) {
        this.regra = regra;
    }

    public RegraDeCalculo getRegra() {
        return regra;
    }

}
