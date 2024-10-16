package ex16encapsulamento;

public class Loja {
    private String nome;
    private String endereco;
    private String telefone;

    public Loja(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void abrir() {
        System.out.println("A loja '" + nome + "' está aberta.");
    }

    public void fechar() {
        System.out.println("A loja '" + nome + "' está fechada.");
    }

    public static void main(String[] args) {
        Loja loja = new Loja("Divino Amor", "Rua dos Livros, Av. Independência", "44 99999-9999");
        loja.abrir();
        loja.fechar();
    }
}
