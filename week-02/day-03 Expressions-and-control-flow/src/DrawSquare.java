import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {

    // Write a program that reads a number from the standard input, then draws a
    // square like this:
    //
    //
    // %%%%%
    // %   %
    // %   %
    // %   %
    // %   %
    // %%%%%
    //
    // The square should have as many lines as the number was

        Scanner scan2 = new Scanner(System.in);
        System.out.println("The pyramid was hard. Maybe I'll try a square, if you give me a side-size.");
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
                System.out.print(" ");
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
