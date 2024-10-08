package ex12encapsulamento;


public class Filme {
    private String titulo;
    private String diretor;
    private int duracao; // duração em minutos

    public Filme(String titulo, String diretor, int duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        setDuracao(duracao);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        if (duracao > 0) {
            this.duracao = duracao;
        } else {
            System.out.println("Duração inválida.");
        }
    }

    public void iniciar() {
        System.out.println("O filme '" + titulo + "' está começando.");
    }

    public void parar() {
        System.out.println("O filme '" + titulo + "' foi pausado.");
    }

    public static void main(String[] args) {
        Filme filme = new Filme("Alice no País das Maravilhas", "Lewis", 150);
        filme.iniciar();
        filme.parar();
    }
}
