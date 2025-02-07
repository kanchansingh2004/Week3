import org.junit.jupiter.api.Test;
import static com.linearsearch.FindNegativeNumber.*;
import static org.junit.jupiter.api.Assertions.*;

public class FindNegativeNumberTest {
    @Test
    void test1(){
        int[] input = {1,2,3,4,5,-1,6,8,-2};
        int expectedIndex = 5;
        int index = linearSearch(input);
        assertEquals(expectedIndex,index);
    }

    @Test
    void test2(){
        int[] input = {1,2,-3,4,5,1,6,8,-2};
        int expectedIndex = 2;
        int index = linearSearch(input);
        assertEquals(expectedIndex,index);
    }

    @Test
    void test3(){
        int[] input = {1,2,3,4,5,6,7,8,9};
        int expectedIndex = -1;
        int index = linearSearch(input);
        assertEquals(expectedIndex,index);
    }
}
