package com.binarysearch;
//Create a PeakElement class to find the peak element in an array using binary search
public class PeakElement {
    public static void main(String[] args) {
        // Sample array to test the peak element function
        int[] array = {1, 3, 20, 4, 1, 0, 9, 7};

        // Find and print the peak element
        int peak = findPeakElement(array);
        System.out.println("A Peak Element is: " + peak);
    }

    // Method to find a peak element using binary search
    private static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid is a peak element
            if ((mid == 0 || arr[mid] > arr[mid - 1]) &&
                    (mid == arr.length - 1 || arr[mid] > arr[mid + 1])) {
                return arr[mid]; // Found a peak
            }

            // If the left neighbor is greater, move left
            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                right = mid - 1;
            }
            // Otherwise, move right
            else {
                left = mid + 1;
            }
        }

        // This should never be reached if the array has at least one element
        return -1;
    }
}
