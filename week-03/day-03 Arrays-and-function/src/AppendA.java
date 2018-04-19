
// - Create an array variable named `nimals`
//   with the following content: `["kuty", "macsk", "cic"]`
// - Add all elements an `"a"` at the end
public class AppendA {
    public static void main(String[] args) {
        String[] nimals = {"kuty", "macsk", "cic"};
        nimals = appendA(nimals);
        printArray(nimals);
    }

    private static void printArray(String[] array) {
        for (String element : array) {
            System.out.print(element + " ");
        }
    }

    private static String[] appendA(String... wordsWithoutA) {
        String[] temp = new String[wordsWithoutA.length];
        for (int i = 0; i < wordsWithoutA.length; i++) {
            temp[i] = wordsWithoutA[i]+"a";
        }
        return temp;
    }
}
