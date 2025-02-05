package com.binarysearch;
//Create a class RotationPoint to find the smallest element using the binary search
public class RotationPoint {
    public static void main(String[] args) {
        //Create a sample array
        int[] array = {4,5,1,2,3};
        //Variable to store the returned element from findTheRotationPoint method
        int smallestElement = findTheRotationPoint(array);
        //Print the smallest element
        System.out.println("The Rotation Point is: " + smallestElement);
    }

    //Method to find the rotation point of the array using binary search
    private static int findTheRotationPoint(int[] array) {
        //Create a left and right pointer variable to find the element
        int left = 0 , right = array.length-1;
        //Run a while loop till right and left are equal
        while(left < right){
            //Create variable to store the middle index of array
            int mid = left + (right - left)/2;

            //Check whether we need to search in left side of array or right
            if(array[mid]>array[right]){
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }

        //Return the element at left most
        return array[left];
    }
}

