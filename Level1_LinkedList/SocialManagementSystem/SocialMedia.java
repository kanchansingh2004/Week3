package Level1_LinkedList.SocialManagementSystem;
// Importing required packages
import java.util.ArrayList;
import java.util.List;

// SocialMedia class representing a social media platform
public class SocialMedia {
    public connectingNode head;
    public int size;

    // create a connectingNode class representing a user
    static class connectingNode {
        connectingNode next;
        int userID;
        String name;
        int age;
        List<Integer> friendIDs; // List of Friend IDs

        // Constructor to initialize a user
        public connectingNode(int userID, String name, int age) {
            this.userID = userID;
            this.name = name;
            this.age = age;
            this.friendIDs = new ArrayList<>();
        }
    }

    // Add a user to the list
    public void addUser(int userID, String name, int age) {
        connectingNode newNode = new connectingNode(userID, name, age);
        if (head == null) {
            head = newNode;
        } else {
            connectingNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    // Add a friend connection between two users
    public void addFriendConnection(int userID1, int userID2) {
        connectingNode user1 = findUserByID(userID1);
        connectingNode user2 = findUserByID(userID2);

        if (user1 != null && user2 != null) {
            if (!user1.friendIDs.contains(userID2)) {
                user1.friendIDs.add(userID2);
            }
            if (!user2.friendIDs.contains(userID1)) {
                user2.friendIDs.add(userID1);
            }
        } else {
            System.out.println("One or both users not found!");
        }
    }

    // Remove a friend connection between two users
    public void removeFriendConnection(int userID1, int userID2) {
        connectingNode user1 = findUserByID(userID1);
        connectingNode user2 = findUserByID(userID2);

        if (user1 != null && user2 != null) {
            user1.friendIDs.remove(Integer.valueOf(userID2));
            user2.friendIDs.remove(Integer.valueOf(userID1));
        } else {
            System.out.println("One or both users not found!");
        }
    }

    // Find mutual friends between two users
    public void findMutualFriends(int userID1, int userID2) {
        connectingNode user1 = findUserByID(userID1);
        connectingNode user2 = findUserByID(userID2);

        if (user1 != null && user2 != null) {
            List<Integer> mutualFriends = new ArrayList<>(user1.friendIDs);
            mutualFriends.retainAll(user2.friendIDs); // Retain only common friend IDs

            System.out.println("Mutual Friends between " + user1.name + " and " + user2.name + ":");
            if (!mutualFriends.isEmpty()) {
                for (int friendID : mutualFriends) {
                    System.out.println("User ID: " + friendID);
                }
            } else {
                System.out.println("No mutual friends.");
            }
        } else {
            System.out.println("One or both users not found!");
        }
    }

    // Display all friends of a specific user
    public void displayFriends(int userID) {
        connectingNode user = findUserByID(userID);
        if (user != null) {
            System.out.println("Friends of " + user.name + ":");
            if (user.friendIDs.isEmpty()) {
                System.out.println("No friends.");
            } else {
                for (int friendID : user.friendIDs) {
                    System.out.println("User ID: " + friendID);
                }
            }
        } else {
            System.out.println("User not found!");
        }
    }

    // Search for a user by ID
    public connectingNode findUserByID(int userID) {
        connectingNode temp = head;
        while (temp != null) {
            if (temp.userID == userID) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // Search for a user by Name
    public connectingNode findUserByName(String name) {
        connectingNode temp = head;
        while (temp != null) {
            if (temp.name.equals(name)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // Count the number of friends for each user
    public void countFriends() {
        connectingNode temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friendIDs.size() + " friends.");
            temp = temp.next;
        }
    }

    // Display all users
    public void displayAllUsers() {
        connectingNode temp = head;
        while (temp != null) {
            System.out.println("User ID: " + temp.userID + ", Name: " + temp.name + ", Age: " + temp.age);
            temp = temp.next;
        }
    }


}
