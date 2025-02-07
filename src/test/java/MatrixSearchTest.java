import org.junit.jupiter.api.Test;
import static com.binarysearch.MatrixSearch.*;
import static org.junit.jupiter.api.Assertions.*;

public class MatrixSearchTest {
    @Test
    void test1(){
        int[][] input = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int target = 11;
        boolean expectedOutput = true;
        boolean result = searchMatrix(input, target);
        assertEquals(expectedOutput,result);
    }

    @Test
    void test2(){
        int[][] input = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int target = 5;
        boolean expectedOutput = true;
        boolean result = searchMatrix(input, target);
        assertEquals(expectedOutput,result);
    }

    @Test
    void test3(){
        int[][] input = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int target = 20;
        boolean expectedOutput = false;
        boolean result = searchMatrix(input, target);
        assertEquals(expectedOutput,result);
    }
}
