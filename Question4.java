import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt user for the base of the triangle
        System.out.print("Enter the base length of the triangle: ");
        int base = in.nextInt();

        // Outer loop for each level of the triangle
        for (int i = base; i > 0; i--) {
            // Inner loop to print stars for each level
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing each level
            System.out.println();
        }

        // Close the scanner
        in.close();
    }
}
