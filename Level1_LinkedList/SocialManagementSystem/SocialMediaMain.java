package Level1_LinkedList.SocialManagementSystem;

public class SocialMediaMain {
    public static void main(String[] args) {
        // Create a new social media system
        SocialMedia connections = new SocialMedia();

        // method call to add users
        connections.addUser(1, "Kushu", 20);
        connections.addUser(2, "Kaavy", 24);
        connections.addUser(3, "Kanha", 22);
        connections.addUser(4, "kish", 22);


        // method call to add friend connections
        connections.addFriendConnection(1, 2);
        connections.addFriendConnection(1, 3);
        connections.addFriendConnection(3, 4);

        // method call to display all users
        System.out.println("All Users:");
        connections.displayAllUsers();
        System.out.println("\n========================================\n");

        // Display friends of a specific user
        connections.displayFriends(1);
        System.out.println("\n========================================\n");

        // Find mutual friends between two users
        connections.findMutualFriends(1, 2);
        System.out.println("\n========================================\n");

        // method call to remove friend connection
        connections.removeFriendConnection(1, 2);
        connections.displayFriends(1);
        System.out.println("\n========================================\n");

        // method call to count friends of a user
        connections.countFriends();
    }
}
