# Dslist

O objetivo do projeto é criar uma aplicação para gerenciamento de listas de jogos, utilizando tecnologias amplamente utilizadas no mercado, como Java e Spring Boot, além de boas práticas de desenvolvimento para proporcionar uma API robusta, eficiente e escalável.

## Funcionalidades

- Consultar listas de jogos cadastradas.
- Adicionar, editar e remover jogos de listas.
- Ordenar e organizar jogos em listas personalizadas.

## Tecnologias Utilizadas

Este projeto foi desenvolvido com as seguintes tecnologias e ferramentas:

- **Java 17**
- **Spring Boot 3**
- **Hibernate / JPA**
- **Maven**
- **PostgreSQL**
- **H2 Database** (para testes)
- **IntelliJ IDEA**
- **Postman** (para testes de API)

## Estrutura do Projeto

A aplicação segue uma arquitetura MVC (Model-View-Controller) dividida em pacotes para melhor organização:

- **Controller**: Gerencia as requisições HTTP.
- **Service**: Contém a lógica de negócio.
- **Repository**: Interage com o banco de dados.
- **Entity**: Define as tabelas do banco de dados.
- **DTO**: Utilizado para transferir dados entre as camadas.

## Requisitos

Para executar o projeto localmente, você precisará de:

- Java 17 ou superior.
- Maven instalado.
- PostgreSQL instalado e configurado.

## Instalação e Execução

### 1. Clone o repositório

```bash
git clone https://github.com/DerickWiller/Dslist.git
cd Dslist
