package Prática.Aula04;

public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public Caneta() {
        this.modelo = "Faber";
        this.cor = "Vermelha";
        this.ponta = 0.8f;
        this.carga = 60;
        tampar();
    }

    public Caneta(String m, String co, float p, int ca) {
        this.modelo = m;
        this.cor = co;
        this.ponta = p;
        this.carga = ca;
        tampar();
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public int getCarga() {
        return this.carga;
    }

    public void setCarga(int c) {
        this.carga = c;
    }

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