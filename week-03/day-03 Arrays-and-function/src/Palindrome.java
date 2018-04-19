//Watch out! This class has all the two palindrom-functions we need. :)

public class Palindrome {
    public static void main(String[] args) {

        String makeMePalindrome = "dog";
        createPalindrome(makeMePalindrome);

        String hasItPalindromes = "géza kék azég";
        findPalindrome(hasItPalindromes);

    }

    private static void createPalindrome(String makeMePalindrome) {
        System.out.print(makeMePalindrome);
        StringBuilder palindromeBuilding = new StringBuilder();
        palindromeBuilding.insert(0, makeMePalindrome);
        System.out.println(palindromeBuilding.reverse().toString());
    }

    private static void findPalindrome(String hasItPalindromes) {
        ne felejtsd el ezt
    }
}
