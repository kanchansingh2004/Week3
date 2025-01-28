package Level1_LinkedList.SchoolRecordManagement;

public class StudentRecord {
    public static void main(String[] args) {
        // Create the linked list
        StudentLinkedList studentList = new StudentLinkedList();

        // Add a few student records
        studentList.addAtBeginning(101, "Pren pat", 20, "A");
        studentList.addAtEnd(102, "Papao", 21, "B");
        studentList.addAtEnd(103, "Rain", 22, "A");

        // Display all student records
        System.out.println("Initial List:");
        studentList.displayAll();

        // Update grade for a student
        System.out.println("\nUpdating grade for Roll Number 102:");
        studentList.updateGradeByRollNumber(102, "A+");
        studentList.displayAll();

        // Delete a student record
        System.out.println("\nDeleting record with Roll Number 101:");
        studentList.deleteByRollNumber(101);
        studentList.displayAll();

        // Search for a student
        System.out.println("\nSearching for student with Roll Number 103:");
        StudentNode foundStudent = studentList.searchByRollNumber(103);
        if (foundStudent != null) {
            System.out.println("Found: Roll Number: " + foundStudent.rollNumber +
                    "\nName: " + foundStudent.name +
                    "\nAge: " + foundStudent.age +
                    "\nGrade: " + foundStudent.grade);
        } else {
            System.out.println("Student not found.");
        }
    }
}

