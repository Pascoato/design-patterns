package designpattern;

public class CalculadoraFreteSEDEX implements CalculadoraFreteStrategy {

    @Override
    public double calcular(Pedido pedido) {
        double custoFrete = 25.0 + (pedido.getPesoKg() * 3.0) + (pedido.getDistanciaKm() * 0.20);
        System.out.println("Custo SEDEX: " + custoFrete);
        return custoFrete;
    }
}
