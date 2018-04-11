import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        // Modify this program to greet you instead of the World!
        System.out.println("Hello Me!");

        // Modify this program to print Humpty Dumpty riddle correctly
        System.out.println("Humpty Dumpty sat on a wall,");
        System.out.println("Humpty Dumpty had a great fall.");
        System.out.println("All the king's horses and all the king's men");
        System.out.println("Couldn't put Humpty together again.");

        // Greet 3 of your classmates with this program, in three separate lines
        // like:
        System.out.println("Hello, Melinda!");
        System.out.println("Hello, Klári!");
        System.out.println("Hello, Adél!");

//04 - Introduce Yourself
        System.out.println("My name: DD (\"It's my given name. I gave it to me, by me.\" :)");
        System.out.println("My age: 28");
        System.out.println("My height: " + 1.62);

//05 - Two Numbers
        System.out.println(13+22);
        System.out.println(22-13);
        System.out.println(13*22);
        System.out.println(22/13.0);
        System.out.println(22/13);
        System.out.println(22%13);

//06 - Coding Hours

        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        System.out.println(17*5*6);
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        System.out.println(((5*6)/52.0)*100+"%");

//07 - FavoriteNumber
        int favoriteNumber = 2;
        System.out.println("My favourite number is "+favoriteNumber+".");

//08 - Swap
        {
            int a = 123;
            int b = 526;
            int c = a;
            a = b;
            b = c;

            System.out.println(a);
            System.out.println(b);
        }
//09 - Bmi 💪
        double massInKg = 81.2;
        double heightInM = 1.78;
        double BMI = Math.round(massInKg/heightInM*100);
        BMI /=100;
        System.out.println("BMI: "+ BMI);

//10 - DefineBasicInfo

        String myName="DD";
        int myAge=28;
        double myHeight=1.62;
        boolean ifMarried = false;

        System.out.println("Nevem: "+myName);
        System.out.println("Korom: "+myAge);
        System.out.println("Magasságom: "+myHeight);
        System.out.println("Nős-e vagy: "+ifMarried);

//11 - VariableMutation
        {
            int a = 3;
            a += 10;
            System.out.println(a);
            int b = 100;
            b -= 7;
            System.out.println(b);
            int c = 44;
            c *= 2;
            System.out.println(c);
            int d=125;
            d /= 5;
            System.out.println(d);
            int e=8;
            System.out.println(Math.round(Math.pow(e,2)));
            int f1=123;
            int f2=345;
            System.out.println(f1>f2);
            int g1 = 350;
            int g2 = 200;
            System.out.println(g2*2>g1);
            int h = 135798745;
            System.out.println((h%11)==0);
            int i1 = 10;
            int i2 = 3;
            System.out.println((i1>(Math.pow(i2,2)))&&(i1<(Math.pow(i2,3))));
            int j = 1521;
            System.out.println(((j%3)==0)||((j%5)==0));
            String k = "Apple";
            //fill the k variable with its cotnent 4 times
            k = k + k;
            k = k + k;
            System.out.println(k);
        }

//12 - Cuboid 💪

        double cuboidA=5;
        double cuboidB=5;
        double cuboidC=5;

        System.out.println("Surface Area: "+(cuboidA*cuboidB*2+cuboidC*cuboidB*2+cuboidA*cuboidC*2));
        System.out.println("Volume: "+cuboidA*cuboidB*cuboidC);

//13 - SecondsInADay

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        System.out.println("The remaining seconds from the day: "+(23-currentHours)*60*60+(59-currentMinutes)*60+(60-42));

//14 - HelloUser
        Scanner scan = new Scanner(System.in);
        System.out.print("Your name? ");
        String userName = scan.nextLine();
        System.out.println("Hello, "+userName+"!");

//15 - MileToKmConverter

        System.out.print("How many kilometers do you have? ");
        int kiloMeters = scan.nextInt();
        System.out.println("Then you have " +(kiloMeters/1.609344)+" miles.");

