import org.junit.jupiter.api.Test;
import static com.binarysearch.PeakElement.*;
import static org.junit.jupiter.api.Assertions.*;

public class PeakElementTest {
    @Test
    void test1(){
        int[] input = {1,-2,3,4,5,5,6,8,2};
        int expectedOutput = 8;
        int result = findPeakElement(input);
        assertEquals(expectedOutput,result);
    }

    @Test
    void test2(){
        int[] input = {1,2,6,4,5,10,6};
        int expectedOutput = 6;
        int result = findPeakElement(input);
        assertEquals(expectedOutput,result);
    }

    @Test
    void test3(){
        int[] input = {1,2,3,4,5,-1,2,8,-2};
        int expectedOutput = 5;
        int result = findPeakElement(input);
        assertEquals(expectedOutput,result);
    }

    @Test
    void test4(){
        int[] input = {1,-2,8,-6,5,10,16,18,22};
        int expectedOutput = 8;
        int result = findPeakElement(input);
        assertEquals(expectedOutput,result);
    }

}
