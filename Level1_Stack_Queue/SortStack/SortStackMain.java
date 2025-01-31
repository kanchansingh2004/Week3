package SortStack;
//Import the Stack
import java.util.Stack;

//Main class to perform sorting on stack using recursion
public class SortStackMain {
    //Method to take stack as argurments and reach the bottom of stack
    public static void sortedStack(Stack<Integer> stack ){
        if(stack.isEmpty()){ //Base case
            return;
        }
        //Element to store the top of stack
        int element = stack.pop();

        //Recursive class
        sortedStack(stack);

        //Call inserted sort after reaching the bottom with last popped value
        insertedSort(stack,element);
    }

    //Method to sort the elements with recursive call
    public static void insertedSort(Stack<Integer> stack, int element){
        //Base case
        if(stack.isEmpty() || stack.peek() <= element){
            stack.push(element);
            return;
        }
        //temp to store last popped element
        int temp = stack.pop();
        //Recursive call
        insertedSort(stack, element);
        //insert the last element
        stack.push(temp);
    }
    public static void main(String[] args) {
        //Create stack to store values
        Stack<Integer> stack = new Stack<>();

        //Insert the values in stack
        stack.push(2);
        stack.push(5);
        stack.push(8);
        stack.push(1);
        stack.push(4);
        stack.push(7);

        //Print the original stack
        System.out.println("Original Stack: "+ stack);

        //Sort the stack
        SortStackMain.sortedStack(stack);

        //Print the sorted stack
        System.out.println("Sorted Stack: "+ stack);
    }
}
