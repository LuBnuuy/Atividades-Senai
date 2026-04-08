package Exemplos;

import java.util.Scanner;

public class exemplo_scanner {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in); // <- scanner serve para ler, digitar coisas.

        String text;
        int num;
        double point;

        System.out.println("Digite seu nome: ");
        text = sc.nextLine();
        System.out.println("Digite sua idade: ");
        num = sc.nextInt();
        System.out.println("Digite a sua altura: ");
        point = sc.nextDouble();
        System.out.println("Resumo de tudo: "+text+", "+num+", "+point);

        sc.close();

        /*
        sc.next(); <- recebe tipo string(Texto)
        sc.nextInt(); <- recebe tipos númericos.(ex: 2.0 ou 2)
        sc.nextDouble(); <- recebe tipo ponto flutuante (ex: 2.2)
        sx.nextLine(); <- para palavras compostas ou para textos longos.

         */
    }
}
