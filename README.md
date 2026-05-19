# 🚀 Gestão de Utilizadores API

Uma API RESTful desenvolvida em **Java 25** e **Spring Boot** para a gestão de utilizadores. Este projeto implementa operações essenciais de CRUD (Create, Read, Update, Delete) com foco em boas práticas de Engenharia de Software direcionadas para o desenvolvimento Backend.

## 🛠️ Tecnologias Utilizadas

* **Java 25**
* **Spring Boot 3.5.14** (Web, Data JPA, Test)
* **H2 Database** (Base de dados em memória para testes e desenvolvimento)
* **Lombok** (Redução de boilerplate de código)
* **Maven** (Gestor de dependências)

## ⚙️ Funcionalidades

* `POST` Registo de um novo utilizador.
* `GET` Pesquisa de um utilizador através do endereço de e-mail.
* `PUT` Atualização de dados (nome e/ou e-mail) de um utilizador existente através do seu ID.
* `DELETE` Eliminação de um utilizador utilizando o endereço de e-mail.

## 🚀 Como Executar o Projeto

1. Clone o repositório.
2. Certifique-se de que tem o **Java 25** e o **Maven** instalados na sua máquina.
3. Na raiz do projeto, instale as dependências e inicie a aplicação com o comando:
   ```bash
   mvn spring-boot:run

A aplicação estará a correr nativamente no porto `8080`.

## 🗄️ Base de Dados (H2 Console)

O projeto utiliza a base de dados em memória H2, o que facilita a prototipagem e os testes. Para aceder à consola da base de dados via navegador:

* **URL de acesso:** `http://localhost:8080/h2-console`
* **JDBC URL:** `jdbc:h2:mem:user`
* **Username:** `sa`
* **Password:** *(deixar em branco)*

A tabela de utilizadores gerada automaticamente é a `tb_users`.

## 🛣️ Endpoints da API

### 1. Registar Utilizador
**`POST /user`**

**Corpo da Requisição (JSON):**
```json
{
  "name": "Nome do Utilizador",
  "email": "utilizador@email.com"
}
```
**Respostas Esperadas:** `200 OK`

### 2. Procurar Utilizador por E-mail
**`GET /user?email={email}`**

**Exemplo de requisição:** `http://localhost:8080/user?email=utilizador@email.com`

**Respostas Esperadas:** `200 OK` com os dados do utilizador, ou um erro caso o e-mail não exista na base de dados.

### 3. Atualizar Utilizador
**`PUT /user?id={id}`**

**Corpo da Requisição (JSON) - Pode enviar apenas os campos que deseja atualizar:**
```json
{
  "name": "Nome Atualizado",
  "email": "novo.email@email.com"
}
```
**Respostas Esperadas:** `200 OK`

### 4. Apagar Utilizador
**`DELETE /user?email={email}`**

**Exemplo de requisição:** `http://localhost:8080/user?email=utilizador@email.com`

**Respostas Esperadas:** `200 OK`

---

## 👩‍💻 Autora

**Raiane Batista**

Engenheira de Software  focada em Backend. Dedicada a aplicar conhecimentos técnicos na construção de APIs eficientes e robustas para ambientes de alta escala.

🔗 [LinkedIn - raiane-batista-software-engineer](https://www.linkedin.com/in/raiane-batista-software-engineer)
