API REST para gerenciamento de academias desenvolvida com Java e Spring Boot.

O projeto tem como objetivo aplicar boas práticas de desenvolvimento backend, arquitetura em camadas, documentação com Swagger/OpenAPI e persistência de dados utilizando PostgreSQL.

---

🚀 Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Validation
- PostgreSQL
- Flyway
- Maven
- Lombok
- Swagger / OpenAPI (SpringDoc)

---

📁 Arquitetura

O projeto segue uma arquitetura em camadas:

```
Controller
    ↓
Service
    ↓
Repository
    ↓
Banco de Dados
```

Organização dos pacotes:

```
src/main/java
│
├── config
├── controller
├── doc
├── domain
├── dto
├── exception
├── mapper
├── projection
├── repository
├── service
└── specification
```

---

📌 Funcionalidades

👨‍🎓 Alunos

- Cadastrar aluno
- Buscar aluno por ID
- Listar alunos com paginação
- Filtrar alunos
- Atualizar aluno
- Excluir aluno

 📋 Matrículas

- Cadastro de matrículas
- Associação de planos
- Associação de modalidades

💳 Financeiro

- Controle de faturamento
- Consultas financeiras

📊 Relatórios

- Relatórios personalizados
- Projections com Spring Data JPA

---
📖 Documentação da API

Após iniciar a aplicação:

Swagger UI

```
http://localhost:8080/swagger-ui/index.html
```

OpenAPI JSON

```
http://localhost:8080/v3/api-docs
```

---

⚙️ Como executar

Clone o projeto

```bash
git clone https://github.com/Menezes013/mastersys.git
```

Entre na pasta

```bash
cd mastersys
```

Configure o banco de dados PostgreSQL no arquivo:

```
application.properties
```

Execute a aplicação

```bash
./mvnw spring-boot:run
```

ou

```bash
mvn spring-boot:run
```

---

🗄 Banco de Dados

O projeto utiliza:

- PostgreSQL
- Spring Data JPA
- Flyway para versionamento do banco

---

📚 Recursos utilizados

- Paginação
- Filtros dinâmicos (Specification)
- DTOs
- Validação com Bean Validation
- Tratamento global de exceções
- Documentação Swagger/OpenAPI
- Projections
- Arquitetura em camadas

---

🎯 Objetivos do projeto

Este projeto foi desenvolvido para praticar conceitos como:

- Arquitetura REST
- Spring Boot
- JPA/Hibernate
- PostgreSQL
- Boas práticas de desenvolvimento
- Documentação de APIs
- Organização de projetos backend

---

📷 Swagger

Após executar a aplicação, a documentação pode ser acessada em:

```
http://localhost:8080/swagger-ui/index.html
```

## 📄 Licença

Este projeto está licenciado sob a licença Apache 2.0.
