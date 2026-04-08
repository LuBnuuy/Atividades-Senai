package Atividades;

import java.util.Locale;

public class atv_fixação_1_ {
    public static void main(String[] args) {

        //

        String p1 = "Computer";
        String p2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure= 53.24234567;

        System.out.printf("Products: "+p1+", which price is $%.2f%n", price1);
        System.out.printf(p2+", which price is $%.2f%n%n" , price2);

        System.out.printf("Record: "+age+" years old, code "+code+" and gender: %c%n%n" , gender);

        System.out.printf("Measue with eigh decimal places: %.8f%n" , measure);
        System.out.printf("Rouded (three decimal places):  %.3f%n", measure);

        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);

    }
}
