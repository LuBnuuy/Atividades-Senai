package repeticao;

public class Exercicio18 {
    public static void executar() {
        System.out.println("Números primos entre 1 e 100:");

        if (1 <= 100) {
        }

        for (int numero = 2; numero <= 100; numero++) {
            if (ehPrimo(numero)) {
                System.out.print(numero + " ");
            }
        }

        System.out.println();
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}