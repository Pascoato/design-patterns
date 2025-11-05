package designpattern;

public abstract class PedidoDecorator implements Calculavel {

    protected Calculavel pedidoDecorado;

    public PedidoDecorator(Calculavel pedidoDecorado) {
        this.pedidoDecorado = pedidoDecorado;
    }

    @Override
    public double calcularCustoTotal() {
        return pedidoDecorado.calcularCustoTotal();
    }
    
    @Override
    public double getPrecoBase() {
        return pedidoDecorado.getPrecoBase();
    }
}
