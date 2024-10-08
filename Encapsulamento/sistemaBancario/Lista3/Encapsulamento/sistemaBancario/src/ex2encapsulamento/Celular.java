package ex2encapsulamento;
public class Celular {
    private String marca;
    private String modelo;
    private int capacidadeBateria;

    public Celular(String marca, String modelo, int capacidadeBateria) {
        this.marca = marca;
        this.modelo = modelo;
        setCapacidadeBateria(capacidadeBateria);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public void setCapacidadeBateria(int capacidadeBateria) {
        if (capacidadeBateria > 0) {
            this.capacidadeBateria = capacidadeBateria;
        } else {
            System.out.println("Inválido.");
        }
    }

    public void ligar() {
        System.out.println("Celular ligado.");
    }

    public void desligar() {
        System.out.println("Celular desligado.");
    }

    public static void main(String[] args) {
        Celular celular = new Celular("Iphone", "11", 4000);
        celular.ligar();
        celular.desligar();
    }
}
