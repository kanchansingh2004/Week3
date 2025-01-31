package Level2_HashMap_HashFunction;
//Import HashSet class from java.util package
import java.util.HashSet;

//Class to find the length of the longest consecutive elements sequence
public class LongestConsecutiveSequence {

    // Function to find the length of the longest consecutive elements sequence
    public static int longestConsecutive(int[] nums) {
        // Create a HashSet to store unique elements from the array
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Iterate through each number in the array
        for (int num : nums) {
            // Check if the current number is the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                //  Count the length of the consecutive sequence starting from 'num'
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Update the longest sequence if needed
                longest = Math.max(longest, currentStreak);
            }
        }

        //Return the length of the longest sequence found
        return longest;
    }

    public static void main(String[] args) {
        // Test the function with an example input
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest consecutive sequence length: " + longestConsecutive(nums));
    }
}

