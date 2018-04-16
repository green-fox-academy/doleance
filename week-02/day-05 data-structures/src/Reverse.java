public class Reverse {

    public static String reversed(String s){
        String newString = "";
        for (int i = s.length()-1; i >= 0; i--) {
            newString += s.charAt(i);
        }
        return newString;
    }

    public static String reversed2(String s){
        String newString = "";
        for (int i = s.length()-1; i >= 0; i--) {
            newString = newString.concat(Character.toString(s.charAt(i)));
            //nem tudom, hogy kell charAt nélkül.
        }
        return newString;
    }

    public static void main(String... args){
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

        System.out.println(reversed);
        System.out.println(reversed(reversed));
        System.out.println(reversed2(reversed));
    }
}



