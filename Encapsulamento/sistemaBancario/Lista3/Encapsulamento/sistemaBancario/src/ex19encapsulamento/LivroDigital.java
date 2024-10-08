package ex19encapsulamento;


public class LivroDigital {
    private String titulo;
    private String autor;
    private double tamanhoArquivo; // em MB

    public LivroDigital(String titulo, String autor, double tamanhoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        setTamanhoArquivo(tamanhoArquivo);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        if (tamanhoArquivo > 0) {
            this.tamanhoArquivo = tamanhoArquivo;
        } else {
            System.out.println("Tamanho de arquivo inválido.");
        }
    }

    public void abrir() {
        System.out.println("O livro digital '" + titulo + "' foi aberto.");
    }

    public void fechar() {
        System.out.println("O livro digital '" + titulo + "' foi fechado.");
    }

    public static void main(String[] args) {
        LivroDigital livroDigital = new LivroDigital("1984", "Gabi", 5.0);
        livroDigital.abrir();
        livroDigital.fechar();
    }
}
