import org.junit.jupiter.api.Test;
import static com.binarysearch.FirstAndLastOccurrence.*;
import static org.junit.jupiter.api.Assertions.*;

public class FirstAndLastOccurrenceTest {
    @Test
    void test1(){
        int[] array = {1, 2, 2, 2, 3, 4, 5, 6, 6, 7};
        int target = 2;
        int[] expectedOutput = {1,3};
        int[] result = findFirstAndLastOccurrence(array, target);
        assertEquals(expectedOutput[0],result[0]);
        assertEquals(expectedOutput[1],result[1]);
    }

    @Test
    void test2(){
        int[] array = {2, 2, 2, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10};
        int target = 2;
        int[] expectedOutput = {0,3};
        int[] result = findFirstAndLastOccurrence(array, target);
        assertEquals(expectedOutput[0],result[0]);
        assertEquals(expectedOutput[1],result[1]);
    }

    @Test
    void test3(){
        int[] array = {1, 2, 2, 2, 3, 4, 5, 6, 6, 7};
        int target = 6;
        int[] expectedOutput = {7,8};
        int[] result = findFirstAndLastOccurrence(array, target);
        assertEquals(expectedOutput[0],result[0]);
        assertEquals(expectedOutput[1],result[1]);
    }
}
