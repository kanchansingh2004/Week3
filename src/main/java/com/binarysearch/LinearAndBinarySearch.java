package com.binarysearch;
//Import required package
import java.util.Arrays;
//Create a LinearAndBinarySearch class hat uses Linear Search to find the first missing positive integer in the list and Binary Search to find the index of a given target number.
public class LinearAndBinarySearch {
    public static void main(String[] args) {
        // Sample list of integers and target element for binary search
        int[] list = {3, 7, 5, 1, 2};
        int target = 5;

        // Find the first missing positive integer using linear search
        int missingPositive = findFirstMissingPositive(list);
        System.out.println("The first missing positive integer is: " + missingPositive);

        // Find the index of the target number using binary search
        int index = binarySearch(list, target);
        if (index != -1) {
            System.out.println("The index of target " + target + " is: " + index);
        } else {
            System.out.println("Target " + target + " not found in the list.");
        }
    }

    // Method to find the first missing positive integer using linear search
    public static int findFirstMissingPositive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int element = 1;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] < 0){
                continue;
            }
            if(nums[i] == element){
                element++;
            }
            else{
                return element;
            }
        }
        return nums[n-1]+1;
    }

    // Method to perform binary search for a target number in a sorted array
    public static int binarySearch(int[] arr, int target) {
        // Sort the array first for binary search
        Arrays.sort(arr);

        // Initialize left and right pointers for binary search
        int left = 0, right = arr.length - 1;

        // Perform binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // If the target is found, return its index
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                // If the target is greater, search the right half
                left = mid + 1;
            } else {
                // If the target is smaller, search the left half
                right = mid - 1;
            }
        }

        // If target is not found, return -1
        return -1;
    }
}
