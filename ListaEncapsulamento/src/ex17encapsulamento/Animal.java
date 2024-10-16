package ex17encapsulamento;


public class Animal {
    private String especie;
    private int idade;
    private double peso;

    public Animal(String especie, int idade, double peso) {
        this.especie = especie;
        setIdade(idade);
        setPeso(peso);
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("Peso inválido.");
        }
    }

    public void alimentar() {
        System.out.println("O animal da espécie " + especie + " foi alimentado.");
    }

    public void dormir() {
        System.out.println("O animal da espécie " + especie + " está dormindo.");
    }

    public static void main(String[] args) {
        Animal cachorro = new Animal("Gato", 3, 5);
        cachorro.alimentar();
        cachorro.dormir();
    }
}
