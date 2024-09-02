package Ex15lista1;

import java.util.Scanner;


public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int numero = scanner.nextInt();
        scanner.close();

        int fatorial = 1;

        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("Fatorial de " + numero + " é: " + fatorial);
    }
}

