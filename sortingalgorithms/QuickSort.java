package sortingalgorithms;
//Create a class to perform quick sort on product prices
public class QuickSort {
    public static void main(String[] args) {
        //Create an array to store prices
        int[] productPrice = {12,10,13,9,5,3,90};

        //Store the sorted prices in result and display them
        int[] result = quickSort(productPrice, 0 , productPrice.length-1);
        System.out.print("The product Prices in ascending order are: ");
        for(int val : result){
            System.out.print(val + " ");
        }
    }

    //Method to execute the quick sort using product price array
    private static int[] quickSort(int[] productPrice, int start , int end) {
        //Base case to stop the recursion
        if(start < end){
            //Find the pivot index using partition method and recursively call quick sort
            int pivot = partition(productPrice, start, end);
            quickSort(productPrice, start, pivot-1);
            quickSort(productPrice, pivot+1 , end);
        }

        return productPrice; // return the sorted array
    }

    //Method to get the element that partitions the array
    private static int partition(int[] productPrice, int start, int end) {
        //Intitialize the pivot as last element
        int pivot = productPrice[end];
        int idx = start-1;

        //Run a loop and swap the element to left(Smaller than pivot) and to right(Greater than pivot)
        for(int j= start ; j<end; j++){
            if(productPrice[j] < pivot){
                idx++;
                int temp = productPrice[j];
                productPrice[j] = productPrice[idx];
                productPrice[idx] = temp;
            }
        }

        //Swap the pivot and element at idx
        idx++;
        int temp = productPrice[idx];
        productPrice[idx] = productPrice[end];
        productPrice[end] = temp;

        return idx; //Return the pivot index
    }
}
