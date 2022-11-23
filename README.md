<p align="center">
  <img src="https://github.com/malucaires/CodeBank/blob/main/assets/FundoTransparente_branco.png?raw=true";/>
</p>


### Introdução

O CodeBank é um banco ficticio desenvolvido pelo grupo <a href="https://www.linkedin.com/in/andrealeticiatavares/">Andréa Tavares</a> , <a href="https://www.linkedin.com/in/lilia-ferreira-537868149/">Lília Oliveira</a> ,        <a href="https://www.linkedin.com/in/malu-caires/">Malu Caires</a> ,  <a href="https://www.linkedin.com/in/utschmarina/">Marina Duarte</a> e <a href="https://www.linkedin.com/in/nadine-lau/">Nadine Lau</a> para o projeto final do Bootcamp ElasTech da Gama Academy com a PagBank/PagSeguro.

O sistema deve permitir o cadastro de novos clientes, incluindo com dados pessoais e dados para contato. O cliente precisa estar conectado com uma conta bancária, com um valor inicial de saldo. A possibilidade de fazer transferência tanto de depósito como de saque deve existir além do histórico de transações.

Serão aplicados os conceitos de Java como orientação a objetos, onde classes serão criadas para representar as entidades a serem gerenciadas e os casos de uso do sistema. Para armazenar os dados utilizaremos os conceitos de banco de dados aprendidos durante o curso.

## Sobre o desafio
Abaixo segue as entregas mínimas solicitadas para o bootcamp

### 1. Casos de Uso do Sistema:
:white_check_mark: Cadastro de clientes

:white_check_mark: Buscar os clientes cadastrados

:white_check_mark: Transferência de saldo entre as contas

:white_check_mark: Buscar o histórico de transações entre contas

### 2. Banco de Dados:
:white_check_mark: Tabelas bem estruturadas e populadas com valores para testes.

:white_check_mark: O Banco deve ser entregue em script SQL junto ao repositório

### 3. Gerais:
:white_check_mark: O código deve ser entregue em um repositório no Github.

:white_check_mark: Liste os endpoints no README.md


## Tecnologias Usadas 
:white_check_mark: Slack
:white_check_mark: Jira
:white_check_mark: Github
:white_check_mark: Intellij
:white_check_mark: Postman
:white_check_mark: H2

## Diagrama Entidade Relacionamento
![text](https://github.com/malucaires/CodeBank/blob/main/assets/DiagramaRelacionamentoEntidade.png?raw=true)

## Endpoints 
A rota usada no postman foi localhost:8080

| VERBO | ROTA | AÇÃO|
|--- |--- |--- |
|POST | /account | CRIAR CONTA|
|GET | /account | LISTAR CONTAS|
|GET | /account/accountnumber/{accountnumber} | LISTAR POR CONTA PELO NUMERO DA CONTA|
|GET | /account/id/{id} | LISTAR CONTA POR ID|
|PUT | /account | ATUALIZAR STATUS OU SALDO DA CONTA|
|DELETE| /account/{id}| DELETAR CONTA POR ID|
|POST | /customer | CRIAR NOVO CLIENTE|
|GET | /customer/cpf/{cpf} | LISTAR CLIENTE PELO CPF|
|GET | /customer/id/{id} | LISTAR CLIENTE PELO NUMERO DO ID|
|PUT | /customer | ATUALIZAR DADOS CLIENTE|
|DELETE | /customer/{id} | DELETAR CLIENTE POR ID|
|POST| /trasaction | FAZER UMA TRANSAÇÃO|
|GET| /transaction/findtransaction/{id} | LISTAR HISTÓRICO DE TRANSAÇÃO POR ID DA CONTA|
|GET| /transaction/transactions | LISTAR TODAS AS TRANSAÇÕES|
