package Prática.Aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Você tem uma caneta de modelo " + this.modelo + ", com a cor " + this.cor + ", de ponta " + this.ponta + ", atualmente está com " + this.carga + "% de carga e se encontra " + this.tampada + " para tampada");
    }

    void rabiscar() {
        if(tampada) System.out.println("Não tem como rabiscar pois está tampada!");
        else System.out.println("Rabiscou!");
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
