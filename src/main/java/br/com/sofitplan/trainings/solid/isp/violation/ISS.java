package br.com.sofitplan.trainings.solid.isp.violation;

public class ISS implements Imposto {

    public double imposto(double valorCheio) {
        return 0.1 * valorCheio;
    }

    public NotaFiscal geraNota() {
        return new NotaFiscal(
                "Stark Industries",
                900000000F
        );
    }
}
