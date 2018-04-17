import java.util.ArrayList;

public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and a list of numbers as a parameter
        //  Returns the indeces of the numbers in the list where the first number is part of
        //  Returns an empty list if the number is not part any of the numbers in the list

        //  Example:
        System.out.println(subInt(1, new int[]{1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        System.out.println(subInt(9, new int[]{1, 11, 34, 52, 61}));
        //  should print: '[]'

    }

    public static ArrayList<Integer> subInt(int subNumber, int[] intArray) {
        ArrayList<Integer> goodNumbers = new ArrayList<>();

        for (int i = 0; i < intArray.length; i++) {
            String numberString = String.valueOf(intArray[i]);
            for (int j = 0; j < numberString.length(); j++) {
                if ((numberString.substring(j,j+1).equals(String.valueOf(subNumber))) && (!goodNumbers.contains(i))) {
                    goodNumbers.add(i);
                }
                //System.out.println(numberString.substring(j,j+1)+" "+String.valueOf(subNumber)+" "+numberString.substring(j,j+1).getClass()+" "+String.valueOf(subNumber).getClass());
            }
        }

        return goodNumbers;
    }

}