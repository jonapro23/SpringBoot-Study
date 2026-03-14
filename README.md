
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

----------------------------------------------

# 🚀 Spring-Projeto - REST Web API

A REST API built with **Spring Boot** for user management, with an in-memory simulated repository layer.

---

## 📁 Project Structure

```
src/main/java/com/example/demo/
├── Controlleer/
│   ├── Controller.java        # Welcome endpoint
│   └── UserController.java    # User CRUD operations
├── Model/
│   └── User.java              # User entity
├── Repository/
│   └── UserRepository.java    # In-memory repository
└── DemoApplication.java       # Main class
```

---

## 📌 Endpoints

### Main Controller
| Method | Route | Description |
|--------|-------|-------------|
| `GET`  | `/`   | Returns a welcome message |

### UserController (`/users`)
| Method   | Route                 | Description                      |
|----------|-----------------------|----------------------------------|
| `GET`    | `/users`              | Returns a list of all users      |
| `GET`    | `/users/{username}`   | Finds a user by username         |
| `POST`   | `/users`              | Creates a new user               |
| `DELETE` | `/users/{id}`         | Deletes a user by ID             |

---

## 🧩 Model: User

| Field      | Type      | Description         |
|------------|-----------|---------------------|
| `id`       | `Integer` | Unique identifier   |
| `login`    | `String`  | Username            |
| `password` | `String`  | User password       |

**Constructors:**
- `User()` — empty constructor
- `User(String login, String password)` — constructor with login and password

**Methods:** `getId`, `setId`, `getLogin`, `setLogin`, `getPassword`, `setPassword`, `toString`

---

## 🗄️ Repository: UserRepository

Simulated in-memory repository (no database). Operations are logged via `System.out.println`.

| Method | Description |
|--------|-------------|
| `save(User usuario)` | Saves or updates a user (checks if `id` is null) |
| `deleteById(Integer id)` | Deletes a user by ID |
| `listAll()` | Returns a static list of users (Jonathan, Marcia) |
| `finById(Integer id)` | Finds a user by ID (returns static user Gleyson) |
| `findByUsername(String username)` | Finds a user by username (returns static user Jonathan) |

> ⚠️ **Note:** The current repository uses static in-memory data with no real persistence. Intended for learning and prototyping purposes.

---

## ▶️ How to Run

**Requirements:** Java 17+, Maven

```bash
# Clone the repository
git clone <repository-url>

# Navigate to the project folder
cd Spring-Projeto

# Run with Maven Wrapper
./mvnw spring-boot:run
```

The API will be available at: `http://localhost:8080`

---

## 🛠️ Technologies

- **Java** with **Spring Boot**
- **Spring Web** (REST API)
- **Maven** (dependency management)
