# RabbitMQ Direct Exchange Example

## Descrição

Este projeto demonstra a implementação de uma **exchange** do tipo **direct** utilizando RabbitMQ. Ele consiste em dois tipos de produtores: um para enviar mensagens simples do tipo `String` e outro para enviar objetos Java serializados. O projeto também inclui consumidores correspondentes para processar essas mensagens.

## Arquitetura

- **RabbitMQ:** Utilizado para gerenciar a troca de mensagens entre produtores e consumidores. O RabbitMQ é executado em um container Docker.
- **Producer de String:** Serviço que envia mensagens do tipo `String` para a exchange.
- **Producer de Objetos:** Serviço que envia objetos Java serializados para a exchange.
- **Consumers:** Serviços separados para consumir as mensagens de `String` e os objetos.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **RabbitMQ**
- **Docker**
- **Docker Compose**

## Configuração do Projeto

### Pré-requisitos

- Docker e Docker Compose instalados em sua máquina.
- Java 17 instalado.
- Postman para enviar o json com o objeto, se for testar apenas a mensagem de string, pode enviar direto pelo navegador -> http://localhost:8080/produces?message=SuaMensagem

## Instruções para Execução

1. **Clone o repositório**:

   Primeiramente, faça o clone do repositório para a sua máquina local:

   ```bash
   git clone https://github.com/Werricsson-Santos/learning-rabbitmq.git
   cd learning-rabbitmq


2. **Suba os containers com Docker Compose:**:

   No diretório raiz do projeto, execute o comando abaixo para subir o container com o RabbitMQ:

   ```bash
   docker-compose up -d


3. **Iniciar os Serviços de Producer e Consumer:**:

   Garanta que os serviços producer-service e consumer-service estejam rodando:

   ```bash
   cd ./producer-service
   ./gradlew bootRun
   cd ../consumer-service
   ./gradlew bootRun

   Obs.: Se o consumidor estiver rodando, as mensagens não ficarão na fila, será lido imediatamente pelo consumidor, você conseguirá visualizar o log no terminal.