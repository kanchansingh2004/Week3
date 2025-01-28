package Level1_LinkedList.TaskSchedulerSystem;

public class TaskScheluderMain {
    public static void main(String[] args) {
        // Creating a TaskScheduler object
        TaskScheduler ts = new TaskScheduler();

        // method calls to add tasks at the end, beginning and at a specific position
        ts.addAtEnd(1, "Task1", 3, "2025-01-30");
        ts.addAtBeginning(2, "Task2", 1, "2025-01-28");
        ts.addAtPosition(3, "Task3", 2, "2025-01-29", 1);

        // method call to display all tasks
        System.out.println("All Tasks:");
        ts.displayAllTasks();

        // method call to view current tasks
        System.out.println("\nViewing current tasks:");
        ts.viewCurrentTask();
        ts.viewCurrentTask();

        // method call to search tasks by priority
        System.out.println("\nSearching for tasks with priority 2:");
        ts.searchByPriority(2);

        // method call to remove task by ID
        System.out.println("\nRemoving task with ID 2:");
        ts.removeByTaskId(2);
        ts.displayAllTasks();

        // Checking the size of the list
        System.out.println("\nTotal Tasks: " + ts.getSize());
    }
}