//16 - AnimalsAndLegs 💪

        System.out.println("Please give me two numbers. The number of your chiken, and the number of your pigs. ");
        int chicks = scan.nextInt(); int pigs = scan.nextInt();
        System.out.println("Then all your animals have " +(chicks*2+pigs*4)+" legs.");

//17 - AverageOfInput 💪

        System.out.println("Please give me 5 numbers. ");
        int statNumber1 = scan.nextInt();
        int statNumber2 = scan.nextInt();
        int statNumber3 = scan.nextInt();
        int statNumber4 = scan.nextInt();
        int statNumber5 = scan.nextInt();
        int statSum = statNumber1+statNumber2+statNumber3+statNumber4+statNumber5;
        System.out.println("Sum: "+statSum+", average: "+(statSum/5));

//18 - OddEven

        Scanner scanner = new Scanner(System.in);
        {
            System.out.print("Now gimme please a number. I'll tell you if it's odd or even. ");
            int number = scan.nextInt();
            if (number % 2 == 0) {
                System.out.println("It's even.");
            } else {
                System.out.println("It's odd. Sorry.");
            }
        }
//19 - OneTwoALot

        {
            System.out.print("Gimme a number again. ");
            int number = scan.nextInt();
            if (number < 1) {
                System.out.println("Not enough.");
            } else if (number == 1) {
                System.out.println("One.");
            } else if (number == 2) {
                System.out.println("Two.");
            } else {System.out.println("That's a lot!");}
        }

//20 - PrintBigger 💪

        {
            System.out.print("Now I want two numbers. ");
            int number1 = scan.nextInt(); int number2 = scan.nextInt();
            if (number1 < number2) {
                System.out.println(number2+" is bigger.");
            } else {
                System.out.println(number1+" is bigger.");
            }
        }

//21 - PartyIndicator
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("How many girls and boys have came to the party?");
            int cameGirls = scanner.nextInt();
            int cameBoys = scanner.nextInt();
            if (cameGirls == 0) {
                System.out.println("Sausage party.");
            } else if ((cameGirls + cameBoys) > 20) {
                if (cameGirls == cameBoys) {
                    System.out.println("The party is excellent!");
                } else {
                    System.out.println("Quite cool party!");
                }
            } else {
                System.out.println("Average party...");
            }
        }
//22 - ConditionalVariableMutation 💪

        double a = 24;
        int out = 0;
        // if a is even increment out by one

        if (a%2==0) {out++;}

        System.out.println(out);

        int b = 13;
        String out2 = "";
        // if b is between 10 and 20 set out2 to "Sweet!"
        // if less than 10 set out2 to "Less!",
        // if more than 20 set out2 to "More!"

        if ((b>10)&&(b<20)) {out2 = "Sweet!";}

        System.out.println(out2);

        int c = 123;
        int credits = 100;
        boolean isBonus = false;
        // if credits are at least 50,
        // and isBonus is false decrement c by 2
        // if credits are smaller than 50,
        // and isBonus is false decrement c by 1
        // if isBonus is true c should remain the same
        if (!isBonus)
        {
            if (credits>49) {c-=2;}
            else {c--;}
        }

        System.out.println(c);

        int d = 8;
        int time = 120;
        String out3 = "";
        // if d is dividable by 4
        // and time is not more than 200
        // set out3 to "check"
        // if time is more than 200
        // set out3 to "Time out"
        // otherwise set out3 to "Run Forest Run!"
        if (d%4==0) {
            if (time>201){
                System.out.println("Time out.");
            } else {
                System.out.println("Check");
            }
        } else {
            System.out.println("Run, Forest, Run!");
        }

        System.out.println(out3);


//23 - IWontCheatOnTheExams

        for (int i=0;i<100;i++)
        {
            System.out.println("I won't cheat on the exam!");
        }

//24 - PrintEven

        for (int i=0;i<=500;i+=2)
        {
            System.out.println(i);
        }

