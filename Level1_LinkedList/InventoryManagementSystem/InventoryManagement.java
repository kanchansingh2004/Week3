package Level1_LinkedList.InventoryManagementSystem;
//Create a class InventoryManagement
public class InventoryManagement {
        public static void main(String[] args){
            //Create object of ItemLinkedList class
            ItemLinkedList itemList = new ItemLinkedList();

            //Add an item at the beginning, end, or at a specific position.
            itemList.addAtBeginning("KitKat",9999, 40, 20);
            itemList.addAtBeginning("DairyMilk Silk", 2233, 10, 10);
            itemList.addAtEnd("Ice Cream", 9090, 5, 200);
            itemList.addAtPosition(3,"Sprite",1010,2,45);

            //Display all the items
            itemList.display();

            //Update the quantity of an item by Item ID.
            itemList.updateQuantityByItemId(1010,4);

            //Remove an item based on Item ID.
            itemList.removeByID(1010);

            //Display all the items
            System.out.println("\nDisplay the remaining items");
            itemList.display();

            //Sort the items and display
            System.out.println("\n\nThe Sorted Item List is:");
            itemList.sortByItemID();
            itemList.display();

            //Display the total value of inventory and total number of items.
            itemList.totalValueOfInventory();
            itemList.displaySize();
        }
}
