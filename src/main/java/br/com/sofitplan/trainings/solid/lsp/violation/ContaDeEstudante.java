package br.com.sofitplan.trainings.solid.lsp.violation;

public class ContaDeEstudante extends ContaComum {

    public void rende() throws ContaNaoRendeException {
        throw new ContaNaoRendeException();
    }

}
