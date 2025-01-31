package Level2_HashMap_HashFunction;
//Import necessary libraries for the program
import java.util.*;

//Create a class named SubArrayWithZeroSum
public class SubArrayWithZeroSum {
    public static int countZeroSumSubarrays(int[] arr) {
        // Map to store frequency of cumulative sum of subarrays
        Map<Integer, Integer> sumMap = new HashMap<>();
        int cumulativeSum = 0;
        int count = 0;

        // Initialize with sum 0 occurring once
        sumMap.put(0, 1);

        for (int num : arr) {
            cumulativeSum += num; // Update cumulative sum

            // If sum has been seen before, all previous occurrences contribute to zero-sum subarrays
            if (sumMap.containsKey(cumulativeSum)) {
                count += sumMap.get(cumulativeSum);
            }

            // Update frequency of the cumulative sum in map
            sumMap.put(cumulativeSum, sumMap.getOrDefault(cumulativeSum, 0) + 1);
        }

        return count; // Return total zero-sum subarrays
    }

    public static void main(String[] args) {
        // Test the function with sample testcase
        int[] arr = {3, 4, -7, 1, 2, -6, 1, 5};
        System.out.println("Total Zero-Sum Subarrays: " + countZeroSumSubarrays(arr));
    }
}
