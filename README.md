# ScreenMatch

Projeto Java para gerenciamento e recomendação de filmes e episódios de séries.

## Estrutura

- `modelos`
  - `Episodio.java`: Classe que representa um episódio de série.
  - `Filme.java`: Classe que representa um filme.
  - `Titulo.java`: Classe base para representação de um título (genérica).

- `calculos`
  - `CalculadoraDeTempo.java`: Calcula o tempo total de execução dos títulos.
  - `FiltroRecomendacao.java`: Implementa filtros para recomendação de filmes.

- `br.com.alura.screenmatch.principal.Principal.java`: Classe principal que inicia o programa.

## Como Executar

1. **Compilação**: No diretório raiz do projeto, compile os arquivos Java utilizando o seguinte comando:
   ```bash
   javac -d bin src/modelos/*.java src/calculos/*.java src/principal/*.java
2. **Execução**: Após a compilação, execute a classe principal usando o seguinte comando:
    ```bash
   java -cp bin principal.br.com.alura.screenmatch.principal.Principal

## Funcionalidades

- **CalculadoraDeTempo**: Calcula o tempo total de execução de todos os títulos.
- **FiltroRecomendacao**: Implementa filtros para recomendação de filmes com base em critérios específicos.

## Licença

Este projeto está licenciado sob a Licença MIT.
