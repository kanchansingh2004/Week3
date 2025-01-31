package StockSpanProblem;
//Import Stack package
import java.util.Stack;

//Create class StockSpan to perform the calculation of stocks
public class StockSpan {

    //Method to stalk the span in the stock
    public static int[] StalkSpan(int[] arr){
        //Create a stack and array to stock
        Stack<Integer> stack = new Stack<>();
        int[] resultArray = new int[arr.length];

        //Loop through array to find the span of stocks
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && (arr[stack.peek()]<=arr[i])){
                stack.pop();
            }

            resultArray[i] = (stack.isEmpty()? i+1 : i-stack.peek());
            stack.push(i);
        }
        //Return the result array
        return resultArray;
    }
    public static void main(String[] args) {
        //Create Array to initialize the stocks
        int[] arr= {100, 80, 60, 70, 60, 75, 85};

        //Call the function to store resultant array
        int[] result = StockSpan.StalkSpan(arr);

        //Print array through looping
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(result[i]+" ");
        }

    }
}
