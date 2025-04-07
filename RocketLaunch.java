import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Enter a number for the countdown: ");
        int counter = scanner.nextInt();
        
        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        
        // Print launch message
        System.out.println("Liftoff!");
        
        // Close the scanner
        scanner.close();
    }
}
