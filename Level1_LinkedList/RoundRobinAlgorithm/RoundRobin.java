package Level1_LinkedList.RoundRobinAlgorithm;

//Create class RoundRobin to implement circular linked list
public class RoundRobin {
    //Variables for head, tail, size
    public roundRobinNode head;
    public roundRobinNode tail;
    public int size;

    // Inner class roundRobinNode to represent each process
    static class roundRobinNode {
        roundRobinNode next;
        int processID;
        int burstTime;
        int priority;

        // Create a new process with next
        public roundRobinNode(roundRobinNode next, int processID, int burstTime, int priority) {
            this.next = next;
            this.processID = processID;
            this.burstTime = burstTime;
            this.priority = priority;
        }

        // Constructor to initialize process without next
        public roundRobinNode(int processID, int burstTime, int priority) {
            this.processID = processID;
            this.burstTime = burstTime;
            this.priority = priority;
        }
    }

    // Add a new process at the end of the circular linked list
    public void addProcess(int processID, int burstTime, int priority) {
        roundRobinNode newNode = new roundRobinNode(processID, burstTime, priority);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; // Circular link
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Circular link
        }
        size++;
    }

    // Remove a process by its Process ID
    public void removeProcess(int processID) {
        if (head == null) {
            System.out.println("No processes in the queue!");
            return;
        }

        roundRobinNode temp = head;
        roundRobinNode prev = null;

        // Check if the roundRobinNode to be removed is the head roundRobinNode
        if (temp.processID == processID) {
            if (temp.next == head) { // Only one roundRobinNode in the list
                head = null;
                tail = null;
            } else {
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = head.next;
                head = head.next;
            }
            size--;
            return;
        }

        // Traverse the list and remove the process
        while (temp != null && temp.processID != processID) {
            prev = temp;
            temp = temp.next;
            if (temp == head) break;
        }

        if (temp == null || temp.processID != processID) {
            System.out.println("Process ID not found!");
            return;
        }

        prev.next = temp.next;
        if (temp == tail) {
            tail = prev;
        }
        size--;
    }

    // Call the Round Robin Scheduling
    public void roundRobinScheduling(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule!");
            return;
        }

        roundRobinNode temp = head;
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;
        int processCount = 0;

        // Start the round-robin scheduling
        while (size > 0) {
            processCount++;
            if (temp.burstTime > timeQuantum) {
                temp.burstTime -= timeQuantum;
                totalWaitingTime += timeQuantum;
            } else {
                totalWaitingTime += temp.burstTime;
                totalTurnaroundTime += (totalWaitingTime + temp.burstTime);
                System.out.println("Process " + temp.processID + " completed.");
                removeProcess(temp.processID); // Remove process when completed
            }
            temp = temp.next;
        }

        // Calculate average waiting time and turnaround time
        double avgWaitingTime = (double) totalWaitingTime / processCount;
        double avgTurnaroundTime = (double) totalTurnaroundTime / processCount;

        System.out.println("\nAverage Waiting Time: " + avgWaitingTime);
        System.out.println("Average Turnaround Time: " + avgTurnaroundTime);
    }

    // Display the current processes in the circular linked list
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in the queue!");
            return;
        }

        roundRobinNode temp = head;
        do {
            System.out.println("Process ID: " + temp.processID + ", Burst Time: " + temp.burstTime + ", Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }
}
