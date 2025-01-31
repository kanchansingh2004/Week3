package sortingalgorithms;
//Create a class to perform Bubble sort on the Student Marks.
public class BubbleSort {
    public static void main(String[] args) {
        // Define an array of student marks
        int[] studentMarks = {90, 78, 88, 45, 63, 55, 22};

        // Sort the array using Bubble Sort
        int[] result = bubbleSort(studentMarks);

        // Print the sorted student marks
        System.out.print("The student marks in ascending order are: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }

    // Performs Bubble Sort on the given array
    private static int[] bubbleSort(int[] studentMarks) {
        // Get the size of the array
        int n = studentMarks.length;

        // Declare a variable to check if swaps occurred
        boolean swapped;

        // Iterate through the array
        for (int i = 0; i < n - 1; i++) {
            // Initialize swapped as false before each pass
            swapped = false;

            // Compare adjacent elements and swap if needed
            for (int j = 0; j < n - i - 1; j++) {
                if (studentMarks[j] > studentMarks[j + 1]) {
                    // Swap studentMarks[j] and studentMarks[j+1]
                    int temp = studentMarks[j];
                    studentMarks[j] = studentMarks[j + 1];
                    studentMarks[j + 1] = temp;
                    swapped = true;
                }
            }

            //Stop if no swaps occurred in the inner loop
            if (!swapped) break;
        }

        // Return the sorted array
        return studentMarks;
    }
}
