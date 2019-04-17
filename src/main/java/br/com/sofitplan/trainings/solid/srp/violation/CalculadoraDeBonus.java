package br.com.sofitplan.trainings.solid.srp.violation;

import static br.com.sofitplan.trainings.solid.srp.violation.Cargo.*;

public class CalculadoraDeBonus {

    public double calcula(Funcionario funcionario) {
        if(DESENVOLVEDOR.equals(funcionario.getCargo())) {
            return dezOuVintePorcento(funcionario);
        }
        if(DBA.equals(funcionario.getCargo()) ||
                TESTER.equals(funcionario.getCargo())) {
            return quinzeOuVinteCincoPorcento(funcionario);
        }
        throw new RuntimeException("Cargo invalido");
    }

    private double dezOuVintePorcento(Funcionario funcionario) {
        if(funcionario.getSalarioBase() > 3000.0) {
            return funcionario.getSalarioBase() * 0.9;
        } else {
            return funcionario.getSalarioBase() * 0.8;
        }
    }

    private double quinzeOuVinteCincoPorcento(Funcionario funcionario) {
        if(funcionario.getSalarioBase() > 3000.0) {
            return funcionario.getSalarioBase() * 0.85;
        } else {
            return funcionario.getSalarioBase() * 0.75;
        }
    }
}
