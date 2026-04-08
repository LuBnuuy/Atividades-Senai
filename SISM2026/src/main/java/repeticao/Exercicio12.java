package repeticao;

public class Exercicio12 {
    public static void executar() {
        System.out.println("Os 100 primeiros números pares são:");

        int numeroPar = 2;

        for (int i = 1; i <= 100; i++) {
            System.out.print(numeroPar + " ");
            numeroPar += 2;
        }

        System.out.println();
    }
}
