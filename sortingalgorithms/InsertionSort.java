package sortingalgorithms;

public class InsertionSort {
    public static void main(String[] args) {
        // Define an array of employee IDs
        int[] employeeId = {7, 2, 6, 9, 5, 1, 3, 8};

        // Sort the array using Insertion Sort
        int[] result = insertionSort(employeeId);

        // Print the sorted employee IDs
        System.out.print("The employee IDs in ascending order are: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }

    // Performs Insertion Sort on the given array
    private static int[] insertionSort(int[] employeeId) {
        // Get the size of the array
        int n = employeeId.length;

        // Iterate over each element starting from index 1
        for (int i = 1; i < n; i++) {
            // Store the current element as key
            int key = employeeId[i];

            // Initialize a pointer for comparison
            int j = i - 1;

            // Shift elements to the right until the correct position for key is found
            while (j >= 0 && employeeId[j] > key) {
                employeeId[j + 1] = employeeId[j];
                j--;
            }

            // Insert the key at the correct position
            employeeId[j + 1] = key;
        }

        // Return the sorted array
        return employeeId;
    }
}
