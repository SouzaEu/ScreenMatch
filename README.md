# ScreenMatch

## Visão Geral
ScreenMatch é uma aplicação desenvolvida em Java com Spring Boot para gerenciamento de informações sobre séries e episódios. O projeto utiliza uma API externa para obter dados detalhados e permite o armazenamento e consulta dessas informações.

## Tecnologias Utilizadas
- Java 17
- Spring Boot
- Maven
- Banco de Dados H2 (ou outro configurável)
- API externa para dados de filmes/séries (ex: OMDb API)

## Configuração do Ambiente
1. Certifique-se de ter o Java 17 instalado.
2. Instale o Maven para gerenciamento de dependências.
3. Configure a API Key para a API externa no arquivo de propriedades do projeto.

## Instalação e Execução
```sh
# Clone o repositório
git clone https://github.com/seu-usuario/ScreenMatch.git

# Acesse a pasta do projeto
cd ScreenMatch

# Compile e execute o projeto
mvn spring-boot:run
```
A aplicação estará disponível em `http://localhost:8080`.

## Estrutura do Projeto
```
ScreenMatch/
│── src/
│   ├── main/java/br/com/alura/screenmatch/
│   │   ├── model/        # Classes de modelo
│   │   ├── repository/   # Repositórios para acesso a dados
│   │   ├── service/      # Lógica de negócio
│   │   ├── controller/   # Endpoints da API
│── resources/
│   ├── application.properties  # Configurações do projeto
│── pom.xml       # Dependências do Maven
│── README.md     # Documentação do projeto
```

## Endpoints da API
Exemplo de endpoints:
- `GET /series` - Retorna todas as séries cadastradas.
- `GET /series/{id}` - Retorna informações de uma série específica.
- `POST /series` - Adiciona uma nova série.
- `PUT /series/{id}` - Atualiza informações de uma série.
- `DELETE /series/{id}` - Remove uma série do banco de dados.

## Contribuição
1. Fork este repositório.
2. Crie uma branch com sua funcionalidade: `git checkout -b minha-feature`.
3. Commit suas modificações: `git commit -m 'Adiciona nova funcionalidade'`.
4. Envie para o repositório remoto: `git push origin minha-feature`.
5. Abra um Pull Request para revisão.

## Licença
Este projeto está sob a licença MIT - veja o arquivo LICENSE para mais detalhes.

