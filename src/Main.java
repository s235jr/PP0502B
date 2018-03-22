import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner scaner = new Scanner(System.in);
        int numberOfCases = Integer.parseInt(scaner.nextLine());
        String[] arrayOfInput = new String[numberOfCases];

        for (int i = 0; i < numberOfCases; i++) {
            arrayOfInput[i] = scaner.nextLine();
        }

        for (int i = 0; i < numberOfCases; i++) {

            String[] array = divideArrayOfString(arrayOfInput[i]);
            System.out.println(doStringa(invert(array)));
        }

    }

    public static String[] divideArrayOfString(String arrayOfInput) {

        String[] arrayOfValue = arrayOfInput.split(" ");
        int lengthOfArray = Integer.parseInt(arrayOfValue[0]);
        String[] inputArrayToInvert = new String[lengthOfArray];

        for (int i = 1; i < arrayOfValue.length; i++) {
            inputArrayToInvert[i - 1] = arrayOfValue[i];
        }
        return inputArrayToInvert;
    }

    public static String[] invert(String[] arrayToInvert) {
        String[] invertArray = new String[arrayToInvert.length];
        for (int i = 0; i < arrayToInvert.length; i++) {
            invertArray[arrayToInvert.length - 1 - i] = arrayToInvert[i];
        }
        return invertArray;
    }

    public static String doStringa(String[] array) {

        String arrayInSTring = "";
        for (int i = 0; i < array.length; i++) {
            arrayInSTring = arrayInSTring + array[i] + " ";
        }
        return arrayInSTring;
    }
}
