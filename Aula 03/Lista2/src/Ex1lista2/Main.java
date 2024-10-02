package Ex1lista2;

public class Main {
    public static void main(String[] args) {
        Livro meuLivro = new Livro("Livro 1", "Autor 1", 200);
        meuLivro.abrirLivro();
        meuLivro.lerPagina(); 
        meuLivro.lerPagina(); 
    }
}

package Ex1lista2;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int paginaAtual;

    public Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.paginaAtual = 0; 
    }

    public void abrirLivro() {
        this.paginaAtual = 1; 
        System.out.println("O livro foi aberto na página " + this.paginaAtual);
    }

    public void lerPagina() {
        if (this.paginaAtual < this.numeroDePaginas) {
            System.out.println("Lendo página " + this.paginaAtual);
            this.paginaAtual++;
        } else if (this.paginaAtual == this.numeroDePaginas) {
            System.out.println("Você já leu o livro.");
        } else {
            System.out.println("Abra o livro.");
        }
    }
}
