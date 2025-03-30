# Java anatomia de classes

Repositório voltado para estudos da anatomia de Java e convenções globais do idioma.

Estou desenvolvendo assistindo as Aulas do DIO - "Aprendendo sintaxe Java"

<details open>

<summary>Sumário</summary>

## Sumário

[Tipos primitivos](#tipos-primitivos)

[Operadores](#operadores)

[Métodos](#métodos)

[Palavras reservadas](#palavras-reservadas)

[Java doc](#java-doc)

[Argumentos com console](#argumentos-com-console)

[Estruturas de Condicionais](#estruturas-de-condicionais)

</details>

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

## Java doc

Ademais de comentário de linha e bloco, o javaDOC é uma ferramenta interessante:

```java
/** duas estrelas para representar um Java Doc
 * 
 * @author  Legal, CARA
 * @version 1.0
 * @since   2025-01-01
 */

public class SomeClass {

    /**
     * @param value o valor a ser atribuido para a propriedade volume
     * @return String
     */
    public void createString(String name){
        return name;
    };
}
```

commando útil (e divertido) criará uma exibição HTML para o Java Doc acima:

```console
javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs ./src/*.java
```

### Parâmetros

#### `-encoding UTF-8`

Define a codificação dos arquivos-fonte Java que serão processados pelo Javadoc. Neste caso, os arquivos `.java` são lidos usando a codificação **UTF-8**.

#### `-docencoding ISO-8859-1`

Define a codificação dos arquivos HTML gerados na documentação. Aqui, os documentos finais serão escritos em **ISO-8859-1**, uma codificação com suporte a caracteres especiais de línguas europeias.

#### `-d ../docs`

Especifica o diretório de saída para a documentação gerada. O Javadoc criará a documentação na pasta `../docs` (um nível acima do diretório atual, na pasta "docs").

#### `./src/*.java`

Indica que todos os arquivos `.java` localizados dentro do diretório `src` serão processados pelo Javadoc para gerar a documentação.

### Exemplo de Uso

Se você estiver em um projeto com a seguinte estrutura:

```tree
meu_projeto/
|-- src/
|   |-- MinhaClasse.java
|   |-- OutraClasse.java
|-- docs/  (será criado pelo comando)
|-- build/
```

Executar o comando acima na raiz do projeto gerará a documentação no diretório `docs/` contendo a documentação das classes Java do diretório `src/`.

### Observação

Caso a documentação precise suportar caracteres especiais de diversas línguas, é recomendável usar `UTF-8` também no `-docencoding`:

```console
javadoc -encoding UTF-8 -docencoding UTF-8 -d ../docs ./src/*.java
```

Dessa forma, evita-se problemas com acentos e caracteres especiais em diferentes idiomas.

## Argumentos com console

Ao executar um arquivo Java compilado (*.class), o programa executará o metodo `main`, e os argumentos que forem adicionado serão enviados para o parametro `String[] args`. Confira o exemplo abaixo:

````console
java -cp [caminho dos arquivos compilados] [caminho do package (e.g. edu.aluoni.AboutMe)] [args [] ]
````

## Estruturas de Condicionais

São estruturas que permitem modificar o fluxo do código baseado em condicionais. Para eles, existem comandos para auxiliar na manipulação de estruturas condicionais, tais como `continue` e `break`.

### `if/else`

```java
    double saldo = 150;
    double valorSolicitado = 50;

    if (valorSolicitado < saldo) { // condição true, bloco if executado
        saldo = saldo - valorSolicitado;
        System.out.println("novo saldo R$" + saldo);
    } else { // bloco pulado
        System.out.println("Saldo insuficente");
        System.out.println("Saldo R$" + saldo);
    }
```

### `tenário`

A vantagem dessa condicional é deixar o códido mais compacto e melhor de entender

```java
        double nota = 2;

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 ? "Recuperacao" : "Reprovado";

        System.out.println(resultado);
```

### `Switch Case`

Pode ser considerado mais sensível pois ela exige saber umas regras mais específicas. Veja o código abaixo:

```java
char sigla = 'M';

switch (sigla) {
    case 'P':
        System.out.println("Pequeno");
        break;
    case 'M':
        System.out.println("Medio");
        break;
    case 'G':
        System.out.println("Grande");
        break;
    default:
        System.out.println("Nao especificado");
        break;
        }
```

o `break` é nescessário para ele não executar o bloco abaixo. quando o bloco chega no `case 'P'`, ele executará o bloco, e por padrão sem o break ele executaria o bloco seguinte também (no exemplo, `case 'G'`).

## Exeções

Diferente de erros, exeções são fluxos inesperados nas aplicações (ex: divisão por 0, procurar arquivo inexistente, login inválido de banco de dados). É importante para o programador prever esses erros e realizar o denominado **tratamento de exceções**.

![!\[Fluxo Exeções\](https://raw.githubusercontent.com/digitalinnovationone/trilha-java-basico/refs/heads/main/gitbook/.gitbook/assets/image%20(6).png)](https://raw.githubusercontent.com/digitalinnovationone/trilha-java-basico/refs/heads/main/gitbook/.gitbook/assets/image%20(6).png)

### Tratamento

1. `try`: Permite definir bloco de código para testar os erros
2. `catch`: Define um bloco de código caso o try retorne algum erro.
Possibilitando criar mais de um, poderá personalizar o fluxo para cada tipo de erro
3. `finally`: Cria uma parte que será executada, independente de ocorrer um erro ou não.

### Criar exeções personalizadas

```java
public class CepInvalidoException extends Exception {}
```

Em seguida criamos nosso método de formatação de cep.

```java
static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
```
