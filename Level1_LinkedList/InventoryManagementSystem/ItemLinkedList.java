package Level1_LinkedList.InventoryManagementSystem;
//Create a class ItemLinkedList to create item linked list
public class ItemLinkedList {

    //Create a static nested class to initialize a node
    public static class ItemNode{
        String itemName;
        int itemId;
        int quantity;
        int price;
        ItemNode next;

        //constructor to initialize the values
        ItemNode(String itemName, int itemId, int quantity, int price){
            this.itemName = itemName;
            this.itemId = itemId;
            this.quantity = quantity;
            this.price = price;
            this.next = null;
        }
    }

    //Variable for head of linked list and size to keep track of linked list.
    private ItemNode head;
    int size=0;

    //Create method to display the size
    public void displaySize(){
        System.out.println("Number of Items are: "+ this.size);
    }

    //Create a method to add element at beginning
    public void addAtBeginning(String itemName, int itemId, int quantity, int price){
        ItemNode newNode = new ItemNode(itemName, itemId, quantity, price);
        newNode.next = head;
        head = newNode;
        size++;
    }

    //Add an item at the end
    public void addAtEnd(String itemName, int itemId, int quantity, int price){
        ItemNode newNode = new ItemNode(itemName, itemId, quantity, price);
        if(head == null){
            addAtBeginning(itemName, itemId, quantity, price);
            return;
        }
        ItemNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        size++;
    }

    //Add an item at a specific position
    public void addAtPosition(int position,String itemName, int itemId, int quantity, int price){
        ItemNode newNode = new ItemNode(itemName, itemId, quantity, price);
        ItemNode current = head;
        while(position-1>1){
            current = current.next;
            position--;
        }
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    //Remove an item based on Item ID
    public void removeByID(int itemId){
        ItemNode current = head;
        if(head == null){
            System.out.println("List is empty. No record in list!!");
            return;
        }
        if(head.itemId == itemId){
            head= head.next;
            System.out.println("Item deleted successfully");
            size--;
            return;
        }

        while(current.next != null && current.next.itemId != itemId){
            current = current.next;
        }

        if(current.next == null){
            System.out.println("Record Not Found!!");
            return;
        }
        current.next = current.next.next;
        System.out.println("\nItem deleted successfully");
        size--;
    }

    //Create a method to Search for an item record by item ID
    public ItemNode searchByItemId(int itemId){
        ItemNode current = head;
        while(current != null){
            if(current.itemId == itemId){
                return current;
            }

            current = current.next;
        }
        return null;
    }

    // Update the quantity of an item by Item ID.
    public void updateQuantityByItemId(int itemId, int newQuantity) {
        ItemNode current = searchByItemId(itemId);
        if (current != null) {
            current.quantity = newQuantity;
            System.out.println("\nQuantity updated successfully.");
        } else {
            System.out.println("Record not found.");
        }
    }

    //Calculate and display the total value of inventory
    public void totalValueOfInventory(){
        ItemNode current = head;
        int total = 0;
        while(current != null){
            total += current.price*current.quantity;
            current = current.next;
        }

        System.out.println("Total Cost of Inventory: "+ total);
    }

    //Create method to display the inventory items
    public void display(){
        ItemNode current = head;
        while(current != null){
            System.out.println("Item ID: "+ current.itemId);
            System.out.println("Item Name: "+ current.itemName);
            System.out.println("Item Quantity: "+ current.quantity);
            System.out.println("Item price: "+ current.price);
            System.out.println("==================================");

            current = current.next;
        }
    }

    // Method to perform Merge Sort
    public void sortByItemID() {
        head = mergeSort(head);
    }

    // Recursive merge sort function
    private ItemNode mergeSort(ItemNode node) {
        if (node == null || node.next == null) {
            return node; // Base case: empty list or single node
        }

        // Split the list into two halves
        ItemNode middle = getMiddle(node);
        ItemNode nextOfMiddle = middle.next;
        middle.next = null; // Break the list into two halves

        // Recursively sort the two halves
        ItemNode left = mergeSort(node);
        ItemNode right = mergeSort(nextOfMiddle);

        // Merge the sorted halves
        return merge(left, right);
    }

    // Helper function to find the middle of the linked list
    private ItemNode getMiddle(ItemNode node) {
        if (node == null) return node;

        ItemNode slow = node, fast = node;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // Slow will point to the middle node
    }

    // Helper function to merge two sorted linked lists
    private ItemNode merge(ItemNode left, ItemNode right) {
        if (left == null) return right;
        if (right == null) return left;

        ItemNode result;
        if (left.itemId <= right.itemId) {
            result = left;
            result.next = merge(left.next, right);
        } else {
            result = right;
            result.next = merge(left, right.next);
        }
        return result;
    }

}
