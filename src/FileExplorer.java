import java.util.Scanner;

public class FileExplorer {

    private Scanner entrada;
    private GerenciadorArquivos gerenciador;

    public FileExplorer(Scanner entrada, GerenciadorArquivos gerenciador) {
        this.entrada = entrada;
        this.gerenciador = gerenciador;
    }

    public void iniciar() {

        System.out.println("--------------------------------");
        System.out.println("         FILE EXPLORER");
        System.out.println("--------------------------------");

        System.out.println("Digite 'help' para ver os comandos.");

        boolean executando = true;

        while (executando) {
            String comando = entrada.nextLine().trim();

            String[] partes = comando.split("\\s+", 2);
            String acao = partes[0];

            switch (acao) {

                case "pwd":
                    gerenciador.mostrarCaminho();
                    break;

                case "ls":
                    gerenciador.listarArquivo();
                    break;

                case "mkdir":
                    if (partes.length < 2 || partes[1].trim().isEmpty()) {
                        System.out.println("Informe o nome da pasta.");
                    } else {
                        gerenciador.criarPasta(partes[1].trim());
                    }
                    break;

                case "cd":
                    if((partes.length < 1 || partes[1].trim().isEmpty())){
                        System.out.println("Inofrme o nome da pasta");
                    }else {
                        gerenciador.entrarPasta(partes[1].trim());
                    }
                    break;
                case "touch":
                    if (partes.length < 2 || partes[1].trim().isEmpty()) {
                        System.out.println("Informe o nome do arquivo.");
                    }else{
                        String nomeArquivo = partes[1].trim();

                        System.out.println("Digite o conteúdo:");
                        String conteudo = entrada.nextLine();

                        gerenciador.escreverArquivo(nomeArquivo, conteudo);
                    }
                    break;
                case"cat":
                    if((partes.length < 2 || partes[1].trim().isEmpty())){
                     System.out.println("Informe o nome do arquivo.");
                    }else{
                         gerenciador.lerArquivo(partes[1].trim());
                    }
                    break;
                case"rm":
                    if((partes.length < 2 || partes[1].trim().isEmpty())){
                     System.out.println("Informe o nome do arquivo.");
                    }else{
                         gerenciador.removerArquivo(partes[1].trim());
                    }
                    break;
                    
                case "help":
                    System.out.println("Comandos disponíveis:");
                    System.out.println("pwd   - Mostra o caminho atual");
                    System.out.println("ls    - Lista arquivos e pastas");
                    System.out.println("mkdir - Cria uma pasta");
                    System.out.println("cd    - Entar em pasta");
                    System.out.println("touch - Criar e escrever em um arquivo");
                    System.out.println("cat   - Exibe o conteudo de um arquivo");
                     System.out.println("rm   -  Remover  um arquivo");
                    System.out.println("exit  - Encerra o programa");

                    break;

                case "exit":
                    System.out.println("Encerrando File Explorer...");
                    executando = false;
                    break;

                default:
                    System.out.println("Comando não reconhecido.");
            }
        }
    }
}



   

