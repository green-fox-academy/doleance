import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // square like this:
    //
    //
    // %%%%%
    // %%  %
    // % % %
    // %  %%
    // %%%%%
    //
    // The square should have as many lines as the number was

        Scanner scan2 = new Scanner(System.in);
        System.out.println("It isn't enough, is it. Okay, I'll draw one of the diagonals too. Gimme the side.");
        int squareRows = scan2.nextInt();
        for (int i=0;i<squareRows;i++)
        {
            System.out.print("%");
        }
        System.out.println();
        for (int i=0;i<squareRows-2;i++)   //szerintem a minta hibás abból a szempontból, hogy téglalapot rajzol
        {
            System.out.print("%");
            for (int j=0;j<(squareRows-2);j++)
            {
                if (j==i) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("%");
        }
        for (int i=0;i<squareRows;i++)
        {
            System.out.print("%");
        }
        System.out.println();

    }

}
