package Prática.Aula03;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status() {
        System.out.println("Você tem uma caneta de modelo " + this.modelo + ", com a cor " + this.cor + ", de ponta " + this.ponta + ", atualmente está com " + this.carga + "% de carga e se encontra " + this.tampada + " para tampada");
    }

    public void rabiscar() {
        if(tampada) System.out.println("Não tem como rabiscar pois está tampada!");
        else System.out.println("Rabiscou!");
    }

    protected void tampar() {
        this.tampada = true;
    }

    protected void destampar() {
        this.tampada = false;
    }
}
