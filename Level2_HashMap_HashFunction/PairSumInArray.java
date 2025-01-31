package Level2_HashMap_HashFunction;

//Importing required Java Libraries for HashMap and Map
import java.util.HashMap;
import java.util.Map;

//Creating a class PairSumInArray
public class PairSumInArray {
    //Creating a method findThePair which takes an array and target as input and returns a boolean value
    public static boolean findThePair(int[] array, int target){
        //Creating a HashMap to store the values of array and target-array[i]
        Map<Integer, Integer> map = new HashMap<>();
        for(int value : array){
            map.put(value, target-value);

            //Checking if the map contains the target-value
            if(map.containsKey(target-value)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //Creating an array and target value
        int[] array = {5, 6, 4, 5, 7};
        int target = 10;

        //Checking if the pair exists in the array
        if(findThePair(array,target)){
            System.out.println("Pair does exists in Array for "+ target);
        }
        else{
            System.out.println("Pair doesn't exists in Array for "+ target);
        }
    }
}
