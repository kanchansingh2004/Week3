package Level2_HashMap_HashFunction.CustomHashMap;

// CustomLinkedList class to create a linked list
public class CustomHash {
    int key;
    private CustomLinkedList[] arr;

    // Constructor to initialize the array
    public void getLength(int key){
        this.key=key;
        arr=new CustomLinkedList[key];

    }

    // Method to generate a hash key
    public int hashKey(int key){
        return key%key;
    }

    // Method to insert a new node in the linked list
    public void insert(int data,int key){

        // Generate a hash key for the given key
        int mapKey=hashKey(key);
        CustomLinkedList newNode = new CustomLinkedList(data, key);

        // If the index is empty, create a new linked list and add the node
        if (arr[mapKey] == null) {
            arr[mapKey] = newNode;
        }
        else {
            CustomLinkedList current = arr[mapKey];
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;

        }
    }

    // Method to delete a node from the linked list
    public void delete(int key){
        // Generate a hash key for the given key
        int map=hashKey(key);
        CustomLinkedList current=arr[map];
        CustomLinkedList previous=null;

        // Traverse through the linked list to find the node with the given key
        while(current!=null){
            if (current.key == key) {
                // Node found, remove it if it is not the head of the linked list else remove the
                if (previous == null) {
                    arr[map] = current.next;
                } 
                else {
                    previous.next = current.next;
                }
                return;
            }

            // Move to the next node
            previous=current;
            current=current.next;

        }
        System.out.println("key not found "+key); // Key not found
    }

    // Method to search for a node in the linked list
    public void traversal(int key) {
        int mapKey = hashKey(key);
        CustomLinkedList current=arr[mapKey];

        // Traverse through the linked list to find the node with the given key
        while(current!=null){
            if(current.key==mapKey){
                System.out.println("The value at that key is "+current.data);
            }
            current=current.next;
        }
            System.out.println("Key not found");

    }

    // Method to display the linked list
    public void display() {
        // Traverse through each index in the hash map array
        for (int i = 0; i < arr.length; i++) {
            CustomLinkedList current = arr[i];

            // If there is a linked list at this index, print its data
            if (current != null) {
                System.out.print("Index " + i + ": ");
                while (current != null) {
                    System.out.println("Data: " + current.data + " (Key: " + current.key + ")");
                    current = current.next;
                }

            }
        }
    }
}