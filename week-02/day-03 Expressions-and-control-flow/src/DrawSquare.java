import java.util.Scanner;

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

public class DrawSquare {
    public static void main(String[] args) {

        Scanner scan2 = new Scanner(System.in);
        System.out.println("The pyramid was hard. Maybe I'll try a square, if you give me a side-size.");
        int squareRows = scan2.nextInt();

        for (int i=0;i<squareRows;i++)
        {
            for (int j=0;j<squareRows;j++) {
                if (i==0 || j==0 || i==squareRows-1 || j==squareRows-1)
                System.out.print("%");
                else System.out.print(" ");
            }
            System.out.println();
        }

    }
}
