package br.com.sofitplan.trainings.solid.dip.violation;

public class GeradorDeNotaFiscal {

    private final EnviadorDeEmail email;
    private final NotaFiscalDao dao;

    public GeradorDeNotaFiscal(EnviadorDeEmail email,
                               NotaFiscalDao dao) {
        this.email = email;
        this.dao = dao;
    }

    public NotaFiscal gerarNota(Fatura fatura) {
        double valor = fatura.getValorMensal();

        NotaFiscal nf = new NotaFiscal(
                valor,
                calculaImpostoSimples(valor)
        );

        email.enviaEmail(nf);
        dao.persiste(nf);

        return nf;
    }

    private double calculaImpostoSimples(double valor) {
        return valor * 0.06;
    }

}

