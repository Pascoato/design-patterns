package designpattern;

public class EmbalagemPresenteDecorator extends PedidoDecorator {

    public EmbalagemPresenteDecorator(Calculavel pedidoDecorado) {
        super(pedidoDecorado);
    }

    @Override
    public double calcularCustoTotal() {
        return super.calcularCustoTotal() + 5.00;
    }
}
