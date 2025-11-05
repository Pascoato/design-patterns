package designpattern;

public class Pedido {

    private final double pesoKg;
    private final double distanciaKm;
    
    private CalculadoraFreteStrategy strategy;

    public Pedido(double pesoKg, double distanciaKm) {
        this.pesoKg = pesoKg;
        this.distanciaKm = distanciaKm;
    }

    public void setStrategy(CalculadoraFreteStrategy strategy) {
        this.strategy = strategy;
    }

    public double calcularFrete() {
        if (strategy == null) {
            throw new IllegalStateException("Nenhuma estratégia de frete foi definida.");
        }
        return this.strategy.calcular(this);
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }
}
