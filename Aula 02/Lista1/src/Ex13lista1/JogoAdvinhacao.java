package Ex13lista1;

import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = random.nextInt(100) + 1;
        int palpite;
        int tentativas = 0;

        do {
            System.out.print("Adivinhe o número (entre 1 e 100): ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("Muito baixo!(tente novamente)");
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto!(tente novamente)");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
            }
        } while (palpite != numeroSecreto);

        scanner.close();
    }
}
