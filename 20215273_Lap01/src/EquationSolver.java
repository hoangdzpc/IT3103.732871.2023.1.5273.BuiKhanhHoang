//Bui Khanh Hoang 20215273
import java.util.Scanner;

public class EquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      //use a Scanner to read input from the user
        System.out.println("Equation Solver Menu:");
        System.out.println("1. Solve a first-degree equation (ax + b = 0)");
        System.out.println("2. Solve a system of first-degree equations (a11*x1 + a12*x2 = b1, a21*x1 + a22*x2 = b2)");
        System.out.println("3. Solve a second-degree equation (ax^2 + bx + c = 0)");
        System.out.print("Enter your choice (1, 2, or 3): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            solveFirstDegreeEquation();
        } else if (choice == 2) {
            solveSystemOfFirstDegreeEquations();
        } else if (choice == 3) {
            solveSecondDegreeEquation();
        } else {
            System.out.println("Invalid choice. Please choose 1, 2, or 3.");
        }
    }

    // Solve a first-degree equation (ax + b = 0)
    public static void solveFirstDegreeEquation() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();

        if (a != 0) {
            double x = -b / a;
            System.out.println("Solution: x = " + x);
        } else if (b == 0) {
            System.out.println("Infinite solutions.");
        } else {
            System.out.println("No solution.");
        }
    }

    // Solve a system of first-degree equations (a11*x1 + a12*x2 = b1, a21*x1 + a22*x2 = b2)
    public static void solveSystemOfFirstDegreeEquations() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a11: ");
        double a11 = scanner.nextDouble();
        System.out.print("Enter a12: ");
        double a12 = scanner.nextDouble();
        System.out.print("Enter b1: ");
        double b1 = scanner.nextDouble();
        System.out.print("Enter a21: ");
        double a21 = scanner.nextDouble();
        System.out.print("Enter a22: ");
        double a22 = scanner.nextDouble();
        System.out.print("Enter b2: ");
        double b2 = scanner.nextDouble();

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D != 0) {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("Solution: x1 = " + x1 + ", x2 = " + x2);
        } else if (D1 == 0 && D2 == 0) {
            System.out.println("Infinite solutions.");
        } else {
            System.out.println("No solution.");
        }
    }

    // Solve a second-degree equation (ax^2 + bx + c = 0)
    public static void solveSecondDegreeEquation() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("Invalid input: a cannot be 0.");
        } else if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two real roots: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("Double root: x = " + x);
        } else {
            System.out.println("No real roots.");
        }
    }
}
