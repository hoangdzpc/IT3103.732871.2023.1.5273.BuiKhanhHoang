//Bui Khanh Hoang 20215273
import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height of the triangle (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer for the height.");
        } else {
            displayStarTriangle(n); // Call the function to display the star triangle
        }
    }

    // Function to display the star triangle
    public static void displayStarTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            // Print spaces to center-align the stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "); // Print a space
            }
            
            // Print the stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*"); // Print a star
            }
            
            System.out.println();  // Move to the next line to start a new row
        }
    }
}
