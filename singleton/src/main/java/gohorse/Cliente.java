package gohorse;

public class Cliente {

    public static void main(String[] args) {
        // ----------------------------------------------------------------
        System.out.println("cliente 1...");
        GerenciadorConexao db1 = new GerenciadorConexao("jdbc:mysql://servidor1/db");
        db1.executarQuery("SELECT * FROM usuarios");


        // ----------------------------------------------------------------
        System.out.println("cliente 2, em outra parte do sistema...");
        System.out.println("Criando uma nova conexão, sobreescrevendo a configuração estática...");
        GerenciadorConexao db2 = new GerenciadorConexao("jdbc:postgres://servidor2/db");
        db2.executarQuery("SELECT * FROM produtos");


        // ----------------------------------------------------------------
        System.out.println("gohorse.Cliente 1 tentando usar a conexão novamente...");
        System.out.println("Vai acabar usando a conexão do db2...");
        db1.executarQuery("SELECT * FROM pedidos");
    }
}