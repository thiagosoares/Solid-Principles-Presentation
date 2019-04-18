package br.com.sofitplan.trainings.solid.ocp.violation;

public class Frete {
    public double para(Cidade cidade) {
        if("SP".equals(cidade.getCodigo())) {
            return 15;
        }
        return 30;
    }
}
