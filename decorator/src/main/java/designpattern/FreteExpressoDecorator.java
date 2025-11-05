package designpattern;

public class FreteExpressoDecorator extends PedidoDecorator {

    public FreteExpressoDecorator(Calculavel pedidoDecorado) {
        super(pedidoDecorado);
    }

    @Override
    public double calcularCustoTotal() {
        return super.calcularCustoTotal() + 15.00;
    }
}
