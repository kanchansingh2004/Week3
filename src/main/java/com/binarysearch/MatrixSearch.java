package com.binarysearch;
//Create a MatrixSearch class to find a target value in the matrix
public class MatrixSearch {
    public static void main(String[] args) {
        // Sample matrix to test the binary search function
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        //Create sample target as 5
        int target = 5;
        //Create a variable to store the result true or false
        boolean result = searchMatrix(matrix, target);

        // Output whether the target exists in the matrix
        System.out.println("Target " + target + " found: " + result);
    }

    // Function to perform binary search on a 2D matrix
    private static boolean searchMatrix(int[][] matrix, int target) {
        // Check if the matrix is empty
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        // Get the number of rows and columns in the matrix
        int numRows = matrix.length;
        int numColumns = matrix[0].length;

        // Initialize left and right pointers (treated as a 1D array)
        int left = 0;
        int right = numRows * numColumns - 1;

        // Perform binary search
        while (left <= right) {
            // Find the middle index (mid is treated as a 1D index)
            int mid = left + (right - left) / 2;

            // Convert mid to row and column indices
            int row = mid / numColumns;
            int col = mid % numColumns;

            // Compare the middle element with the target
            if (matrix[row][col] == target) {
                return true;
            }

            // If the target is smaller, search the left half
            if (matrix[row][col] > target) {
                right = mid - 1;
            }
            // If the target is larger, search the right half
            else {
                left = mid + 1;  // Update left pointer
            }
        }

        // If the target is not found, return false
        return false;
    }
}

