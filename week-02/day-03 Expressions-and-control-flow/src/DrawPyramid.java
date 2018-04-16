// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was

import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {

        Scanner scan2 = new Scanner(System.in);
        System.out.println("I can draw pyramid too. Wanna see?" +
                "How big should it be?");
        int pyramidRows = scan2.nextInt();
        for (int i=1;i<=pyramidRows;i++)
        {
            for (int j=0;j<((2*pyramidRows-1-(2*i-1))/2);j++)
            {
                System.out.print(" ");
            }
            for (int cs=0;cs<(i*2-1);cs++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
        //hullára biztos vagyok benne, hogy ennél egy SOKKAL egyszerűbb verzió is létezik...
        //talán egy eggyel kisebb "space-háromszöget" kéne fejjel lefelé betenni a csillagok elé meg mögé


    }
}
