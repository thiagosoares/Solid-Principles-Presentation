package br.com.sofitplan.trainings.solid.interfacesmagras.solution;

import br.com.sofitplan.trainings.solid.interfacesmagras.violation.Item;

public class CalculadorDeImposto {

    public double calcula(Tributavel nf) {
        double total = 0;
        for (Item item : nf.itensASeremTributados()) {
            if (item.getValor() > 1000)
                total += item.getValor() * 0.02;
            else
                total += item.getValor() * 0.01;
        }
        return total;
    }

}
