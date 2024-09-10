package Ex5lista2;

public class Cachorro {
    String nome;
    String raca;
    int idade;

    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public void latir() {
        System.out.println(nome + " está latindo!");
    }

    public void correr() {
        System.out.println(nome + " está correndo!");
    }
}

