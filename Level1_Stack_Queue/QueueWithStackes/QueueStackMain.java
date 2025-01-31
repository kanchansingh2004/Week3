package QueueWithStackes;
//Importing the QueueUsingStack class from the QueueWithStackes package
public class QueueStackMain {
    public static void main(String[] args) {
        //Creating an object of QueueUsingStack class
        QueueUsingStack queue = new QueueUsingStack();

        //Enqueue elements to the queue
        queue.enqueue(12);
        queue.enqueue(22);
        queue.enqueue(13);
        queue.enqueue(55);
        queue.enqueue(77);
        queue.enqueue(88);
        queue.enqueue(99);

        //Display the elements of the queue
        System.out.println("Peek Element "+queue.queuePeek());

        //Dequeue the elements from the queue
        System.out.println("Dequeue Element " + queue.dequeue());

        //Display the elements of the queue
        System.out.println("Peek Element "+queue.queuePeek());

        //Display the elements of the queue
        if(queue.queueIsEmpty()){
            System.out.println("Queue is Empty");
        }
        else{
            System.out.println("Queue is not Empty");
        }

        //Display the elements of the queue
        System.out.println("Queue Elements are: ");
        while(!queue.queueIsEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }

    }
}
