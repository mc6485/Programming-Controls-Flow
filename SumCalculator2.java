import java.util.Scanner;

public class SumCalculator2 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Initialize total to 0.0
        double total = 0.0;
        double number;
        
        // Infinite loop
        while (true) {
            // Prompt the user for input
            System.out.print("Enter a number (0 or negative to stop): ");
            number = scanner.nextDouble();
            
            // Check if the number is 0 or negative
            if (number <= 0) {
                break;
            }
            
            // Add number to total
            total += number;
        }
        
        // Display the total sum
        System.out.println("Total sum: " + total);
        
        // Close the scanner
        scanner.close();
    }
}
