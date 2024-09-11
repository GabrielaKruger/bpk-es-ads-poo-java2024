package Ex9lista2;

public class Main  {
  public static void main(String[] args) {
    Produto produto = new Produto("Carregador", 29.90, 50);
    produto.aumentarEstoque(10);
    produto.diminuirEstoque(5);
  }
}