package br.com.sofitplan.trainings.solid.lsp.solution;

public class ContaDeEstudante {

    private ManipuladorDeSaldo manipulador;

    public ContaDeEstudante() {
        this.manipulador = new ManipuladorDeSaldo();
    }

    public void saca(double valor) {
        manipulador.adiciona(valor);
    }

}
