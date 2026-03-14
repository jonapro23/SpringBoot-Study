
# 🚀 Spring-Projeto - Web API REST

API REST desenvolvida com **Spring Boot** para gerenciamento de usuários, com camada de repositório simulada em memória.

---

## 📁 Estrutura do Projeto

```
src/main/java/com/example/demo/
├── Controlleer/
│   ├── Controller.java        # Endpoint de boas-vindas
│   └── UserController.java    # CRUD de usuários
├── Model/
│   └── User.java              # Entidade de usuário
├── Repository/
│   └── UserRepository.java    # Repositório com dados em memória
└── DemoApplication.java       # Classe principal
```

---

## 📌 Endpoints

### Controller Principal
| Método | Rota | Descrição |
|--------|------|-----------|
| `GET`  | `/`  | Retorna mensagem de boas-vindas |

### UserController (`/users`)
| Método   | Rota                  | Descrição                          |
|----------|-----------------------|------------------------------------|
| `GET`    | `/users`              | Lista todos os usuários            |
| `GET`    | `/users/{username}`   | Busca usuário pelo username        |
| `POST`   | `/users`              | Cria um novo usuário               |
| `DELETE` | `/users/{id}`         | Remove um usuário pelo ID          |

---

## 🧩 Model: User

| Campo      | Tipo      | Descrição           |
|------------|-----------|---------------------|
| `id`       | `Integer` | Identificador único |
| `login`    | `String`  | Nome de usuário     |
| `password` | `String`  | Senha do usuário    |

**Construtores:**
- `User()` — construtor vazio
- `User(String login, String password)` — construtor com login e senha

**Métodos:** `getId`, `setId`, `getLogin`, `setLogin`, `getPassword`, `setPassword`, `toString`

---

## 🗄️ Repository: UserRepository

Repositório simulado em memória (sem banco de dados). Registra operações via `System.out.println`.

| Método | Descrição |
|--------|-----------|
| `save(User usuario)` | Salva ou atualiza um usuário (verifica se `id` é nulo) |
| `deleteById(Integer id)` | Remove um usuário pelo ID |
| `listAll()` | Retorna lista com usuários fixos (Jonathan, Marcia) |
| `finById(Integer id)` | Busca usuário por ID (retorna Gleyson fixo) |
| `findByUsername(String username)` | Busca usuário pelo username (retorna Jonathan fixo) |

> ⚠️ **Nota:** O repositório atual usa dados estáticos em memória, sem persistência real. Ideal para fins de estudo e prototipagem.

---

## ▶️ Como Executar

**Pré-requisitos:** Java 17+, Maven

```bash
# Clonar o repositório
git clone <url-do-repositorio>

# Entrar na pasta do projeto
cd Spring-Projeto

# Executar com Maven Wrapper
./mvnw spring-boot:run
```

A API estará disponível em: `http://localhost:8080`

---

## 🛠️ Tecnologias

- **Java** com **Spring Boot**
- **Spring Web** (REST API)
- **Maven** (gerenciamento de dependências)
