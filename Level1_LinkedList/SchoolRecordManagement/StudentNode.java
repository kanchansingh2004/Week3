package Level1_LinkedList.SchoolRecordManagement;
//Create a StudentNode to instantiate the student details
public class StudentNode {
    //Instance Variable
     int rollNumber;
     String name;
     int age;
     String grade;
    StudentNode next;

    //Create a constructor for student details.
    StudentNode(int rollNumber, String name, int age, String grade){
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }


}
