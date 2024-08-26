# Convenções de Nomenclatura e Declarações em Java

Este documento descreve as convenções de nomenclatura recomendadas e as declarações comuns em Java. Seguir estas convenções ajuda a garantir que o código seja fácil de ler, manter e entender por outros desenvolvedores.

<details>
  <summary>Sumário</summary>

- [Convenções de Nomenclatura](#convenções-de-nomenclatura)
    - [Classes](#classes)
    - [Métodos](#métodos)
    - [Variáveis](#variáveis)
    - [Constantes](#constantes)
    - [Pacotes](#pacotes)
- [Declarações em Java](#declarações-em-java)
    - [Declaração de Classes](#declaração-de-classes)
    - [Declaração de Métodos](#declaração-de-métodos)
    - [Declaração de Variáveis](#declaração-de-variáveis)
    - [Declaração de Constantes](#declaração-de-constantes)
  ```
</details>

## Padrões de Nomenclatura

Padrões de nomenclatura são importantes para garantir que o código seja legível e mantenha uma consistência que facilita a manutenção e colaboração. Em Java, seguir convenções de nomenclatura ajuda a manter um padrão uniforme e compreensível em projetos de software.

## Convenções Gerais

### Classes

- **Nome**: Usar a notação CamelCase.
- **Exemplo**: `UserAccount`, `PaymentProcessor`, `OrderService`.

### Interfaces

- **Nome**: Usar a notação CamelCase e prefixar com "I" (opcional, mas comum em algumas equipes).
- **Exemplo**: `IUserService`, `IPaymentGateway`, `IDatabaseConnection`.

### Métodos

- **Nome**: Usar a notação camelCase, começando com uma letra minúscula e usando maiúsculas para separar palavras.
- **Exemplo**: `calculateTotalAmount()`, `getUserDetails()`, `processOrder()`.

### Variáveis

- **Nome**: Usar a notação camelCase, começando com uma letra minúscula e usando maiúsculas para separar palavras.
- **Exemplo**: `userName`, `orderAmount`, `paymentStatus`.

### Constantes

- **Nome**: Usar letras maiúsculas com palavras separadas por sublinhados.
- **Exemplo**: `MAX_USER_COUNT`, `DEFAULT_TIMEOUT`, `API_KEY`.

### Pacotes

- **Nome**: Usar nomes em minúsculas, separados por pontos para representar a hierarquia de pacotes.
- **Exemplo**: `com.example.project`, `org.company.utils`, `net.myapp.services`.

## Exemplos de Código

### Classe

```java
public class UserAccount {
    private String userName;
    private int userAge;

    public UserAccount(String userName, int userAge) {
        this.userName = userName;
        this.userAge = userAge;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
}
```
### Interface

```java
public interface IUserService {
    UserAccount getUserById(int userId);
    void updateUser(UserAccount user);
}
```

### Método

```java
public class OrderProcessor {
    public double calculateTotalAmount(Order order) {
        double total = 0.0;
        for (Item item : order.getItems()) {
            total += item.getPrice();
        }
        return total;
    }
}
```

### Variável

```java
public class ExampleClass {
    private String userName;
    private int totalAmount;
    private LocalDate orderDate;

    // outros membros da classe
}
```

### Constantes

```java
public class AccountConstants {
    public static final double MIN_BALANCE = 100.00;
    public static final int MAX_ACCOUNT_LIMIT = 5000;
}
``` 

## Padrões de Declaração em Java

## Declarações de Variáveis

Uma declaração de variável em Java define uma variável e, opcionalmente, a inicializa com um valor. O formato geral é:

```java
tipo nomeVariavel;
tipo nomeVariavel = valor; // declarar e inicializar

int idade;
idade = 30;

double salario = 4500.50;
```

## Declarações de Métodos

Métodos são blocos de código que realizam uma tarefa específica e podem retornar um valor. A declaração de um método inclui o tipo de retorno, o nome do método, e os parâmetros, se houver.

```java
tipoRetorno nomeMetodo(tipoParametro nomeParametro) {
    // corpo do método
}

public int soma(int a, int b) {
    return a + b;
}
```

## Declarações de Classes

Uma classe em Java é uma estrutura fundamental que agrupa dados e métodos relacionados. A declaração de uma classe inclui a palavra-chave class, seguida pelo nome da classe e um corpo que contém variáveis e métodos.

```java
public class NomeDaClasse {
    // variáveis
    // métodos
}

public class Pessoa {
    String nome;
    int idade;

    public void dizerOla() {
        System.out.println("Olá, meu nome é " + nome);
    }
}
```

## Declarações de Classes

Pacotes ajudam a organizar classes relacionadas. A declaração de um pacote deve ser a primeira linha do arquivo de código fonte.

```java
package nomeDoPacote;
package com.exemplo.projeto;
```

## Declarações de Importação

Pacotes ajudam a organizar classes relacionadas. A declaração de um pacote deve ser a primeira linha do arquivo de código fonte.

```java
import nomeDoPacote.NomeDaClasse;
import java.util.ArrayList;
```
