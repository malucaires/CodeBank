<p align="center">
  <img src="https://github.com/malucaires/CodeBank/blob/main/assets/FundoTransparente_branco.png" />
</p>

## Introdução

O CodeBank é um banco ficticio desenvolvido pelo grupo Andréa Tavares, Lília Oliveira, Malu Caires,  Marina Duarte e Nadine Lau para o projeto final do Bootcamp ElasTech da Gama Academy com a PagBank/PagSeguro.

O sistema deve permitir o cadastro de novos clientes, incluindo com dados pessoais e dados para contato. O cliente precisa estar conectado com uma conta bancária, com um valor inicial de saldo. A possibilidade de fazer transferência tanto de depósito como de saque deve existir além do histórico de transações.

Serão aplicados os conceitos de Java como orientação a objetos, onde classes serão criadas para representar as entidades a serem gerenciadas e os casos de uso do sistema. Para armazenar os dados utilizaremos os conceitos de banco de dados aprendidos durante o curso.

## Sobre o desafio
Abaixo segue as entregas mínimas solicitadas para o bootcamp

### 1. Casos de Uso do Sistema:
[X] Cadastro de clientes

[X] Buscar os clientes cadastrados

[X] Transferência de saldo entre as contas

[X] Buscar o histórico de transações entre contas

### 2. Banco de Dados:
[ ] Tabelas bem estruturadas e populadas com valores para testes.

[ ] O Banco deve ser entregue em script SQL junto ao repositório

### 3. Testes:
[ ] Escrever testes unitários no JUnit que permitam demonstrar que as classes estão se comportamento como desejado (validações, etc)

[ ] Escrever testes no JUnit que permitam demonstrar que o caso de de uso está com o comportamento desejado (ex.: cadastrar usuário).

### 4. Gerais:
[X] O código deve ser entregue em um repositório no Github.

[X] Liste os endpoints no README.md


## Tecnologias Usadas 
:white_check_mark: Slack
:white_check_mark: Jira
:white_check_mark: Github
:white_check_mark: Intellij
:white_check_mark: Postman
:white_check_mark: H2

## Endpoints 
A rota usada no postman foi localhost:8080

| VERBO | ROTA | AÇÃO|
|--- |--- |--- |
|POST | /account | CRIAR CONTA|
|GET | /account | LISTAR CONTA|
|PUT | /account | ATUALIZAR CONTA|
|DELETE| /account/id| DELETAR CONTA|
|GET | /account/accountnumber | LISTAR POR CONTA PELO NUMERO DA CONTA|
|GET | /account/id | LISTAR CONTA POR ID|
|POST | /costumer | CRIAR NOVO CLIENTE|
|GET | /costumer/cpf | LISTAR CLIENTE PELO CPF|
|GET | /costumer/id | LISTAR CLIENTE PELO NUMERO DO ID|
|POST| /trasaction | FAZER UMA TRANSAÇÃO|
|GET| /transaction/findtransaction | LISTAR HISTÓRICO DE TRANSAÇÃO|
