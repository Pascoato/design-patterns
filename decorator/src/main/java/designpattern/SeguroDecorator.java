package designpattern;

public class SeguroDecorator extends PedidoDecorator {

    public SeguroDecorator(Calculavel pedidoDecorado) {
        super(pedidoDecorado);
    }

    @Override
    public double calcularCustoTotal() {
        double custoSeguro = super.getPrecoBase() * 0.02;
        return super.calcularCustoTotal() + custoSeguro;
    }
}