//25 - MultiplicationTable

        Scanner scan2 = new Scanner(System.in);
       System.out.print("I'll give you the multiplication table, but to which number? ");
        int multiplicationNum=scan2.nextInt();
        for (int i=0;i<10;i++)
        {
            System.out.println((i+1)+" * "+multiplicationNum+" = "+(multiplicationNum*(i+1)));
        }

//26 - CountFromTo

        System.out.print("I can count from any number up to any other number! Wanna try? Gimme 2 numbers: ");
        int fromNum=scan2.nextInt(); int toNum=scan2.nextInt();
        if (fromNum>toNum) {System.out.println("Hey, that's cheating! The second number should be bigger.");}
        else {
            for (int i = fromNum; i < toNum; i++) {
                System.out.println(i);
            }
        }
//27 - FizzBuzz

        for (int i=1;i<=100;i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else
                {System.out.println("Fizz");}

            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {System.out.println(i);}
        }


//28 - DrawTriangle

        System.out.println("I'll draw you a wonderful right-angled triangle. Just give me one of its side.");
        int triangleRows = scan2.nextInt();
        for (int i=0;i<triangleRows;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
                System.out.println();
        }

//29 - DrawPyramid 💪

        System.out.println("I can draw pyramid too. Wanna see? How big should it be?");
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
            for (int j=0;j<((2*pyramidRows-1-(2*i-1))/2);j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        //hullára biztos vagyok benne, hogy ennél egy SOKKAL egyszerűbb verzió is létezik...
        //talán egy eggyel kisebb "space-háromszöget" kéne fejjel lefelé betenni a csillagok elé meg mögé

//30 - DrawDiamond 💪

        System.out.println("I can draw pyramid too. Wanna see? How big should it be?");
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
            for (int j=0;j<((2*pyramidRows-1-(2*i-1))/2);j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        pyramidRows --;
        for (int i=pyramidRows;i>=1;i--)
        {
            for (int j=((2*pyramidRows-1-(2*i-1))/2);j>=0;j--)
            {
                System.out.print(" ");
            }
            for (int cs=(i*2-1);cs>0;cs--)
            {
                System.out.print("*");
            }
            for (int j=((2*pyramidRows-1-(2*i-1))/2);j>=0;j--)
            {
                System.out.print(" ");
            }
            System.out.println();
        }

//31 - DrawSquare 💪

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

//32 - DrawDiagonal

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

//33 - GuessTheNumber

        int guessNumber=213;
        System.out.println("I've tought about a number between 1-1000. Do you have a guess?");
        Scanner guessScan = new Scanner(System.in);
        int tip=guessScan.nextInt();
        while (tip!=guessNumber) {
            if (tip<guessNumber) {
                System.out.println("The stored number is higher.");
            } else {
                System.out.println("The stored number is lower.");
            }
            tip=guessScan.nextInt();
        }
            System.out.println("You've found the number: "+guessNumber);


//34 - ParametricAverage 💪 exam

        System.out.println("How many numbers do you want me to make a statistic of?");
        Scanner scanner = new Scanner(System.in);
        int dataScale = scanner.nextInt();
        int sum=0;
        for (int i=0;i<dataScale;i++)
        {
            System.out.println("Your "+(i+1)+"th number: ");
            sum += scanner.nextInt();
        }
        System.out.println("Sum: "+sum+", Average: "+(sum/dataScale));


//35 - DrawChessTable
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


//Hard One: Find the substring




        System.out.println(subStr("this is what I'm searching in", "searching"));

    }

    public static int subStr(String input, String q) {
        boolean gotIt=false;
        for (int i=0;i<input.length();i++)
        {
            for (int j=i;j<=input.length();j++)
            {
                if (input.substring(i,j).equals(q))
                {
                    return i;
                }
            }
        }
        return -1;

        /*
        Question:
        s1 == s2 returns true if both strings point to the same object in memory.
        This is a common beginners mistake and is usually not what you want.
        s1.equals(s2) returns true if both strings are physically equal
        (i.e. they contain the same characters).

        Then when will s1 == s2 happen?
         */
    }
}
