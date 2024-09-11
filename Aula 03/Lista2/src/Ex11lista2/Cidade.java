public class Cidade {
    // Atributos da classe Cidade
    private String nome;
    private int populacao;
    private String estado;


    public Cidade(String nome, int populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }


    public void aumentarPopulacao(int quantidade) {
        if (quantidade > 0) {
            this.populacao += quantidade;
            System.out.println("População aumentada em " + quantidade + ". Nova população: " + this.populacao);
        } else {
            System.out.println("A quantidade deve ser positiva para aumentar a população.");
        }
    }


    public void diminuirPopulacao(int quantidade) {
        if (quantidade > 0 && quantidade <= this.populacao) {
            this.populacao -= quantidade;
            System.out.println("População diminuída em " + quantidade + ". Nova população: " + this.populacao);
        } else {
            System.out.println("Quantidade inválida para diminuir a população.");
        }
    }


    public String getNome() {
        return nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public String getEstado() {
        return estado;
    }


    public static void main(String[] args) {

        Cidade cidade = new Cidade("Palotina",30000 , "PR");


        System.out.println("Cidade: " + cidade.getNome());
        System.out.println("População: " + cidade.getPopulacao());
        System.out.println("Estado: " + cidade.getEstado());


        cidade.aumentarPopulacao(2000);


        cidade.diminuirPopulacao(2000);
    }
}
