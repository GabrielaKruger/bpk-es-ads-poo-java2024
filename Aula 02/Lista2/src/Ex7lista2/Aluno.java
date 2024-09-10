package Ex7lista2;


public class Aluno {
    String nome;
    int matricula;
    String curso;
    double[] notas;

    public Aluno(String nome, int matricula, String curso, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.notas = notas;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}


