package repeticao;

import java.util.Scanner;

public class Exercicio6 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Em que turno você estuda? (M - Matutino, V - Vespertino, N - Noturno): ");
        String turno = scanner.nextLine().toUpperCase();

        switch (turno) {
            case "M":
                System.out.println("Bom Dia!");
                break;
            case "V":
                System.out.println("Boa Tarde!");
                break;
            case "N":
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println("Turno inválido. Por favor, digite M, V ou N.");
                break;
        }
    }
}
