package sortingalgorithms;
//Create a class to perform merge sort on the prices of book
public class MergeSort {
    public static void main(String[] args) {
        // Define an array of book prices
        int[] bookPrice = {500, 300, 150, 200, 100};

        // Sort the array using Merge Sort
        mergeSort(bookPrice, 0, 4);

        // Print the sorted book prices
        System.out.print("The book prices in ascending order are: ");
        for (int val : bookPrice) {
            System.out.print(val + " ");
        }
    }

    // Recursively divides and sorts the array
    private static void mergeSort(int[] bookPrice, int start, int end) {
        // Base case: return if the array has one or zero elements
        if (start >= end) return;

        // Find the middle index
        int midValue = start + (end - start) / 2;

        // Recursively sort the left half
        mergeSort(bookPrice, start, midValue);

        // Recursively sort the right half
        mergeSort(bookPrice, midValue + 1, end);

        // Merge the sorted halves
        merge(bookPrice, start, midValue, end);
    }

    // Merges two sorted halves into a single sorted array
    private static void merge(int[] bookPrice, int start, int midValue, int end) {
        // Create a temporary array to store merged values
        int[] mergedArray = new int[end - start + 1];

        // Initialize pointers for both halves
        int index = 0, idx1 = start, idx2 = midValue + 1;

        // Merge elements from both halves in sorted order
        while (idx1 <= midValue && idx2 <= end) {
            if (bookPrice[idx1] < bookPrice[idx2]) {
                mergedArray[index++] = bookPrice[idx1++];
            } else {
                mergedArray[index++] = bookPrice[idx2++];
            }
        }

        // Copy remaining elements from the left half
        while (idx1 <= midValue) {
            mergedArray[index++] = bookPrice[idx1++];
        }

        // Copy remaining elements from the right half
        while (idx2 <= end) {
            mergedArray[index++] = bookPrice[idx2++];
        }

        // Copy the sorted elements back to the original array
        System.arraycopy(mergedArray, 0, bookPrice, start, mergedArray.length);
    }
}
