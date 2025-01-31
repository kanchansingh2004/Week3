package CircularTourProblem;
//import required classes and packages for CircularTour class
import java.util.ArrayDeque;
import java.util.Deque;

//CircularTour class to find the starting point of the tour
public class CircularTour {
    //tourTrack method to find the starting point of the tour
    public static int tourTrack(int[] petrol, int[] distance){
        //create a queue to store the index of petrol pumps
        Deque<Integer> queue = new ArrayDeque<>();
        int start = -1;
        int totalPetrol = 0;
        int extraPetrol = 0;

        //iterate through the petrol pumps
        for(int i=0;i<petrol.length;i++){
            totalPetrol += petrol[i] - distance[i];
            queue.addLast(i);

            if(totalPetrol<0){
                extraPetrol += totalPetrol;
                start = i+1;
                queue.clear();
                totalPetrol = 0;
            }
        }

        return (totalPetrol - extraPetrol >= 0 )? start : -1; //return the starting point of the tour
    }
    public static void main(String[] args) {
        //initialize petrol and distance arrays
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 3};

        //call the tourTrack method to find the starting point of the tour
        int result = tourTrack(petrol, distance);

        //print the starting point of the tour
        if(result == -1){
            System.out.println("NO possible start point");
        }
        else{
            System.out.println("Start point is: "+ result);
        }
    }
}
