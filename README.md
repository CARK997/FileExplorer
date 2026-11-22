# 📁 FileExplorer

Um explorador de arquivos desenvolvido em **Java**, executado diretamente pelo terminal, com o objetivo de praticar conceitos de programação orientada a objetos e manipulação de arquivos e diretórios.

## 🚀 Funcionalidades

O FileExplorer permite realizar operações básicas de gerenciamento de arquivos e pastas:

| Comando | Descrição                          |
|---------|------------------------------------|
| `pwd`   | Exibe o caminho do diretório atual |
| `ls`    | Lista arquivos e pastas            |
| `mkdir` | Cria uma nova pasta                |
| `cd`    | Acessa uma pasta                   |
| `cd ..` | Retorna ao diretório anterior      |
| `touch` | Cria um arquivo e grava conteúdo   |
| `cat`   | Exibe o conteúdo de um arquivo     |
| `rm`    | Remove um arquivo                  |
| `help`  | Exibe os comandos disponíveis      |
| `exit`  | Encerra o programa                 |

## 🛠️ Tecnologias utilizadas

- Java
- Java IO (`File`, `FileInputStream` e `FileOutputStream`)
- Scanner
- Tratamento de exceções (`try/catch`)
- Programação Orientada a Objetos (POO)

## 📂 Estrutura do projeto

```text
FileExplorer/
├── src/
│   ├── Main.java
│   ├── FileExplorer.java
│   └── GerenciadorArquivos.java
├── README.md
└── .gitignore
```

## ▶️ Como executar

1. Clone este repositório:

```bash
git clone URL_DO_REPOSITORIO
```

2. Abra o projeto no Visual Studio Code.

3. Execute a classe `Main.java`.

4. Utilize o comando `help` para visualizar as funcionalidades disponíveis.

## 🎯 Objetivo do projeto

Este projeto foi desenvolvido como prática de Java, com foco em:

- Organização de código em classes.
- Encapsulamento e separação de responsabilidades.
- Manipulação de arquivos e diretórios.
- Leitura e escrita de dados.
- Tratamento de exceções.
