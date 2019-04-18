package br.com.sofitplan.trainings.solid.interfacesmagras.solution;

import br.com.sofitplan.trainings.solid.interfacesmagras.violation.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NotaFiscal implements Tributavel {

    public NotaFiscal(
            Cliente cliente,
            List<Item> itens,
            List<Desconto> descontos,
            Endereco entrega,
            Endereco cobranca,
            FormaDePagamento pagto,
            double valorTotal
    ) {

    }

    public Item[] getItens() {
        return new Item[0];
    }

    public List<Item> itensASeremTributados() {
        return Collections.singletonList(new Item());
    }
}
