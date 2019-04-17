package br.com.sofitplan.trainings.solid.srp.solution.regras;

import br.com.sofitplan.trainings.solid.srp.solution.Funcionario;
import br.com.sofitplan.trainings.solid.srp.solution.RegraDeCalculo;

public class DezOuVintePorCento implements RegraDeCalculo {

    public double calcula(Funcionario funcionario) {
        if(funcionario.getSalarioBase() > 3000.0) {
            return funcionario.getSalarioBase() * 0.9;
        } else {
            return funcionario.getSalarioBase() * 0.8;
        }
    }

}
