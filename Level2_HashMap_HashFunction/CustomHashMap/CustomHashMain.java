package Level2_HashMap_HashFunction.CustomHashMap;

// CustomLinkedList class to create a linked list
import java.util.Scanner;

// CustomLinkedList class to create a linked list
public class CustomHashMain {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        CustomHash custom = new CustomHash();

        // Get the total number of elements from the user
        System.out.print("Enter the total number of elements :- ");
        int n = sc.nextInt();
        custom.getLength(n);

        // Insert the elements in the linked list
        for (int i = 0; i < n; i++) {
            int data;
            System.out.print("Enter the data :- ");
            System.out.println();
            data = sc.nextInt();
            custom.insert(data, i);
        }

        // Display the linked list
        custom.display();

        // Delete a node from the linked list
        custom.delete(2);
        custom.traversal(2);
        custom.display();
    }
}
