package Ex4lista2;


public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(77777);
        conta.depositar(700.0);
        conta.sacar(200.0);
    }
}