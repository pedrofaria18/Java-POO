package Prática.Aula04;

public class App {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.setModelo("Bic");
        c1.setCor("Azul");
        c1.setPonta(0.5f);
        c1.setCarga(50);
        c1.status();

        Caneta c2 = new Caneta();
        c2.status();

        Caneta c3 = new Caneta("Tilibra", "Verde", 0.7f, 90);
        c3.status();
    }
}

