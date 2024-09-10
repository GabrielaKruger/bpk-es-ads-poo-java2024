package Ex10lista2;

public class Veiculo {
    private String tipo;
    private String placa;
    private String cor;

    public Veiculo(String tipo, String placa, String cor) {
        this.tipo = tipo;
        this.placa = placa;
        this.cor = cor;
    }

    public void abastecer() {
        System.out.println("Veículo abastecido.");
    }

    public void lavar() {
        System.out.println("Veículo lavado.");
    }
}
