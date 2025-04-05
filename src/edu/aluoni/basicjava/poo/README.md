# Programação Orientada a Objetos

Pela sua capacidade de ser reutilizável, é muito exigido pelo mercado.

## Pilares da POO

### Encapsulamento

É a tecnica de utilizar metodos privados em objetos. Digamos para um aplicativo de enviar mensagens e o app precisa verificar a sua conecção com a internet. Essa função não precisa ser o usuário para fazer essa verificação. então por ser um metodo que pode ser feita internamente, podemos deixa-la privada e então utilizar ela dentro do próprio objeto.

Seja MSN Messager como exemplo, observe algoritimo **sem encapsulamento**:

```java
public class MsnMessager{
    public void enviarMensagem() {
        System.out.println("Enviando mensagem");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }
    
    public void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet")
    }

    public void salvarHistoricoMensagem(){
       System.out.println("Salvando o histórico da mensagem")
        
    }
}

```

```java
public class ComputadorPedrinho {
    public static void main(String[] args) {
        //abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();
        
        msn.validarConectadoInternet();
        msn.enviarMensagem();
        msn.slvarHistoricoMensagem();

        msn.receberMensagem() ;
        }
}
```

Aplicando o conceito de encapsulamento teriamos:

```java
public class MsnMessager{
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }
    
    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }

    private void salvarHistoricoMensagem(){
       System.out.println("Salvando o histórico da mensagem");
        
    }
}
```

agora quando Pedrinho for mandar mensagem o programa automaticamente já verifica se há uma coneccao com a internet:

```java
public class ComputadorPedrinho {
    public static void main(String[] args) {
        //abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();
        
        msn.enviarMensagem();
        
        msn.receberMensagem();

        msn.validarConectadoInternet() // indisponivel pois é private
        }
```

### Herança

Como sabemos, Não existe apenas o MSN para mandar mensagem. A propriedade de herança tem como objetivo reutilizar códigos para ter uma melhor implementação. Com isso, Facebook, MSN e Telegram podem herdardar de uma classe em comum chamada `ServicoMensagemInstantanea`. Veja exemplo abaixo.

Seja um projeto com os arquivos:

```tree
└───src
    ├───ComputadorPedrinho.java
    ├───FacebookMessager.java
    ├───MSNMessager.java
    ├───ServicoMensagemInstantanea.java
    └───Telegram.java
```

```java
public class ServicoMensagemInstantanea {
    public void enviarMsg(){};
    public void ReceberMsg(){};
    public void ValidarConectadoInternet(){};
    public void SalvarHistorico(){};
}
```

Observe que `ServicoMensagemInstantanea` tem configurações que `FacebookMessager`,`MSNMessager` e `Telegram` podem herdar.
com isso, podemos deixar o codigo mais limpo. usando p recurso `extends`.

```java
public class MSNMessager extends ServicoMensagemInstantanea {

}
```
