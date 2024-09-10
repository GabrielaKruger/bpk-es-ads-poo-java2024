package Ex21lista2;


public class Cozinha {
    private String tipo;
    private int quantidadePessoas;
    private String cor;

    public Cozinha(String tipo, int quantidadePessoas, String cor) {
        this.tipo = tipo;
        this.quantidadePessoas = quantidadePessoas;
        this.cor = cor;
    }

    public void cozinhar() {
        System.out.println("A cozinha " + tipo + " está em uso para cozinhar.");
    }

    public void limpar() {
        System.out.println("A cozinha " + tipo + " está sendo limpa.");
    }
}
