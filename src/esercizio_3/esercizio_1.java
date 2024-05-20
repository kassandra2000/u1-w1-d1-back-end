package esercizio_3;

import java.util.Scanner;

public class esercizio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insersci lato 1 del rettangolo (numero con virgola)");
        double side1 = Double.parseDouble(sc.nextLine());
        System.out.println("insersci lato 2 del rettangolo (numero con virgola)");
        double side2 = Double.parseDouble(sc.nextLine());
        //System.out.println("il perimetro del rettangolo è: " + perimeter(2.5, 3.9));
        System.out.println("il perimetro del rettangolo è: " + perimeter(side1, side2));


        System.out.println("insersci un numero e scopri se è pari o dispari");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println("il numero è: " + evenOrOdd(number));
        System.out.println("insersci un altro numero e scopri se è pari o dispari");
        int number2 = Integer.parseInt(sc.nextLine());
        System.out.println("il numero è: " + evenOrOdd(number2));


        System.out.println("insersci lato 1 del triangolo");
        double firstSide = Double.parseDouble(sc.nextLine());
        System.out.println("insersci lato 2 del triangolo");
        double secondSide = Double.parseDouble(sc.nextLine());
        System.out.println("insersci lato 3 del triangolo");
        double thirdSide = Double.parseDouble(sc.nextLine());
        System.out.println("L'area del triangolo è: " + area(firstSide, secondSide, thirdSide));

    }

    public static double perimeter(double num1, double num2) {
        return 2 * num1 + 2 * num2;
    }

    public static String evenOrOdd(int num1) {
        if (num1 % 2 == 0) {
            return "pari";
        } else {
            return "dispari";
        }
    }

    public static double area(double num1, double num2, double num3) {
        double p = (num1 + num2 + num3) / 2;
        double a = Math.sqrt(p * (p - num1) * (p - num2) * (p - num3));
        return a;
    }


}
