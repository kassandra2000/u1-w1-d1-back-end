package esercizio_1;

public class esercizio_2 {
    public static void main(String[] args) {
        //metodo con return
        String user = concat("Luca", 20);
        System.out.println(user);

        //metodo senza return
        concat2("Sonia", 30);
    }

    public static String concat(String name, int years) {
        return name + " ha " + years + " anni";
    }

    public static void concat2(String name, int years) {
       
        System.out.println(concat(name, years));
    }

}
