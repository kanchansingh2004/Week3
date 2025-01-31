package sortingalgorithms;
//Import the Array to use its functionality
import java.util.Arrays;

public class CountingSort {
    // Function to sort student ages using Counting Sort
    public static void countingSortAges(int[] ages) {
        int minAge = 10, maxAge = 18; // Age range
        int range = maxAge - minAge + 1; // 9 (from 10 to 18)

        // Create count array
        int[] count = new int[range];

        // Count occurrences of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Compute cumulative frequency
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Sort the ages using count array
        int[] output = new int[ages.length];
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            output[count[age - minAge] - 1] = age;
            count[age - minAge]--; // Decrement count after placing
        }

        // Copy sorted ages back to original array
        System.arraycopy(output, 0, ages, 0, ages.length);
    }

    public static void main(String[] args) {
        int[] studentAges = {12, 14, 10, 18, 12, 11, 17, 14, 10, 16};
        System.out.println("Original ages: " + Arrays.toString(studentAges));

        countingSortAges(studentAges); // Sorting student ages

        System.out.println("Sorted ages: " + Arrays.toString(studentAges));
    }
}