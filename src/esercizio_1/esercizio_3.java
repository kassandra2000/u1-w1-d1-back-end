package esercizio_1;

public class esercizio_3 {
    public static void main(String[] args) {
        String[] arrayOfStrings = {"uno", "due", "tre", "quattro", "cinque"};
        String numberSix = "six";
        for (int i = 0; i < arrayOfStrings.length; i++) {
            System.out.println(arrayOfStrings);
        }

        //String[] arr = insertIntoArray(arrayOfStrings, numberSix);
        //for (int i = 0; i <arr.length ; i++) {

        //System.out.println(arr[i]);
        //}

        insertIntoArray(arrayOfStrings, numberSix);


    }

    public static void insertIntoArray(String[] arr, String numStr) {
        String[] newArrayOfStrings;
        newArrayOfStrings = new String[6];
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);
            if (i == 2) {
                System.out.println(newArrayOfStrings[i] = numStr);
            }
            newArrayOfStrings[i] = arr[i];
            System.out.println(newArrayOfStrings[i]);


        }


    }
}


