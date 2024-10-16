package ex5encapsulamento;
public class Cachorro {
    private String nome;
    private String raca;
    private int idade;

    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");
        }
    }

    public void latir() {
        System.out.println(nome + " está latindo.");
    }

    public void correr() {
        System.out.println(nome + " está correndo.");
    }

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Fofinha", "Vira-lata", 7);
        cachorro.latir();
        cachorro.correr();
    }
}
