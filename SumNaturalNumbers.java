import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        
        // Check if the number is natural (positive integer)
        if (n <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
        } else {
            // Compute sum using the formula n*(n+1)/2
            int formulaSum = n * (n + 1) / 2;
            
            // Compute sum using while loop
            int sum = 0, i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            
            // Display results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + sum);
            
            // Compare results
            if (sum == formulaSum) {
                System.out.println("Both computations match! The result is correct.");
            } else {
                System.out.println("There is an error in the computations.");
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
