package ex20encapsulamento;

public class Bicicleta {
    private String marca;
    private String modelo;
    private double tamanhoRoda; // em polegadas

    public Bicicleta(String marca, String modelo, double tamanhoRoda) {
        this.marca = marca;
        this.modelo = modelo;
        setTamanhoRoda(tamanhoRoda);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getTamanhoRoda() {
        return tamanhoRoda;
    }

    public void setTamanhoRoda(double tamanhoRoda) {
        if (tamanhoRoda > 0) {
            this.tamanhoRoda = tamanhoRoda;
        } else {
            System.out.println("Tamanho da roda inválido.");
        }
    }

    public void pedalar() {
        System.out.println("Você está pedalando a bicicleta " + marca + " " + modelo);
    }

    public void frear() {
        System.out.println("Você freou a bicicleta " + marca + " " + modelo);
    }

    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta("Caloi", "Modelo", 30);
        bicicleta.pedalar();
        bicicleta.frear();
    }
}
