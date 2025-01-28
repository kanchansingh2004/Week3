package Level1_LinkedList.RoundRobinAlgorithm;

public class RoundRobinMain {
    public static void main(String[] args) {
        // Create a new instance of the RoundRobin class
        RoundRobin scheduler = new RoundRobin();

        // Add processes to the circular linked list
        scheduler.addProcess(1, 10, 2);
        scheduler.addProcess(2, 5, 1);
        scheduler.addProcess(3, 8, 3);

        // Display initial processes
        System.out.println("Initial Process List:");
        scheduler.displayProcesses();

        // Set the time quantum
        int timeQuantum = 3;

        // Call the Round Robin Scheduling method
        System.out.println("\nCalling the Round Robin Scheduling:");
        scheduler.roundRobinScheduling(timeQuantum);
    }
}
