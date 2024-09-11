package Ex14lista1;

import java.util.Scanner;

public class ContagemVogais {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira uma string (sequências de caracteres alfanuméricos (letras, números e/ou símbolos) amplamente usadas em programação.: ");
        String input = scanner.nextLine();
        scanner.close();

        int count = 0;
        String vogais = "aeiouAEIOU";

        for (int i = 0; i < input.length(); i++) {
            if (vogais.indexOf(input.charAt(i)) != -1) {
                count++;
            }
        }

        System.out.println("Número de vogais: " + count);
    }
}

