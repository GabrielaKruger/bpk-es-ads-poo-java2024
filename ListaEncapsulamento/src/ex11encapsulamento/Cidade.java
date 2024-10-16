package ex11encapsulamento;

public class Cidade {
    private String nome;
    private int populacao;
    private String estado;

    public Cidade(String nome, int populacao, String estado) {
        this.nome = nome;
        setPopulacao(populacao);
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        if (populacao >= 0) {
            this.populacao = populacao;
        } else {
            System.out.println("População inválida.");
        }
    }

    public String getEstado() {
        return estado;
    }

    public void aumentarPopulacao(int quantidade) {
        if (quantidade > 0) {
            populacao += quantidade;
            System.out.println("População aumentada em " + quantidade);
        } else {
            System.out.println("Quantidade inválida para aumentar a população.");
        }
    }

    public void diminuirPopulacao(int quantidade) {
        if (quantidade > 0 && quantidade <= populacao) {
            populacao -= quantidade;
            System.out.println("População diminuída em " + quantidade);
        } else {
            System.out.println("Quantidade inválida para diminuir a população.");
        }
    }

    public static void main(String[] args) {
        Cidade cidade = new Cidade("Palotina", 30000, "PR");
        cidade.aumentarPopulacao(50000);
        cidade.diminuirPopulacao(20000);
    }
}
