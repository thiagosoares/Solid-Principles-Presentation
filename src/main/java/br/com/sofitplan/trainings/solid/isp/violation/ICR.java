package br.com.sofitplan.trainings.solid.isp.violation;

public class ICR implements Imposto {

    public double imposto(double valorCheio) {
        return 0.2 * valorCheio;
    }

    public NotaFiscal geraNota() {
        throw new NaoGeraNotaException();
    }
}
