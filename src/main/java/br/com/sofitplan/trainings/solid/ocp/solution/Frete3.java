package br.com.sofitplan.trainings.solid.ocp.solution;

import br.com.sofitplan.trainings.solid.ocp.violation.Cidade;

public class Frete3 implements ServicoDeEntrega {
    @Override
    public double para(Cidade cidade) {
        return 0;
    }
}
