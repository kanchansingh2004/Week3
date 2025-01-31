package QueueWithStackes;
//importing stack class
import java.util.Stack;

//QueueUsingStack class to implement queue using stack
public class QueueUsingStack {
    //creating stack object
        Stack <Integer> stack1;

        //constructor to initialize stack
        QueueUsingStack(){
            this.stack1 = new Stack<>();
        }
        //enqueue method to insert element in queue
        public void enqueue(int data){
            stack1.push(data);
        }

        //dequeue method to remove element from queue
        public int dequeue(){
            Stack <Integer> stack2 = new Stack<>();
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            int popElement = stack2.pop();

            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
            return popElement;
        }

        //queuePeek method to get the front element of queue
        public int queuePeek(){
            Stack <Integer> stack2 = new Stack<>();
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            int peepElement = stack2.peek();

            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
            return peepElement;
        }

        //queueIsEmpty method to check if queue is empty
        public boolean queueIsEmpty(){
            return stack1.isEmpty();
        }

}
