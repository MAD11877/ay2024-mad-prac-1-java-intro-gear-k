import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        double height = in.nextDouble();


        double weight = in.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);

        // Print out BMI
        System.out.printf(bmi);

        // Close the scanner
        in.close();
    }
}
