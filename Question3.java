import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt user to enter an integer
        System.out.print("Enter an integer: ");
        int number = in.nextInt();

        // Multiply the integer by itself
        int squared = number * number;

        // Print out the result
        System.out.println("The square of " + number + " is " + squared);

        // Close the scanner
        in.close();
    }
}
