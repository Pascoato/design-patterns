package gohorse.aplicacaomoderna;

public class GatewayPagamentoModerno implements INovoGatewayPagamento {

    @Override
    public boolean processarPagamento(String cartaoCredito, double valorTotal) {
        System.out.println("Gateway Moderno: Processando R$" + valorTotal + " no cartão " + cartaoCredito);
        return true;
    }

}
