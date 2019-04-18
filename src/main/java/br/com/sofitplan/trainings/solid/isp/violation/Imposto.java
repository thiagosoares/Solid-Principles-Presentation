package br.com.sofitplan.trainings.solid.isp.violation;

public interface Imposto {

    NotaFiscal geraNota();

    double imposto(double valorCheio);

}
