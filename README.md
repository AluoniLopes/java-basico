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
