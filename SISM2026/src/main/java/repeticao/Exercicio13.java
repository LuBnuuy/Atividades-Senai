package repeticao;

import java.util.Scanner;

public class Exercicio13 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para ver sua tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada de multiplicação do número " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}