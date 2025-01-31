package Level2_HashMap_HashFunction;
//Importing HashMap and Map
import java.util.HashMap;
import java.util.Map;

//Creating a class PairSumIndices
public class PairSumIndices {
    //Creating a method findThePairIndices which takes an array and target as input and returns an array of integers
        public static int[] findThePairIndices(int[] array, int target){
            //Creating a HashMap with key as Integer and value as Integer
            Map<Integer, Integer> map = new HashMap<>();

            //Iterating through the array
            for(int i=0;i<array.length;i++){
                int required = target-array[i];
                if(map.containsKey(required)){
                    return new int[]{map.get(required), i}; //If pair exist then return the indices
                }
                map.put(array[i], i);
            }
            return new int[]{-1,-1}; //If no such pair exist
        }
        public static void main(String[] args) {
            //Creating an array of integers and target
            int[] array = {5, 7, 4, 5, 7};
            int target = 10;

            //Calling the method findThePairIndices and storing the result in an array
            int[] result = findThePairIndices(array,target);
            // If the result is -1 then no such pair exist
            if(result[0] == -1){
                System.out.println("No such pair exist!");
            }
            else{
                System.out.println("Pair exist at index : "+ result[0] + " "+ result[1]);
            }
        }
}
