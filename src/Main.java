import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        GerenciadorArquivos gerenciador = new GerenciadorArquivos();
        FileExplorer explorer = new FileExplorer(entrada, gerenciador);

        explorer.iniciar();
        entrada.close();
    }
}