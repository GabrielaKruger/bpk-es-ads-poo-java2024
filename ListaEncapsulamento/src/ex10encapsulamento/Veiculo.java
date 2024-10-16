package ex10encapsulamento;
public class Veiculo {
    private String tipo;
    private String placa;
    private String cor;

    public Veiculo(String tipo, String placa, String cor) {
        this.tipo = tipo;
        this.placa = placa;
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public void abastecer() {
        System.out.println("O veículo com placa " + placa + " foi abastecido.");
    }

    public void lavar() {
        System.out.println("O veículo com placa " + placa + " foi lavado.");
    }

    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Carro", "12345GA", "Vermelho");
        veiculo.abastecer();
        veiculo.lavar();
    }
}
