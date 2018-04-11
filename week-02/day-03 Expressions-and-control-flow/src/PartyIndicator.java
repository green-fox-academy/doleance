import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {

    // Write a program that asks for two numbers
    // Thw first number represents the number of girls that comes to a party, the
    // second the boys
    // It should print: The party is exellent!
    // If the the number of girls and boys are equal and there are more people coming than 20
    //
    // It should print: Quite cool party!
    // It there are more than 20 people coming but the girl - boy ratio is not 1-1
    //
    // It should print: Average party...
    // If there are less people coming than 20
    //
    // It should print: Sausage party
    // If no girls are coming, regardless the count of the people

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
}
