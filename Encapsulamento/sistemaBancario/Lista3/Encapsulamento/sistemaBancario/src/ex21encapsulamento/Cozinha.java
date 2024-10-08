package ex21encapsulamento;


public class Cozinha {
    private String tipo;
    private int quantidadePessoas;
    private String cor;

    public Cozinha(String tipo, int quantidadePessoas, String cor) {
        this.tipo = tipo;
        setQuantidadePessoas(quantidadePessoas);
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        if (quantidadePessoas > 0) {
            this.quantidadePessoas = quantidadePessoas;
        } else {
            System.out.println("Quantidade de pessoas inválida.");
        }
    }

    public String getCor() {
        return cor;
    }

    public void cozinhar() {
        System.out.println("A cozinha está sendo utilizada para cozinhar.");
    }

    public void limpar() {
        System.out.println("A cozinha foi limpa.");
    }

    public static void main(String[] args) {
        Cozinha cozinha = new Cozinha("Social", 5, "Amarelo");
        cozinha.cozinhar();
        cozinha.limpar();
    }
}
