package sortingalgorithms;
//Create a class SelectionSort to perform selection sort on students exam scores
public class SelectionSort {
    public static void main(String[] args) {
        //Initialize the scores
        int[] examScore = {77,99,44,66,100,55};

        //Method call to store the sorted scores
        int[] result = selectionSort(examScore);
        System.out.print("The students exam scores in ascending order are: ");
        for(int val : result){
            System.out.print(val + " "); //Print the values
        }
    }
    //Method to execute the selection sort
    private static int[] selectionSort(int[] examScore) {
        //Run nested loops to fnd the smallest value in range and swap with first element and increase the index
        for(int i=0;i< examScore.length;i++){
            int minValueIndex = i ;
            for(int j=i+1;j< examScore.length;j++){
                if(examScore[minValueIndex]>examScore[j]){
                    minValueIndex = j ; //Re-initialize the minimum value index
                }
            }

            //Swap the values only if it is not the same as before
            if(minValueIndex != i){
                int temp = examScore[minValueIndex];
                examScore[minValueIndex] = examScore[i];
                examScore[i] = temp;
            }
        }
        return examScore; //Return the sorted array
    }
}
