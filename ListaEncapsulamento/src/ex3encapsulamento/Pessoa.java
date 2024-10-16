package ex3encapsulamento;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        setIdade(idade);
        setAltura(altura);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Altura inválida.");
        }
    }

    public void apresentar() {
        System.out.println("Oie, eu sou a " + nome + ", tenho " + idade + " anos e " + altura + " metros de altura.");
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Gabriela", 17, 1.70);
        pessoa.apresentar();
    }
}
