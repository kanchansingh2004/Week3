import org.junit.jupiter.api.Test;
import static com.binarysearch.RotationPoint.*;
import static org.junit.jupiter.api.Assertions.*;
public class RotationPointTest {
    @Test
    void test1(){
        int[] array = {4,5,1,2,3};
        int expectedResult = 1;
        int result = findTheRotationPoint(array);
        assertEquals(expectedResult, result);
    }
    @Test
    void test2(){
        int[] array = {7,8,9,5,6,7};
        int expectedResult = 5;
        int result = findTheRotationPoint(array);
        assertEquals(expectedResult, result);
    }
    @Test
    void test3(){
        int[] array = {4,5,5,2,3};
        int expectedResult = 3;
        int result = findTheRotationPoint(array);
        assertEquals(expectedResult, result);
    }
}
