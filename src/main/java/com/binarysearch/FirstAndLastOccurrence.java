package com.binarysearch;
//Create a FirstAndLastOccurrence class to find the first and last occurrence of the target element in the array
public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        // Sample sorted array and target element
        int[] array = {1, 2, 2, 2, 3, 4, 5, 6, 6, 7};
        int target = 2;

        // Find first and last occurrence of the target
        int[] result = findFirstAndLastOccurrence(array, target);

        // Output the result
        if (result[0] == -1) {
            System.out.println("Target " + target + " not found in the array.");
        } else {
            System.out.println("First occurrence: " + result[0] + ", Last occurrence: " + result[1]);
        }
    }

    // Method to find first and last occurrence of a target element in a sorted array
    public static int[] findFirstAndLastOccurrence(int[] arr, int target) {
        int[] result = new int[2];

        // Initialize result with -1 (if not found)
        result[0] = result[1] = -1;

        // Binary search for the first occurrence
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result[0] = mid;
                // Continue searching in the left half for the first occurrence
                right = mid - 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        // Binary search for the last occurrence
        left = 0; right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result[1] = mid;
                // Continue searching in the right half for the last occurrence
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        //Return the result array having first and last occurrence of target
        return result;
    }
}
