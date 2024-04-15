import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt user to enter an integer
        int number = in.nextInt();

        // Multiply the integer by itself
        int squared = number * number;

        // Print out just the result
        System.out.println(squared);

        // Close the scanner
        in.close();
    }
}
