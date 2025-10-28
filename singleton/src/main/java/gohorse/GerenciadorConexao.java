package gohorse;

public class GerenciadorConexao {

    public static String conexaoString = "default_connection_string";

    public static boolean conectado = false;

    public GerenciadorConexao(String config) {
        try {
            System.out.println("INICIANDO CONEXÃO CUSTOSA...");
            Thread.sleep(1000);
            conexaoString = config;
            conectado = true;
            System.out.println("Conectado com: " + conexaoString);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void executarQuery(String query) {
        if (conectado) {
            System.out.println("Executando query: " + query + " em " + conexaoString);
        } else {
            System.out.println("Não conectado.");
        }
    }
}