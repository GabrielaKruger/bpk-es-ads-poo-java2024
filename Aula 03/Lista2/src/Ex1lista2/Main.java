package Ex1lista2;


public class Main {
    public static void main(String[] args) {
        Livro meuLivro = new Livro("livro1", "Livro2", 200);
        meuLivro.abrirLivro();
        meuLivro.lerPagina();
        meuLivro.lerPagina();
    }
}