package designpattern;

public class Pedido implements Calculavel {

    private final double precoBase;

    public Pedido(double precoBase) {
        this.precoBase = precoBase;
    }

    @Override
    public double calcularCustoTotal() {
        return this.precoBase;
    }

    @Override
    public double getPrecoBase() {
        return this.precoBase;
    }
}
