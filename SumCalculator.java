import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Initialize total to 0.0
        double total = 0.0;
        double number;
        
        // Prompt the user for input
        System.out.print("Enter a number (0 to stop): ");
        number = scanner.nextDouble();
        
        // Loop until the user enters 0
        while (number != 0) {
            total += number;
            System.out.print("Enter a number (0 to stop): ");
            number = scanner.nextDouble();
        }
        
        // Display the total sum
        System.out.println("Total sum: " + total);
        
        // Close the scanner
        scanner.close();
    }
}