public class SubStr {

    public static int subStr(String input, String q) {
        boolean gotIt = false;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j <= input.length(); j++) {
                if (input.substring(i, j).equals(q)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(subStr("this is what I'm searching in", "searching"));

    }
}

        /*
        Question:
        s1 == s2 returns true if both strings point to the same object in memory.
        This is a common beginners mistake and is usually not what you want.
        s1.equals(s2) returns true if both strings are physically equal
        (i.e. they contain the same characters).

        Then when will s1 == s2 happen?
         */


