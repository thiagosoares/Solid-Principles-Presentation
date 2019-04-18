package br.com.sofitplan.trainings.solid.isp.violation;

public class IGEP implements Imposto {

    public double imposto(double valorCheio) {
        return 0.2 * valorCheio;
    }

    public NotaFiscal geraNota() {
        return null;
    }
}
