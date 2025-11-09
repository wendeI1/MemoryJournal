# 📓 Memory Journal (Diário de Memórias)

> ⚠️ **Projeto em Desenvolvimento** ⚠️
>
> Este é um projeto de aprendizado pessoal focado em praticar e demonstrar conceitos de Programação Orientada a Objetos (POO) com Java.

## 💡 Conceito do Projeto

**Memory Journal** é um sistema de back-end em console que permite a um usuário registrar, gerenciar e consultar memórias pessoais. O objetivo principal é aplicar de forma prática os pilares da POO (Encapsulamento, Herança, Polimorfismo e Abstração) e o uso de recursos fundamentais da linguagem Java.

---

## ✨ Features (Funcionalidades)

* **Gerenciamento de Usuário:** Criação de usuários para "logar" no diário.
* **Registro de Memórias:** Cada `Memory` é um objeto com nome, descrição e data.
* **Associação de Emoções:** Utiliza `enum` para categorizar memórias (ex: `HAPPINESS`, `SADNESS`, `ANGER`).
* **Composição de Objetos:** Um `User` *possui um* `Journal`, que por sua vez *possui uma* lista de `Memory`.
* **Busca de Memórias:** Lógica para consultar memórias salvas por nome ou por emoção.
* **Interface de Console:** Um menu interativo (`switch-case`) para navegar pelas funcionalidades.

---

## 🛠️ Tecnologias e Conceitos Aplicados

* **Java**: Linguagem principal do projeto.
* **Programação Orientada a Objetos (POO)**: Foco central do projeto.
* **Java Collections Framework**: Uso de `ArrayList` para gerenciar a coleção de memórias.
* **Java Time API**: Uso de `LocalDate` e `DateTimeFormatter` para gerenciamento de datas.
* **Enums**: Para garantir a segurança de tipo das emoções.

---

## 🚀 Próximos Passos (Roadmap)

Como este é um projeto de aprendizado, o plano é evoluí-lo para uma aplicação de back-end mais completa. Os próximos passos incluem:

* [ ] **Persistência de Dados**: Conectar o projeto a um banco de dados SQL (PostgreSQL/MySQL) usando **JDBC** ou **JPA/Hibernate**.
* [ ] **API REST**: Refatorar o projeto usando **Spring Boot** para transformar a lógica de negócios em uma API RESTful.
* [ ] **Testes Unitários**: Implementar testes com **JUnity** para garantir a lógica de negócios.
* [ ] **Validação de Input**: Melhorar o tratamento de exceções e a validação de entradas do usuário.

---

## 🏁 Como Executar (Versão Console)

1.  Clone o repositório:
    ```bash
    git clone https://github.com/wendeI1/MemoryJournal.git
    ```
2.  Navegue até a pasta `src`.
3.  Compile os arquivos `.java`:
    ```bash
    javac *.java
    ```
4.  Execute a classe principal:
    ```bash
    java Main
    ```
