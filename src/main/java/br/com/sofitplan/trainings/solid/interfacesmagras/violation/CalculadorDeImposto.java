package br.com.sofitplan.trainings.solid.interfacesmagras.violation;

public class CalculadorDeImposto {

    public double calcula(NotaFiscal nf) {
        double total = 0;
        for(Item item : nf.getItens()) {
            if(item.getValor()>1000)
                total+= item.getValor() * 0.02;
            else
                total+= item.getValor() * 0.01;
        }
        return total;
    }

}
