# Aula 4 - Métodos Especiais

### Exemplo para entendimento dos métodos especiais:

e = nova Estante

t = e.totalDoc

## Métodos acessores

Getters (acessa uma informação de um objeto, com segurança)

- Quero verificar quantos documentos da estante são meus → getTotalDoc

Agora voltando ao nosso exemplo e utilizando o método get, temos a seguinte situação:

e = nova Estante

t = e.getTotalDoc() → método

## Métodos Modificadores (Mutantes)

Setters (modifcam uma informações de um objeto, com segurança

- Quero adicionar mais um documento a estante → setTotalDoc

Voltando mais uma vez ao nosso exemplo temos a seguinte situação:

e = nova Estante

t = e.setTotalDoc(doc) → método

## Utilizando de nossa classe Caneta para entender melhor os métodos especiais
```java
Classe Caneta {

    public String modelo;
    private float ponta;
    
    public getModelo() {
        return modelo;
    }

    public setModelo(String m) {
        this.modelo = m;
    }
    
    private getPonta() {
        return modelo;
    }
    
    private setPonta(float p) {
        this.ponta = p;
    }
}

Caneta c1 = new Caneta();

c1.setModelo("BIC");

c1.setPonta(0.6);

System.out.println(c1.getModelo());

System.out.println(c1.getPonta());
```

## Métodos construtores

Construct (método de inicialização de classe)

- Ao você comprar uma caneta ela ja vem com uma cor pré definida e tampada

Obs: esse método é definido com o mesmo nome de classe e sem indicação de tipo de retorno.

Voltando a nossa classe Caneta temos:

```java
Classe Caneta {

    public Caneta() {
        tampar();
        this.cor = "Azul";
    }
}

//pelo método construtor essa caneta ja tem tampada e com uma cor padrão que é a Azul
Caneta c1 = new Caneta();
```

Novo exemplo de um método construtor:

```java
Classe Caneta {

    public Caneta(String m, String c, float p) { 
        setModelo(m);
        setCor(c);
        setPonta(p);
    }
}

Caneta c1 = new Caneta("BIC", "Azul", 0.5);
