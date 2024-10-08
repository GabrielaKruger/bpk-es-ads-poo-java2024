package ex22encapsulamento;

public class Empresa {
    private String nome;
    private String CNPJ;
    private int numeroFuncionarios;

    public Empresa(String nome, String CNPJ, int numeroFuncionarios) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        setNumeroFuncionarios(numeroFuncionarios);
    }

    public String getNome() {
        return nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        if (numeroFuncionarios >= 0) {
            this.numeroFuncionarios = numeroFuncionarios;
        } else {
            System.out.println("Número de funcionários inválido.");
        }
    }

    public void contratarFuncionario() {
        numeroFuncionarios++;
        System.out.println("Um funcionário foi contratado. Total de funcionários: " + numeroFuncionarios);
    }

    public void demitirFuncionario() {
        if (numeroFuncionarios > 0) {
            numeroFuncionarios--;
            System.out.println("Um funcionário foi demitido. Total de funcionários: " + numeroFuncionarios);
        } else {
            System.out.println("Não há funcionários para demitir.");
        }
    }

    public static void main(String[] args) {
        Empresa empresa = new Empresa("Pigma", "45.455.455/0001-45", 10);
        empresa.contratarFuncionario();
        empresa.demitirFuncionario();
    }
}
