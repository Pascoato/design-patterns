package gohorse.aplicacaolegada;

public class ApiPagamentoLegado {

    public void realizarCobranca(double valor, String numeroCartao, String cvv) {
        System.out.println("API Legada: Cobrando R$" + valor + " no cartão " + numeroCartao + " (CVV: " + cvv + ")");
    }

}