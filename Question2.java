import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt user for height
        System.out.print("Enter your height in meters: ");
        double height = in.nextDouble();

        // Prompt user for weight
        System.out.print("Enter your weight in kilograms: ");
        double weight = in.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);

        // Print out BMI
        System.out.printf("Your BMI is: %.2f%n", bmi);

        // Close the scanner
        in.close();
    }
}
