# api-mercado-livro
- Api para controle e gestão de livros, criada com linguagem kotlin e banco de dados mySql.

# Rodando em ambiente local

## Instancia local do banco de dados MySql
- docker run -e MYSQL_ROOT_PASSWORD=root -d -p 3306:3306 mysql

## Rodar a aplicação
- Antes de rodar é preciso iniciar o banco de dados conforme o passo anterior
- Clique com o botão direito sobre o arquivo 'MercadoLivroApplication.kt'
- Clique em 'Run MercadoLivroApplication.kt' 

## Documentação Swagger (Local)
- Subir a aplicação e acessar o endereço local a sequir: http://localhost:8080/swagger-ui.html