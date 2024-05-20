package esercizio_2;

import java.util.Scanner;

public class esercizio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci il tuo nome");
        String name = sc.nextLine();
        System.out.println("inserisci il tuo cognome");
        String surname = sc.nextLine();
        System.out.println("inserisci la tua età");
        int years = Integer.parseInt(sc.nextLine());
        System.out.println("ciao " + name + " " + surname + " hai " + years + " anni!");
        System.out.println("ciao hai " + years + " anni " + surname + " " + name + " (reverse)");
    }


}
