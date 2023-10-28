//Bui Khanh Hoang 20215273
public class MatrixAddition {
    public static void main(String[] args) {
        // Define the matrices with constant values
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Check if the matrices have the same dimensions
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("Matrices must have the same dimensions for addition.");
        } else {
            // Create a matrix to store the result of addition
            int[][] resultMatrix = new int[matrix1.length][matrix1[0].length];

            // Add the two matrices
            addMatrices(matrix1, matrix2, resultMatrix);

            // Display the result
            System.out.println("Matrix 1:");
            printMatrix(matrix1);

            System.out.println("Matrix 2:");
            printMatrix(matrix2);

            System.out.println("Resultant Matrix:");
            printMatrix(resultMatrix);
        }
    }

    // Function to add two matrices and store the result in a third matrix
    public static void addMatrices(int[][] matrix1, int[][] matrix2, int[][] resultMatrix) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
    }

    // Function to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}