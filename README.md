Aqui está o **README.md** atualizado para refletir corretamente a estrutura e funcionalidades do projeto:  

---

# 📖 **Lista de Exercícios 1 POO**  

## 📌 **Descrição**  
Este projeto em **Java 17** contém soluções para uma **lista de exercícios de estrutura sequencial**. Ele está organizado em classes separadas para melhor modularidade:  

- **`App.java`**: Contém a função `main` e gerencia o fluxo do programa.  
- **`Menu.java`**: Exibe os menus interativos para o usuário.  
- **`Calculadora.java`**: Contém métodos utilitários para realizar os cálculos dos exercícios.  

---

## 🗂 **Estrutura do Projeto**  
```
jluca-s-javaclasses/
│── README.md
│── src/com/exercicios/
│   ├── main/
│   │   ├── App.java       # Classe principal que controla o fluxo do programa
│   ├── utils/
│   │   ├── Menu.java      # Exibe as opções do menu
│   │   ├── Calculadora.java  # Métodos utilitários para cálculos
│── bin/                    # Arquivos compilados
```

---

## 🚀 **Como Clonar e Rodar o Projeto**  

### **1. Clonar o Repositório**  
```sh
git clone -b Lista-1 https://github.com/jluca-s/JavaClasses.git
```

### **2. Compilar o Código**  
```sh
javac -d bin src/com/exercicios/main/App.java src/com/exercicios/utils/Calculadora.java src/com/exercicios/utils/Menu.java
```

### **3. Executar o Programa**  
```sh
java -cp bin com.exercicios.main.App
```

O programa exibirá um menu interativo para selecionar e rodar os exercícios.

---

## 🎯 **Requisitos**  
- **Java 17+** instalado  

Verifique a versão do Java com o comando:  
```sh
java -version
```

---

## 📌 **Funcionalidades Implementadas**  

### 🔹 **1. Operações Matemáticas**
- Somar dois números  
- Calcular a média aritmética  
- Calcular a área de um círculo  

### 🔹 **2. Conversões**
- Converter Celsius ↔ Fahrenheit  
- Converter Metros ↔ Centímetros  

### 🔹 **3. Cálculos Corporais**
- Calcular **IMC**  
- Calcular **Peso Ideal** baseado na altura e sexo  

### 🔹 **4. Cálculos Específicos**
- Realizar operações matemáticas com três números  
- Calcular a área de um quadrado e exibir o dobro  
- Calcular o **salário líquido** com base nas horas trabalhadas  
- Calcular o **tempo de download** de um arquivo  
- Calcular a **quantidade de tinta necessária** para pintar uma área  
- Validar **excesso de peso de pesca** e calcular a multa  

---


## 📝 **Licença**  
Este projeto está sob a licença **MIT**. Você pode usá-lo livremente.  

📌 **Criado por** [jluca-s](https://github.com/jluca-s). 🚀  

---