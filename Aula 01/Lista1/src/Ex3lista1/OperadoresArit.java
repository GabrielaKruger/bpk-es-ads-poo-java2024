package Ex3lista1;

import java.util.Scanner;

public class OperadoresArit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Insira o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));
        System.out.println("Divisão: " + (num1 / num2));

        scanner.close();
    }
}
