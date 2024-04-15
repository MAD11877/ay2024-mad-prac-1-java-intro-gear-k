import java.util.Scanner;
import java.util.HashMap;

public class Question5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Prompt user for the number of integers they will enter
        System.out.print("Enter the number of integers you will enter: ");
        int count = in.nextInt();
        
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Prompt user for integers and populate frequency map
        System.out.println("Enter the integers:");
        for (int i = 0; i < count; i++) {
            int num = in.nextInt();
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Determine the mode (most frequently occurring number)
        int mode = 0;
        int maxFrequency = 0;
        for (Integer key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) > maxFrequency) {
                maxFrequency = frequencyMap.get(key);
                mode = key;
            }
        }
        
        // Print out the mode
        System.out.println("The mode is: " + mode);
        
        // Close the scanner
        in.close();
    }
}
