// Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//

public class DrawChessTable {
    public static void main(String[] args) {

        //egyszerűbb lenne kirajzolni kétsoronként, mint ciklusokkal vacakolni...

        for (int i=0; i<8;i++)
        {
            if (!(i%2==0)) {
                System.out.print(" ");
            }
            for (int j = 0; j < 4; j++) {

                System.out.print("% ");

            }
            System.out.println();
        }

        System.out.println();
//Kond-ötlet: ha i+j páros, ezt rakja, ha plan, azt.

        String pattern;
        for (int i = 0; i < 8; i++)
        {
        for (int j = 0; j < 8; j++) {

            if ((i+j)%2==0) {
                pattern="#";
            } else pattern=" ";
            System.out.print(pattern);
        }
        System.out.println();
        }

    }
}
