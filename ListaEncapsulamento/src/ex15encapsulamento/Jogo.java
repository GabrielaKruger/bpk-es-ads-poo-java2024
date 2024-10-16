package ex15encapsulamento;


public class Jogo {
    private String nome;
    private String genero;
    private double preco;

    public Jogo(String nome, String genero, double preco) {
        this.nome = nome;
        this.genero = genero;
        setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido.");
        }
    }

    public void iniciar() {
        System.out.println("O jogo '" + nome + "' está começando.");
    }

    public void pausar() {
        System.out.println("O jogo '" + nome + "' foi pausado.");
    }

    public static void main(String[] args) {
        Jogo jogo = new Jogo("Minecraft", "RPG", 20.00);
        jogo.iniciar();
        jogo.pausar();
    }
}
