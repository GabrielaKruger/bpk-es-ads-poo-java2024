package Ex20lista2;


public class Bicicleta {
    private String marca;
    private String modelo;
    private int tamanhoRoda;

    public Bicicleta(String marca, String modelo, int tamanhoRoda) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoRoda = tamanhoRoda;
    }

    public void pedalar() {
        System.out.println("A bicicleta " + marca + " " + modelo + " está em movimento.");
    }

    public void frear() {
        System.out.println("A bicicleta " + marca + " " + modelo + " foi freada.");
    }
}
