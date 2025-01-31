package sortingalgorithms;
//Import the array package to use its functionality
import java.util.Arrays;

//Class to implement Heap Sort for sorting job applicants' salary demands in ascending order.
public class HeapSort {
    //Create method to perform heap sort
    public static void heapSort(int[] salaries) {
        int n = salaries.length;

        // Creating a Max Heap from the given array
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Extract elements one by one from the heap and place them in sorted order
        for (int i = n - 1; i > 0; i--) {
            // Swap the root (max element) with the last element
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // Restore the heap property on the reduced heap
            heapify(salaries, i, 0);
        }
    }

    //Create a method to perform heapify
    private static void heapify(int[] arr, int n, int i) {
        // Initialize largest as root
        int largest = i;

        // Left child index
        int left = 2 * i + 1;

        // Right child index
        int right = 2 * i + 2;

        // Check if left child is greater than the root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // Check if right child is greater than the largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not the root, swap and continue heapifying
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }
    public static void main(String[] args) {
        //Create an array to store the slary
        int[] salaries = {45000, 32000, 54000, 38000, 29000, 60000, 47000};
        System.out.println("Original Salaries: " + Arrays.toString(salaries));

        heapSort(salaries); // Sorting the salaries

        System.out.println("Sorted Salaries: " + Arrays.toString(salaries));
    }
}