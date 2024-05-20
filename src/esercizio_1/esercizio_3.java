package esercizio_1;

public class esercizio_3 {
    public static void main(String[] args) {
        String[] arrayOfStrings = {"uno", "due", "tre", "quattro", "cinque"};
        String numberSix = "six";
        for (int i = 0; i < arrayOfStrings.length; i++) {
            System.out.println(arrayOfStrings);
        }

        String[] arr = insertIntoArray(arrayOfStrings, numberSix);
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }

        //System.out.println(insertIntoArray(arrayOfStrings, numberSix););




    }

    public static String[] insertIntoArray(String[] arr, String numStr) {
        String[] newArrayOfStrings;
        newArrayOfStrings = new String[6];
        for (int i = 0; i < newArrayOfStrings.length; i++) {
            //System.out.println(arr[i]);
            if (i < 2) {
                newArrayOfStrings[i] = arr[i];
            } else if (i == 2) {
                newArrayOfStrings[i] = numStr;
            } else {
                newArrayOfStrings[i] = arr[i - 1];
            }

        }
        return newArrayOfStrings;


    }
}


