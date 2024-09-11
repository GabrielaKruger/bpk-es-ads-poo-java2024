package Ex7lista2;


public class Main {
    public static void main(String[] args) {
        double[] notas = {7.0, 8.0, 9.0, 10.0};
        Aluno aluno = new Aluno("Gabriela", 12345, "ADS", notas);
        System.out.println("A média de " + aluno.nome + " é " + aluno.calcularMedia());
    }
}