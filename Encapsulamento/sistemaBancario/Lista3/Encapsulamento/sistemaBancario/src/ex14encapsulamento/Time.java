
package ex14encapsulamento;
import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private String tecnico;
    private int numeroDeJogadores;
    private List<String> jogadores;

    public Time(String nome, String tecnico) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.jogadores = new ArrayList<>();
        this.numeroDeJogadores = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public int getNumeroDeJogadores() {
        return numeroDeJogadores;
    }

    public void adicionarJogador(String jogador) {
        jogadores.add(jogador);
        numeroDeJogadores++;
        System.out.println("Jogador " + jogador + " adicionado ao time.");
    }

    public void removerJogador(String jogador) {
        if (jogadores.remove(jogador)) {
            numeroDeJogadores--;
            System.out.println("Jogador " + jogador + " removido do time.");
        } else {
            System.out.println("Jogador " + jogador + " não encontrado no time.");
        }
    }

    public static void main(String[] args) {
        Time time = new Time("Barcelona", "Xavi");
        time.adicionarJogador("Neymar");
        time.adicionarJogador("João");
        time.removerJogador("Neymar");
    }
}
