package designpattern;

public interface CalculadoraFreteStrategy {

    /**
     * @param pedido
     * @return frete.
     */
    double calcular(Pedido pedido);
}
