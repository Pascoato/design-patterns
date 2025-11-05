package designpattern;

public class Cliente {

    public static void main(String[] args) {
        
        Calculavel pedido1 = new Pedido(100.0);
        pedido1 = new EmbalagemPresenteDecorator(pedido1);
        pedido1 = new FreteExpressoDecorator(pedido1);
        
        System.out.println("Custo Pedido 1: " + pedido1.calcularCustoTotal());

        Calculavel pedido2 = new Pedido(200.0);
        pedido2 = new SeguroDecorator(pedido2);
        
        System.out.println("Custo Pedido 2: " + pedido2.calcularCustoTotal());

        Calculavel pedido3 = new Pedido(50.0);
        pedido3 = new EmbalagemPresenteDecorator(pedido3);
        pedido3 = new FreteExpressoDecorator(pedido3);
        pedido3 = new SeguroDecorator(pedido3);
        
        System.out.println("Custo Pedido 3: " + pedido3.calcularCustoTotal());
    }
}
