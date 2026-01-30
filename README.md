# 🏋️‍♂️ Sistema de Academia em Java

## 📖 Descrição
Projeto de estudo em Java que simula um sistema de academia, utilizando **orientação a objetos**.  
Permite criar alunos, personal trainers, exercícios e fichas de treino, relacionando todos os objetos de forma organizada.  

O sistema utiliza um **DTO (Data Transfer Object)** para armazenar a lista de exercícios disponíveis.  
Ao executar, o programa exibe uma ficha de treino completa de um aluno, com personal e exercícios atribuídos.

## ✨ Funcionalidades
- 👤 Cadastro de **Alunos** e **Personals**  
- 🏋️ Criação de **Exercícios** com nome, repetições e carga  
- 📄 Criação de **Ficha de Treino** que relaciona aluno, personal e exercícios  
- 🖥️ Impressão da ficha de treino no console de forma legível  
- 📦 Uso de **DTO** para centralizar a lista de exercícios

## 🗂️ Estrutura do Projeto
- `model/` → classes do domínio (`Aluno`, `Personal`, `Exercicio`, `Ficha`, `Academia`, `DTO`)  
- `view/` → classe `Main.java` que executa o programa  

## 🚀 Como Executar
1. Abra o projeto em sua IDE Java (Eclipse, IntelliJ, VS Code)  
2. Execute a classe `view.Main` como **Java Application**  
3. O console exibirá os dados da ficha de treino, incluindo aluno, personal e exercícios

## 🛠️ Tecnologias
- Java 8 ou superior  
- Orientação a objetos (classes, objetos, métodos)  
