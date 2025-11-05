package designpattern;

public class Cliente {

    public static void main(String[] args) {
        Pedido p1 = new Pedido(2.5, 100.0);

        p1.setStrategy(new CalculadoraFretePAC());
        p1.calcularFrete();

        p1.setStrategy(new CalculadoraFreteSEDEX());
        p1.calcularFrete();
        
    }
}
