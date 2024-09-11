package Ex6lista2;

public class Computador {
    String processador;
    int memoriaRAM;
    int armazenamento;
    boolean ligado;

    public Computador(String processador, int memoriaRAM, int armazenamento) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.ligado = false;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O computador está ligado.");
        } else {
            System.out.println("O computador já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O computador está desligado.");
        } else {
            System.out.println("O computador já está desligado.");
        }
    }
}

