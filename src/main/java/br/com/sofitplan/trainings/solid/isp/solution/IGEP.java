package br.com.sofitplan.trainings.solid.isp.solution;

import br.com.sofitplan.trainings.solid.isp.violation.Imposto;
import br.com.sofitplan.trainings.solid.isp.violation.NotaFiscal;

public class IGEP implements CalculadorDeImposto {

    public double imposto(double valorCheio) {
        return 0.2 * valorCheio;
    }

}
