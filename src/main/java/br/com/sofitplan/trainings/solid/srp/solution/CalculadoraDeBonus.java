package br.com.sofitplan.trainings.solid.srp.solution;

import br.com.sofitplan.trainings.solid.srp.solution.regras.DezOuVintePorCento;
import br.com.sofitplan.trainings.solid.srp.solution.regras.QuinzeOuVinteCincoPorCento;

import static br.com.sofitplan.trainings.solid.srp.violation.Cargo.*;

public class CalculadoraDeBonus {

    public double calcula(Funcionario funcionario) {
        if(DESENVOLVEDOR.equals(funcionario.getCargo())) {
            return new DezOuVintePorCento().calcula(funcionario);
        }
        if(DBA.equals(funcionario.getCargo()) ||
                TESTER.equals(funcionario.getCargo())) {
            return new QuinzeOuVinteCincoPorCento().calcula(funcionario);
        }
        throw new RuntimeException("Cargo invalido");
    }

}
