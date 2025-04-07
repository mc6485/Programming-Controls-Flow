import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for month and day input
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        
        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();
        
        // Check if the date falls within the spring season (March 20 to June 20)
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
        
        // Close the scanner
        scanner.close();
    }
}