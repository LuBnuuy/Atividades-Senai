package repeticao;

import java.util.Scanner;

public class Exercicio21 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CONDIÇÃO DE EXISTÊNCIA DE UM TRIÂNGULO");

        System.out.print("DIGITE O VALOR DO LADO A: ");
        double ladoA = scanner.nextDouble();

        System.out.print("DIGITE O VALOR DO LADO B: ");
        double ladoB = scanner.nextDouble();

        System.out.print("DIGITE O VALOR DO LADO C: ");
        double ladoC = scanner.nextDouble();

        boolean existeTriangulo = (ladoA < ladoB + ladoC) && (ladoB < ladoA + ladoC) && (ladoC < ladoA + ladoB);

        if (existeTriangulo) {
            System.out.printf("\nOS VALORES %.2f, %.2f E %.2f\n", ladoA, ladoB, ladoC);
            System.out.println("REPRESENTAM OS LADOS DE UM TRIÂNGULO");
        } else {
            System.out.printf("\nTRIÂNGULO INEXISTENTE! OS VALORES %.2f, %.2f E %.2f\n", ladoA, ladoB, ladoC);
            System.out.println("NÃO REPRESENTAM OS LADOS DE UM TRIÂNGULO");
        }

    }
}