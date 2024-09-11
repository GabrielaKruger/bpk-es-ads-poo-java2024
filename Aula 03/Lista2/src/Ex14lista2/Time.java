package Ex14lista2;


import java.util.ArrayList;

public class Time {
    private String nome;
    private String tecnico;
    private int numeroDeJogadores;
    private ArrayList<String> jogadores;

    public Time(String nome, String tecnico) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.jogadores = new ArrayList<>();
    }

    public void adicionarJogador(String jogador) {
        jogadores.add(jogador);
        numeroDeJogadores++;
        System.out.println(jogador + " foi adicionado ao time " + nome + ".");
    }

    public void removerJogador(String jogador) {
        if (jogadores.remove(jogador)) {
            numeroDeJogadores--;
            System.out.println(jogador + " foi removido do time " + nome + ".");
        } else {
            System.out.println(jogador + " não está no time " + nome + ".");
        }
    }
}
