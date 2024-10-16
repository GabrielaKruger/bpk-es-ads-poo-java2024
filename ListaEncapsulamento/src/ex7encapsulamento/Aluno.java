package ex7encapsulamento;
public class Aluno {
    private String nome;
    private String matricula;
    private String curso;

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Gabriela", "12345", "ADS");
        double[] notas = {9.0, 8.0, 9.0,10.0};
        System.out.println("Média do aluno: " + aluno.calcularMedia(notas));
    }
}
