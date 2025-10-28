package gohorse.aplicacaolegada;

import gohorse.aplicacaomoderna.INovoGatewayPagamento;

public class ServicoPagamento {

    public void pagarPedido(INovoGatewayPagamento gatewayModerno, ApiPagamentoLegado gatewayLegado,
                            double valor, String cartao, String cvv, boolean usarLegado) {

        if (usarLegado) {
            System.out.println("Usando gateway legado...");
            gatewayLegado.realizarCobranca(valor, cartao, cvv);
            System.out.println("Pagamento (legado) finalizado.");
        } else {
            System.out.println("Usando gateway moderno...");
            boolean sucesso = gatewayModerno.processarPagamento(cartao, valor);
            System.out.println("Pagamento (moderno) finalizado: " + sucesso);
        }
    }
}
