package repeticao;

public class Exercicio7 {
    public static void executar() {
        System.out.println("Exemplo do loop while:");
        int contadorWhile = 0;
        while (contadorWhile < 5) {
            System.out.println("While: Contador = " + contadorWhile);
            contadorWhile++;
        }
        System.out.println();

        System.out.println("Exemplo do loop do-while:");
        int contadorDoWhile = 0;
        do {
            System.out.println("Do-While: Contador = " + contadorDoWhile);
            contadorDoWhile++;
        } while (contadorDoWhile < 5);
        System.out.println();

        System.out.println("Exemplo do loop for:");
        for (int contadorFor = 0; contadorFor < 5; contadorFor++) {
            System.out.println("For: Contador = " + contadorFor);
        }
        System.out.println();

        System.out.println("Demonstração da principal diferença (condição no final do do-while):");
        int contadorDoWhileUnico = 5;
        do {
            System.out.println("Do-While (executa ao menos uma vez): Contador = " + contadorDoWhileUnico);
            contadorDoWhileUnico++;
        } while (contadorDoWhileUnico < 5);
        System.out.println();

        int contadorWhileUnico = 5;
        while (contadorWhileUnico < 5) {
            System.out.println("While (pode não executar): Contador = " + contadorWhileUnico);
            contadorWhileUnico++;
        }
        }
}