package Level1_LinkedList.LibraryManagementSystem;

public class LibraryManagementMain {
public static void main (String[] args) {
    // Creating a library object
    LibraryManagement library = new LibraryManagement();

    // create a list of books and add them to the library
    library.addAtEnd("Harry potter and the chamber of secret", "J.K Rowling", "Fantasy", 101, true);
    library.addAtBeginning("Harry potter and the child curse", "J.K Rowling", "Fantasy", 102, true);
    library.addAtPosition("The curse of La Lorona", "Lalisa Manoban", "Horror", 103, true, 1);

    // method call to display the books in the library
    System.out.println("Library (Forward):");
    library.displayForward();

    // Displaying the library in reverse
    System.out.println("\nLibrary (Reverse):");
    library.displayReverse();

    // Searching for a book
    System.out.println("\nSearching for '1984':");
    library.searchBook("1984");

    // Updating availability of a book
    System.out.println("\nUpdating availability for Book ID 102:");
    library.updateAvailability(102, false);
    library.displayForward();

    // method call to count the number of books in the library
    System.out.println("\nCounting books:");
    library.countBooks();

    // method call to remove a book from the library
    System.out.println("\nRemoving Book with ID 101:");
    library.removeByBookId(101);
    library.displayForward();
    }
}
