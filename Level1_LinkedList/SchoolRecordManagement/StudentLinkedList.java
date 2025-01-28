package Level1_LinkedList.SchoolRecordManagement;

import java.sql.SQLOutput;

//Create a class StudentLinkedList to initialize node for student details
public class StudentLinkedList {
    //Create Head Node
    private StudentNode head;

    //Create a method to add student details at beginning
    public void addAtBeginning(int rollNumber, String name, int age, String grade){
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    //Create a method to add student details at end
    public void addAtEnd(int rollNumber, String name, int age, String grade){
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        StudentNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    //Create a method to delete a student record by Roll Number
    public void deleteByRollNumber(int rollNumber){
        StudentNode current = head;
        if(head == null){
            System.out.println("List is empty. No record!!");
            return;
        }

        if(head.rollNumber == rollNumber){
            head = head.next;
            System.out.println("Record deleted successfully");
            return;
        }

        while(current.next != null && current.next.rollNumber != rollNumber){
            current = current.next;
        }

        if(current.next == null){
            System.out.println("Record not found!!");
        }
        else{
            current.next = current.next.next;
            System.out.println("Record deleted successfully");
        }
    }

    //Create a method to Search for a student record by Roll Number
    public StudentNode searchByRollNumber(int rollNumber){
        StudentNode current = head;
        while(current != null){
            if(current.rollNumber == rollNumber){
                return current;
            }

            current = current.next;
        }
        return null;
    }

    // Display all student records
    public void displayAll() {
        if (head == null) {
            System.out.println("No records to display.");
            return;
        }
        StudentNode current = head;
        while (current != null) {
            System.out.println("Roll Number: " + current.rollNumber +
                    "\nName: " + current.name +
                    "\nAge: " + current.age +
                    "\nGrade: " + current.grade);
            System.out.println("=============================================");
            current = current.next;
        }
    }

    // Update a student's grade by Roll Number
    public void updateGradeByRollNumber(int rollNumber, String newGrade) {
        StudentNode current = searchByRollNumber(rollNumber);
        if (current != null) {
            current.grade = newGrade;
            System.out.println("Grade updated successfully.");
        } else {
            System.out.println("Record not found.");
        }
    }
}
