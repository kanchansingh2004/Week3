import org.junit.jupiter.api.Test;
import static com.binarysearch.LinearAndBinarySearch.*;
import static org.junit.jupiter.api.Assertions.*;

public class LinearAndBinarySearchTest {
    @Test
    void test1(){
        int[] input = {3, 4, 5, -1, 2, 9};
        int result1 = findFirstMissingPositive(input);
        int expectedOutput1 = 0;
        int target = 9;
        int result2 = binarySearch(input,target);
        int expectedOutput2 = 5;
        assertEquals(expectedOutput1,result1);
        assertEquals(expectedOutput2,result2);
    }

    @Test
    void test2(){
        int[] input = {3, 4, 5, -1, 2};
        int result1 = findFirstMissingPositive(input);
        int expectedOutput1 = 1;
        int target = 2;
        int result2 = binarySearch(input,target);
        int expectedOutput2 = 1;
        assertEquals(expectedOutput1,result1);
        assertEquals(expectedOutput2,result2);

    }

    @Test
    void test3(){
        int[] input = {3, 4, 5, -1, 2, 9};
        int result1 = findFirstMissingPositive(input);
        int expectedOutput1 = 1;
        int target = 9;
        int result2 = binarySearch(input,target);
        int expectedOutput2 = 5;
        assertEquals(expectedOutput1,result1);
        assertEquals(expectedOutput2,result2);
    }
}
