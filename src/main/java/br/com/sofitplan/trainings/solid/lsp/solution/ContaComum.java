package br.com.sofitplan.trainings.solid.lsp.solution;

public class ContaComum {

    private ManipuladorDeSaldo manipulador;

    public ContaComum() {
        this.manipulador = new ManipuladorDeSaldo();
    }
    public void saca(double valor) {
        manipulador.adiciona(valor);
    }

    public void rende() {
        manipulador.juros(0.1);
    }
}
