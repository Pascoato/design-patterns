package designpattern;

public class CalculadoraFreteTransportadora implements CalculadoraFreteStrategy {

    @Override
    public double calcular(Pedido pedido) {
        double taxaBase = 50.0;
        double volume = (pedido.getPesoKg() / 5.0);
        double custoFrete = taxaBase + (volume * 10.0) + (pedido.getDistanciaKm() * 0.05);
        System.out.println("Custo Transportadora: " + custoFrete);
        return custoFrete;
    }
}
