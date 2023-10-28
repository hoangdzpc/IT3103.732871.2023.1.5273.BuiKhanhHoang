//Bui Khanh Hoang 20215273
import java.util.Scanner;

public class MonthDaysCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the month input from the user
        System.out.print("Enter a month (full name, abbreviation, 3 letters, or number): ");
        String monthInput = scanner.nextLine();

        // Get the year input from the user
        System.out.print("Enter a year (non-negative four-digit number): ");
        int year = scanner.nextInt();

        if (year < 0 || year < 1000 || year > 9999) {
            System.out.println("Invalid year input. Please enter a non-negative four-digit year.");
        } else {
            int month = parseMonth(monthInput);
            if (month == -1) {
                System.out.println("Invalid month input. Please enter a valid month.");
            } else {
                int days = getMonthDays(month, year);
                System.out.println("Number of days in " + getMonthName(month) + " " + year + " is: " + days);
            }
        }
    }

    // Function to parse and validate the month input
    public static int parseMonth(String input) {
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        String[] monthAbbreviations = {
            "Jan.", "Feb.", "Mar.", "Apr.", "May", "Jun.",
            "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."
        };

        // Check for full month names
        for (int i = 0; i < monthNames.length; i++) {
            if (input.equalsIgnoreCase(monthNames[i])) {
                return i + 1; // Months are 1-based
            }
        }

        // Check for month abbreviations
        for (int i = 0; i < monthAbbreviations.length; i++) {
            if (input.equalsIgnoreCase(monthAbbreviations[i]) || input.equalsIgnoreCase(monthAbbreviations[i].substring(0, 3))) {
                return i + 1;
            }
        }

        try {
            int monthNumber = Integer.parseInt(input);
            if (monthNumber >= 1 && monthNumber <= 12) {
                return monthNumber;
            }
        } catch (NumberFormatException e) {
            return -1;
        }

        return -1; // Invalid month input
    }

    // Function to get the number of days in a month for a given year
    public static int getMonthDays(int month, int year) {
        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        // Adjust for leap year (February)
        if (isLeapYear(year) && month == 2) {
            return 29;
        }

        return daysInMonth[month - 1];
    }

    // Function to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    // Function to get the name of a month based on its number
    public static String getMonthName(int month) {
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        if (month >= 1 && month <= 12) {
            return monthNames[month - 1];
        } else {
            return "Invalid Month";
        }
    }
}














