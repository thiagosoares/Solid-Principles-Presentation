package br.com.sofitplan.trainings.solid.ocp.violation2;

import br.com.sofitplan.trainings.solid.ocp.violation.Cidade;

public class Frete {
    public double para(Cidade cidade, Regra regra) {

        if (Regra.REGRA1.equals(regra)) {

            if("SP".equals(cidade.getCodigo())) {
                return 15;
            }
            return 30;

        } else if (Regra.REGRA2.equals(regra)) {
            // .....
        } else if (Regra.REGRA3.equals(regra)) {
            // .....
        } else if (Regra.REGRA4.equals(regra)) {
            // .....
        }

        return 50;
    }
}
