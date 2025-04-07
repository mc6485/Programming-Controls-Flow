import java.util.Scanner;

public class RocketLaunch2 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Enter a number for the countdown: ");
        int counter = scanner.nextInt();
        
        // Countdown using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        
        // Print launch message
        System.out.println("Liftoff!");
        
        // Close the scanner
        scanner.close();
    }
}
