# Collection framework Java

É uma estrutura de dados para agrupar elementos em uma unidade, elementos precisam ser `Objetos`.

Existem 4 grandes tipos de coleções: `List`, `Set`, `Queue` e `Map`.

Apartir dessas **interfaces** temos muitas subclasses concretas que implementam vaias formas diferentes de se trabalhar com cada coleção.

![hierarchy of Collections in java](assets/hierarchy-of-collection-framework-in-java.webp)

Todas as interfaces são distribuidas no package `java.util`.

## Generics Type

- tipo de classe genérica ou uma `interface` que é parametrizada em relação a tipos.

```java
public class Box {
    private Object object;
    public void set(object object) { this. object = objegt; }
    public object get () { return object; }`
}
```

- O símbolo `<>` é chamado de "diamond" ou "diamond operator" foi um recurso introduzido no Java 7 e é usado no contexto de tipos genéricos em Java para inferir automaticamente o tipo com base no contexto.
- Para atualizar a classe Box para usar generics, você cria uma declaração de tipo genérico alterando o código `public class Box` para `public class Box<T>`.
- Uma variavel de tipo pode ser qualquer classe **não primitiva**.
