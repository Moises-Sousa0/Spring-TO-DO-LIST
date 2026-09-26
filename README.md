# 📝 TODO List API

API RESTful para gerenciamento de tarefas (CRUD)

> 💡 Projeto baseado no tutorial/vídeo prático [[link para o vídeo aqui](https://www.youtube.com/watch?v=IjProDV001o&list=PLSAd7rGMEke8&index=13&t=1615s)].

---

## 🛠️ Tecnologias

- **Java & Spring Boot**
- **Spring MVC**
- **Spring Data JPA**
- **MySQL** 
- **SpringDoc OpenAPI 3** (Documentação Swagger)

---

## 📌 Práticas Adotadas

- Design orientado a boas práticas (**SOLID, DRY, YAGNI, KISS**)
- Arquitetura **API REST**
- Injeção de Dependências
- Tratamento global/customizado de exceções e erros
- Documentação automática da API via Swagger/OpenAPI

---

## 🚀 Endpoints da API

Para realizar as requisições HTTP via terminal (HTTPie/cURL) ou Postman:

- **Criar Tarefa:** `POST :8080/todos` com `nome="Todo 1"`, `descricao="Desc Todo 1"` e `prioridade=1`  
  *Exemplo de resposta:* `[{"id": 1, "nome": "Todo 1", "descricao": "Desc Todo 1", "prioridade": 1, "realizado": false}]`

- **Listar Tarefas:** `GET :8080/todos`  
  *Exemplo de resposta:* `[{"id": 1, "nome": "Todo 1", "descricao": "Desc Todo 1", "prioridade": 1, "realizado": false}]`

- **Atualizar Tarefa:** `PUT :8080/todos/1` com `nome="Todo 1 Up"`, `descricao="Desc Todo 1 Up"` e `prioridade=2`  
  *Exemplo de resposta:* `[{"id": 1, "nome": "Todo 1 Up", "descricao": "Desc Todo 1 Up", "prioridade": 2, "realizado": false}]`

- **Remover Tarefa:** `DELETE :8080/todos/1`  
  *Exemplo de resposta:* `[]`


<img width="1914" height="985" alt="image" src="https://github.com/user-attachments/assets/0c5ec5c4-8716-4aeb-8b36-6b03199269af" />


---
