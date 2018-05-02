import java.util.ArrayList;
import java.util.Scanner;

public class JosephusProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("If you tell me, how many people you have, I'll tell which seat you should take to live");
        int howManySuicider = scan.nextInt();


        System.out.print("The safe spot is the: " + eliminateSuiciders(howManySuicider));
    }

    private static int eliminateSuiciders(int people) {

        ArrayList<Integer> suiciders = new ArrayList();
        for (int i = 0; i < people; i++) {
            suiciders.add(i + 1);
        }

        int i = 0;
        while (suiciders.size() > 1)
        {
            i = (i + 1) % suiciders.size();
            suiciders.remove(i);

        }

        return suiciders.get(0);
    }
}