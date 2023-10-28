//Bui Khanh Hoang 20215273
import java.util.Arrays;

public class ArraySortAndSum {
    public static void main(String[] args) {
        // Declare an array of numeric elements
        int[] numbers = {5, 3, 10, 8, 2};

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Calculate the sum and average of the elements in the array
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Calculate the average by dividing the sum by the number of elements
        double average = (double) sum / numbers.length;

        // Display the sorted array
        System.out.print("Sorted array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Display the sum and average
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);
    }
}
