
import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class GerenciadorArquivos {

    private File diretorioAtual;

    public GerenciadorArquivos() {
        diretorioAtual = new File(System.getProperty("user.dir"));
    }

    
    public void mostrarCaminho() {
        System.out.println(diretorioAtual.getAbsolutePath());
    }

    
    public void listarArquivo() {

        File[] arquivos = diretorioAtual.listFiles();

        if (arquivos == null) {
            System.out.println("Não foi possível acessar o diretório.");
            return;
        }

        if (arquivos.length == 0) {
            System.out.println("Diretório vazio.");
            return;
        }

        for (File arquivo : arquivos) {

            if (arquivo.isDirectory()) {
                System.out.println("[PASTA] " + arquivo.getName());

            } else if (arquivo.isFile()) {
                System.out.println("[ARQUIVO] " + arquivo.getName());
            }
        }
    }

    
    public void criarPasta(String nome) {

        File novaPasta = new File(diretorioAtual, nome);

        if (novaPasta.mkdir()) {
            System.out.println("Pasta criada com sucesso!");
        } else {
            System.out.println("Não foi possível criar a pasta.");
        }
    }

    
    public void criarArquivo(String nome) {

        File novoArquivo = new File(diretorioAtual, nome);

        try {
            if (novoArquivo.createNewFile()) {
                System.out.println("Arquivo criado com sucesso!");
            } else {
                System.out.println("O arquivo já existe.");
            }

        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo.");
        }
    }

    
    public void escreverArquivo(String nome, String conteudo) {

        File arquivo = new File(diretorioAtual, nome);

        try (FileOutputStream saida = new FileOutputStream(arquivo)) {

            byte[] dados = conteudo.getBytes();

            saida.write(dados);

            System.out.println("Conteúdo gravado com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo.");
        }
    }

    public void lerArquivo(String nome) {

    File arquivo = new File(diretorioAtual, nome);

    if (!arquivo.exists() || !arquivo.isFile()) {
        System.out.println("Arquivo não encontrado.");
        return;
    }

    try (FileInputStream entrada = new FileInputStream(arquivo)) {

        int caractere;

        while ((caractere = entrada.read()) != -1) {
            System.out.print((char) caractere);
        }

        System.out.println();

    } catch (IOException e) {
        System.out.println("Erro ao ler arquivo.");
    }
}

    public void entrarPasta(String nome) {

        File novaPasta;

        if (nome.equals("..")) {
            novaPasta = diretorioAtual.getParentFile();
        } else {
            novaPasta = new File(diretorioAtual, nome);
        }

        if (novaPasta != null && novaPasta.exists()
                && novaPasta.isDirectory()) {

            try {
                diretorioAtual = novaPasta.getCanonicalFile();
                System.out.println("Diretório alterado com sucesso!");

            } catch (IOException e) {
                System.out.println("Erro ao acessar o diretório.");
            }

        } else {
            System.out.println("Pasta não encontrada.");
        }
    }

    public void removerArquivo(String nome) {

    File arquivo = new File(diretorioAtual, nome);

    if (!arquivo.exists()) {
        System.out.println("Arquivo não encontrado.");
        return;
    }

    if (!arquivo.isFile()) {
        System.out.println("O caminho informado não é um arquivo.");
        return;
    }

    if (arquivo.delete()) {
        System.out.println("Arquivo excluído com sucesso!");
    } else {
        System.out.println("Não foi possível excluir o arquivo.");
    }
}
}
