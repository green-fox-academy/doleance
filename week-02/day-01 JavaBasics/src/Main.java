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

    }
}
