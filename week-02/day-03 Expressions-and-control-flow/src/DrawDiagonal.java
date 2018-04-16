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
            for (int j=0;j<squareRows;j++) {
                if (i==0 || j==0 || i==squareRows-1 || j==squareRows-1 || i==j)
                    System.out.print("%");
                else System.out.print(" ");
            }
            System.out.println();
        }

    }

}
