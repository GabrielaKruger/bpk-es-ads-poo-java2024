package ex8encapsulamento;


public class Professor {
    private String nome;
    private String disciplina;
    private double salario;

    public Professor(String nome, String disciplina, double salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("Salário inválido.");
        }
    }

    public void darAula() {
        System.out.println(nome + " está dando aula de " + disciplina + ".");
    }

    public void corrigirProvas() {
        System.out.println(nome + " está corrigindo provas.");
    }

    public static void main(String[] args) {
        Professor professor = new Professor("Jhoni", "Programação Orientaa a Objetos", 5500);
        professor.darAula();
        professor.corrigirProvas();
    }
}
