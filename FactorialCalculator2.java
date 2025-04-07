import java.util.Scanner;

public class FactorialCalculator2 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        
        // Check if the number is a positive integer
        if (n < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Compute factorial using for loop
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            
            // Display result
            System.out.println("Factorial of " + n + " is: " + factorial);
        }
        
        // Close the scanner
        scanner.close();
    }
}
