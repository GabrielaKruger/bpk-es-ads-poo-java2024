package Ex8lista2;

public class Professor {
    String nome;
    String disciplina;
    double salario;

    public Professor(String nome, String disciplina, double salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public void darAula() {
        System.out.println(nome + " está dando aula de " + disciplina);
    }

    public void corrigirProvas() {
        System.out.println(nome + " está corrigindo provas.");
    }
}


