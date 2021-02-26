package Prática.Aula03;

public class App {
    public static void main(String[] args) {
        // Instanciando uma caneta (c1)
        Caneta c1 = new Caneta();

        // public -> posso atribuir sem problemas
        c1.modelo = "Bic";
        c1.cor = "Azul";

        // private -> no momento não posso atribuir nada para um atributo privado
        //c1.ponta = 0.5;

        // protected -> pelo App estar instanciando a classe Caneta, eu consigo atribuir a ela mesmo sendo protected
        c1.carga = 70;

        // mesmo o atributo tampar estando privado, por conta do método estar publico eu consigo modificar o valor de tampada pelo método
        c1.tampar();

        c1.status();

    }
}
