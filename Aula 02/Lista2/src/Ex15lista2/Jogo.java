package Ex15lista2;


public class Jogo {
    private String nome;
    private String genero;
    private double preco;

    public Jogo(String nome, String genero, double preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

    public void iniciar() {
        System.out.println("O jogo " + nome + " está começando.");
    }

    public void pausar() {
        System.out.println("O jogo " + nome + " foi pausado.");
    }
}
