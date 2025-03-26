# Java anatomia de classes

Repositório voltado para estudos da anatomia de Java e convenções globais do idioma.

Estou desenvolvendo assistindo as Aulas do DIO - "Aprendendo sintaxe Java"

[Tipos primitivos](#tipos-primitivos)
[Operadores](#operadores)

## tipos primitivos

são tipos primitivos:
`int, byte, short, long, float, double, boolean e char`

Não considerados objetos, portando representam valores brutos. Armazenados diretamente na memória (Memory stack).

type     |bytes|            min               |              max          |
---------|-----|-----------------------------:|--------------------------:|
**Byte** | 1   |                          -128|                        127|
**Short**| 2   |                       -32.768|                     32.767|
**int**  | 4   |                -2.147.483.648|              2.147.483.647|
**long** | 8   |    -9.223.372.036.854.775.808|  9.223.372.036.854.775.807|

Comumente utilizado o **int** (por conta da JVM).

`tipo| tamanho`|
----|-----|
**float** |4 bytes|
**double** |8 bytes|

**double** mais usado (por conta da precisão).

> short e byte se tornou desnecessário, devido a alta capacidade dos computadores atuais.

um short pode ser um int mas um int não pode-ser um short

```java

short numeroPequeno = 1;
int numero = numeroPequeno;
short numeroPequeno = numero; // ERRO

```

## Operadores

```java
double soma = 10.5 + 15.7;
int subtração = 113 - 25;
int multiplicacao = 20 * 7;
int divisao = 15 / 3;
int modulo = 18 % 3 ;
double resultado = (10 * 7) + (20/4);
```

### Concatenação de Strings

```java
String nomeCompleto = "LINGUAGEM" + "JAVA" // "LINGUAGEMJAVA"

String concatenaçao ="?";

concatenacao = 1+1+1+"1";    //   31

concatenacao = 1+"1"+1+1;    // 1111

concatenacao = 1+"1"+1+"1";  // 1111

concatenacao = "1"+1+1+1;    // 1111

concatenacao = "1"+ (1+1+1); // 13
```

### Unários

operador    |        função         |
:----------:|-----------------------|
**!**       | Negação booleano      |
**++**      | incremento de valor   |
**--**      | decremento de valor   |

```java
int numero = 5;
numero = - numero; // -5

numero = + numero // -5 (operador '+' não o torna positivo)

numero = numero * -1; // 5 ('-' com '-' = '+')
```

### Tenários

`<expressão Condicional> ? <Caso condição true>: <Caso false>`

### Lógicos

- && -> operador E
- || -> operador OU

## Métodos

uma classe é definido por atributos e metodos.

Os métodos, por sua vez, correspondem a **funções** ou **sub-rotinas** disponíveis dentro de nossas classes.

### Convenções

- Nomeado como verbo (acelerar, parar, iniciar)
- padrão *camelCase* (somente Uppercase para primeira letra da segunda palavra)

Ex: doThing, concluirProcessamento, findById

Analizar qual se e qual tipo de retorno esperado. Do contrario, ele será um `void`

1. **Tratamento de exceções:** Verifique se o método pode gerar exceções e implemente um tratamento adequado quando necessário.

2. **Controle de visibilidade:** Defina a visibilidade do método conforme a necessidade, seja pública, protegida, de pacote ou privada.

## Visibilidade de classe / metodo

- **Public** -> visível no escopo global
- **private** -> apenas na classe

## Palavras reservadas

### Modificadores de acesso

- **public**: acesso de qualquer classe
- **private**: acesso apenas dentro da classe
- **protected**: acesso por classes no mesmo pacote e subclasses

### Modificadores de classes, variaveis ou metodos

- **abstract**: classe que não pode ser instanciada ou método que precisa ser implementado por uma subclasse não abstrata
- **extends**: indica a superclasse que a subclasse está estendendo
- **implements**: indica as *interface*'s que uma classe implementa
- **interface**: especifica uma *interface*
- **native**: (raro) indica um metodo que depende de plataforma (Ex: C)
- **syncronized**: indica que só pode ser acessado por uma thread de cada vez.
