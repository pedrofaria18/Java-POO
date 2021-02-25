package Prática.Aula02;

public class App {
    public static void main(String[] args) {
        // Instanciando uma caneta (c1)
        Caneta c1 = new Caneta();

        // Atribuindo algo ao método
        c1.cor = "Vermelho";
        c1.ponta = 0.5f;

        // Chamada ao método
        c1.tampar();
        c1.status();
        c1.rabiscar();


        // Instanciando outra caneta (c2)
        Caneta c2 = new Caneta();

        c2.cor = "Azul";
        c2.ponta = 0.8f;

        c2.destampar();
        c2.status();
        c2.rabiscar();

    }
}
