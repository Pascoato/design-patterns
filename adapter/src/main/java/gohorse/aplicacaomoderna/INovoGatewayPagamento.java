package gohorse.aplicacaomoderna;

public interface INovoGatewayPagamento {

    boolean processarPagamento(String cartaoCredito, double valorTotal);

}
