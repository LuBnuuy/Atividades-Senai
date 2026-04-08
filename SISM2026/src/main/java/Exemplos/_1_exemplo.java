package Exemplos;

import java.util.Locale;

public class _1_exemplo {

    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int soma = x + y;


        System.out.println("Hello World");
        System.out.println(x);
        System.out.println(y);
        System.out.println(x+y);
        /*
        O professor me ensinou sobre SOUT, MAIN e SOMA.
        Eu tenho que usar aspas duplas para imprimir (saída/printar) tipo STRING
        MAIN ou PSVM
         */

        System.out.println("O resultado da soma é: "+ soma);
        System.out.println(x+" + "+y+" = "+soma);

        Locale.setDefault(Locale.US);
        double j = 10.35784;
        System.out.println(j);
        System.out.printf("%.2f%n" , j);
        System.out.printf("%.4f%n" , j);




    }
}
