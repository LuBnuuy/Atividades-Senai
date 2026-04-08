package repeticao;

import java.util.Scanner;

public class Exercicio11 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        int somaPares = 0;
        int quantidadePares = 0;
        int numero;

        System.out.println("Digite números inteiros (digite 0 para terminar):");

        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            if (numero != 0 && numero % 2 == 0) {
                somaPares += numero;
                quantidadePares++;
            }
        } while (numero != 0);

        if (quantidadePares > 0) {
            double media = (double) somaPares / quantidadePares;
            System.out.println("A média dos números pares digitados é: " + media);
        } else {
            System.out.println("Nenhum número par foi digitado.");
        }

    }
}
