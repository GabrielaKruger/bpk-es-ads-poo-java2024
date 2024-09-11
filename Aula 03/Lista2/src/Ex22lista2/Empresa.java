package Ex22lista2;


public class Empresa {
    private String nome;
    private String CNPJ;
    private int numeroFuncionarios;

    public Empresa(String nome, String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.numeroFuncionarios = 0;
    }

    public void contratarFuncionario() {
        numeroFuncionarios++;
        System.out.println("Um novo funcionário foi contratado na empresa " + nome + ". Total de funcionários: " + numeroFuncionarios);
    }

    public void demitirFuncionario() {
        if (numeroFuncionarios > 0) {
            numeroFuncionarios--;
            System.out.println("Um funcionário foi demitido da empresa " + nome + ". Total de funcionários: " + numeroFuncionarios);
        } else {
            System.out.println("Não tem funcionários para demitir na empresa " + nome + ".");
        }
    }
}
