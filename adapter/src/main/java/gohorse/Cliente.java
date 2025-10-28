package gohorse;

import gohorse.aplicacaolegada.ApiPagamentoLegado;
import gohorse.aplicacaolegada.ServicoPagamento;
import gohorse.aplicacaomoderna.GatewayPagamentoModerno;
import gohorse.aplicacaomoderna.INovoGatewayPagamento;

public class Cliente {
    public static void main(String[] args) {
        ServicoPagamento servico = new ServicoPagamento();
        INovoGatewayPagamento moderno = new GatewayPagamentoModerno();
        ApiPagamentoLegado legado = new ApiPagamentoLegado();


        servico.pagarPedido(moderno, legado, 100.0, "1111...", "123", false);

        servico.pagarPedido(moderno, legado, 200.0, "2222...", "456", true);
    }
}
