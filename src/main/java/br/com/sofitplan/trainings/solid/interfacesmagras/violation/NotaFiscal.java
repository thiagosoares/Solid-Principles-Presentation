package br.com.sofitplan.trainings.solid.interfacesmagras.violation;

import java.util.List;

public class NotaFiscal {

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
}
