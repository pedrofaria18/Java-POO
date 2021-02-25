# Aula 2 — O que é um objeto?

### Objeto

Coisa material ou abstrata que pode ser percebida pelos sentidos e descrita por meio das suas características, comportamentos e estado atual.

### Exemplo de uma caneta para entender objeto.

→ Segue todos os requisitos de um objeto

→ Sempre tem uma certa forma, que no nosso caso vamos chamar de classe. Já que vamos chamar essa forma de classe, temos que fazer 3 perguntas:

    - Coisas que tenho (atributos)

      → Modelo

      → Cor

      → Ponta

      → Carga

      → Tampada

    - Coisas que faço (métodos)

      → Escrever

      → Rabiscar

      → Pintar

      → Tampar

      → Destampar

    - Como estou agora (estado)

      →50% de carga

      → destampada

      → escrevendo

→ TODO OBJETO TEM ATRIBUTOS, MÉTODOS E ESTADO

### Exemplo de uma classe caneta
``` java
  public class Caneta {
    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;

    public void rabiscar() {
        if(tampada) System.out.println("Não tem como rabiscar pois está tampada");
        else System.out.println("Rabiscou");
    }

    public void tampar() {

    }
}
```
### Definições
    - Classe: define os atributos e métodos comuns que serão compartilhados por um objeto
    - Objeto: é a instancia de uma classe