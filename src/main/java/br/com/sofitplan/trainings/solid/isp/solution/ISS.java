package br.com.sofitplan.trainings.solid.isp.solution;

import br.com.sofitplan.trainings.solid.isp.violation.Imposto;
import br.com.sofitplan.trainings.solid.isp.violation.NotaFiscal;

public class ISS implements CalculadorDeImposto, GeradorDeNota {

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
