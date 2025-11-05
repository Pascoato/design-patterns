package designpattern;

public class CalculadoraFretePAC implements CalculadoraFreteStrategy {
    
    @Override
    public double calcular(Pedido pedido) {
        double custoFrete = 10.0 + (pedido.getPesoKg() * 1.5) + (pedido.getDistanciaKm() * 0.10);
        System.out.println("Custo PAC: " + custoFrete);
        return custoFrete;
    }
}
