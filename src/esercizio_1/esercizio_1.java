package esercizio_1;

public class esercizio_1 {
    public static void main(String[] args) {
        //metodo con return
        int product = multiplication(3, 2);
        System.out.println("il risultato è: " + product);

        //metodo senza return
        multiplication2(2, 4);
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static void multiplication2(int num1, int num2) {
        System.out.println("la somma è: " + multiplication(num1, num2));
    }
}
