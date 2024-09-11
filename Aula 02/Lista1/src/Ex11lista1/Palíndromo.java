package Ex11lista1;

import java.util.Scanner;

public class Palíndromo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a palavra: ");
        String palavra = scanner.nextLine();

        String reverso = new StringBuilder(palavra).reverse().toString();

        if (palavra.equalsIgnoreCase(reverso)) {
            System.out.println(palavra + " é um palíndromo.");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }

        scanner.close();
    }
}
