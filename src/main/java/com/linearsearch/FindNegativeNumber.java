package com.linearsearch;
//Create a FindNegativeNumber class to find the first negative number
public class FindNegativeNumber {
    //Main Method to call the linear search method
    public static void main(String[] args) {
        //Create a sample array
        int[] array = {1,2,3,4,5,-1,6,8,-2};
        //Call the linearSearch method and store the return index
        int index = linearSearch(array);
        //Check whether there is negative element or not
        if(index == -1){
            System.out.println("No Negative Number Found");
        }
        else{
            System.out.println("The index of first negative element is: " + index);
        }
    }

    //Method to find the negative element using linear search
    public static int linearSearch(int[] array){
        //Loop through the array to find negative element
        for(int i = 0 ; i < array.length ; i++){
            if(array[i]<0){
                return i; //return the index of negative element
            }
        }

        return -1; //return -1 if not negative element found
    }
}

