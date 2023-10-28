//Bui Khanh Hoang 20215273
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //use a Scanner to read input from the user
        
        System.out.print("Enter the first number: ");
        String strNum1 = scanner.nextLine();
        double num1 = Double.parseDouble(strNum1);
        //convert the user-provided strings to double values using Double.parseDouble()
        
        System.out.print("Enter the second number: ");						                
        String strNum2 = scanner.nextLine();
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = 0.0;

        // Check if the divisor (num2) is not zero before calculating the quotient
        if (num2 != 0) {
            quotient = num1 / num2;
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Cannot divide by zero. Please enter a non-zero second number.");
        }
    }
}
