package ex6encapsulamento;

public class Computador {
    private String processador;
    private int memoriaRAM;
    private int armazenamento;

    public Computador(String processador, int memoriaRAM, int armazenamento) {
        this.processador = processador;
        setMemoriaRAM(memoriaRAM);
        setArmazenamento(armazenamento);
    }

    public String getProcessador() {
        return processador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        if (memoriaRAM > 0) {
            this.memoriaRAM = memoriaRAM;
        } else {
            System.out.println("Memória RAM inválida.");
        }
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        if (armazenamento > 0) {
            this.armazenamento = armazenamento;
        } else {
            System.out.println("Armazenamento inválido.");
        }
    }

    public void ligar() {
        System.out.println("Computador ligado.");
    }

    public void desligar() {
        System.out.println("Computador desligado.");
    }

    public static void main(String[] args) {
        Computador computador = new Computador("Windows", 16, 540);
        computador.ligar();
        computador.desligar();
    }
}
