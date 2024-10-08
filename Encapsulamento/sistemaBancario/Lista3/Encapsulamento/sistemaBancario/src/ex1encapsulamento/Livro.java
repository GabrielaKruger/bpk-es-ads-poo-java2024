package ex1encapsulamento;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;

    public Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        setNumeroDePaginas(numeroDePaginas);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        if (numeroDePaginas > 0) {
            this.numeroDePaginas = numeroDePaginas;
        } else {
            System.out.println("Número de páginas inválido.");
        }
    }

    public void abrirLivro() {
        System.out.println("O livro foi aberto.");
    }

    public void lerPagina() {
        System.out.println("Lendo uma página do livro.");
    }

    public static void main(String[] args) {
        Livro livro = new Livro("livro1", "Gabi", 200);
        livro.abrirLivro();
        livro.lerPagina();
    }
}