package br.com.sofitplan.trainings.solid.srp.encapsulamento;

public class CalculadoraDeBonus {

    public double calcula(Funcionario funcionario) {

        return funcionario.getCargo().getRegra().calcula(funcionario);

    }

}
