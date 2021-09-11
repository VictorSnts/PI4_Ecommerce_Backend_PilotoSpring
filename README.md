# PI4_Ecommerce_Backend_PilotoSpring
Implementação do Backend da primeira sprint em Java (Framework Spring Boor e Spring JPA)

## Como Iniciar:

Com o java instalado, siga os passos a seguir:

1. Acessar o diretório do projeto vai terminal
2. Acessar o diretório /target 
3. Rodar o comando:

    ```bash
    java -jar PI4_ecommerce-0.0.1-SNAPSHOT.jar
    ```

A aplicação backend estará executando na URI [http://localhost:8080/](http://localhost:8080/produtos)

![Captura de Tela 2021-09-11 às 17.02.02.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ed604c55-0e62-4bdd-92a3-b25a4396573d/Captura_de_Tela_2021-09-11_as_17.02.02.png)

---

## Database:

O database utilizado é o H2 para testes (Database em memoria), e pode ser acessado pelo browser em [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

![Captura de Tela 2021-09-11 às 17.04.57.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b6b5194f-aa4c-4dca-b8c6-6564e588aba4/Captura_de_Tela_2021-09-11_as_17.04.57.png)

Informacoes de login: 

Driver Class:org.h2.Driver

JDBC URL:jdbc:h2:mem:testdb

User Name:sa

Password:

---

## Operacoes implementadas

Para testar as operacoes que foram implementadas recomendo a ferramenta Postman. 

As operacoes que temos ate o momento sao as seguintes:

1. Listar os produtos armazenados: Metodo GET - Retorna todos os produtos cadastrados

    [http://localhost:8080/produtos](http://localhost:8080/produtos)

2. Consultar produto como detalhe: Metodo GET - Retorna um produto especifico (espera um id de produto na url)

    [http://localhost:8080/produtos/](http://localhost:8080/produtos/1){id}

3. Incluir um produto e as referencoas para imagens: Metodo POST - Cadastra um produto

    [http://localhost:8080/produtos](http://localhost:8080/produtos)

    Espera um RequestBody conforme exemplo:

    ```json
    {
        "nome": "Galaxy J7 Prime",
        "marca": "Samsung",
        "quantidade": 42,
        "preco": 1678.30,
        "descricao": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
        "estado": "INATIVO",
        "categoriaId": 2,
        "imagens": [
            "/assets/images/eletrodomesticos/Sansung_Galaxy J7 Prime_I1.jpg",
            "/assets/images/eletrodomesticos/Sansung_Galaxy J7 Prime_I2.jpg"
        ]
    }
    ```

4. Alterar um produto e suas imagens, Inativar ou Reativar um produto: Metodo PUT - Atualiza umproduto da base de dados
[http://localhost:8080/produtos/](http://localhost:8080/produtos/1){id

    Espera um RequestBody conforme exemplo:

    ```json
    {
        "nome": "Galaxy J7 Prime",
        "marca": "Samsung",
        "quantidade": 42,
        "preco": 1678.30,
        "descricao": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
        "estado": "INATIVO",
        "categoriaId": 2,
        "imagens": [
            "/assets/images/eletrodomesticos/Sansung_Galaxy J7 Prime_I1.jpg",
            "/assets/images/eletrodomesticos/Sansung_Galaxy J7 Prime_I2.jpg"
        ]
    }
    ```
