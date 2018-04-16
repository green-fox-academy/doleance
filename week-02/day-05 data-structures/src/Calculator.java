import java.util.Scanner;

public class Calculator {
  public static void main(String... args) {
    // Create a simple calculator application which reads the parameters from the prompt
    // and prints the result to the prompt.
    // It should support the following operations,
    // create a method named "calculate()":
    // +, -, *, /, % and it should support two operands.
    // The format of the expressions must be: {operation} {operand} {operand}.
    // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

    // You can use the Scanner class
    // It should work like this:

    // Start the program
    // It prints: "Please type in the expression:"
    // Waits for the user input
    // Print the result to the prompt
    // Exit

    Scanner scanner = new Scanner(System.in);
    String operation;
    int a; int b;
    char whatDoYouWant = 'y';

    do {
      System.out.println("Please type in the expression:");
      operation = scanner.next();
      a = scanner.nextInt();
      b = scanner.nextInt();

      switch (operation) {
        case "+":
          System.out.println(a + b);
          break;
        case "-":
          System.out.println(a - b);
          break;
        case "*":
          System.out.println(a * b);
          break;
        case "/":
          System.out.println(a / b);
          break;
        case "%":
          System.out.println(a % b);
          break;
      }
      System.out.println("Wanna do this again? (y/n)");
      whatDoYouWant = scanner.next().charAt(0);
    } while (whatDoYouWant=='y');
  }
}