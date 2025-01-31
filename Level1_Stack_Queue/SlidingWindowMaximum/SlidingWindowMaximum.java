package SlidingWindowMaximum;
//Import required packages
import java.util.ArrayDeque;
import java.util.Deque;

//Create a class SlidingWindowMaximum to find the max value within size k
public class SlidingWindowMaximum {
    //Method to perform the operation to find the maximum  value in each window of size k
    public static int[] slidingWindow(int[] arr, int k){
        //create double eneded queue
        Deque<Integer> deque = new ArrayDeque<>();

        //create array to store maximum values
        int[] maximumValue = new int[arr.length-k+1];
        int maxValue = arr[0];

        //Running a loop to find values
        for(int i=0;i< arr.length;i++){
            //Store values till window size and add in dequeue while comparing
            if(i<k){
                deque.add(arr[i]);
                maxValue = maximumValue[0] = Math.max(arr[i], maxValue);
            }

            //if exceed window size check other conditions
            else{
                int removingElement = deque.removeFirst();//first element that got removed
                deque.add(arr[i]); //Add in dequeue

                //if adding element is greater than max value re-initialize the max
                if(arr[i] >= maxValue){
                    maxValue = arr[i];
                }

                //else removing the max value make the first element of dequeue as max to compare to other elements of dequeue
                else if(removingElement == maxValue){
                    maxValue = deque.getFirst();
                    for(int l : deque){
                        maxValue = Math.max(maxValue, l);
                    }
                }
                maximumValue[i-k+1] = maxValue; //Add the max value in array
            }
        }

        //Return the array
        return maximumValue;
    }
    public static void main(String[] args) {
        //Initialize the array
        int[] arr = {2,4,57,8,2,6,89,11,4,6,8,1};
        int k=5; //window size

        //Calling function and passing the array and size
        int[] result = slidingWindow(arr,k);

        //Run loop to display the array
        for(int res : result){
            System.out.print(res+" ");
        }
    }
}
