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
            for (int j=0; j<8;j++)
            {
                if (i%2==1)
                {
                    if (j%2==0) {
                        System.out.print("%");
                    } else {System.out.print(" ");}
                } else {
                    if (j % 2 == 1) {
                        System.out.print("%");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

    }
}
