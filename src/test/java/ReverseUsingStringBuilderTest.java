import org.junit.jupiter.api.Test;

import static com.stringbuilder.ReverseUsingStringBuilder.*;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseUsingStringBuilderTest {
    @Test
    void test1(){
        String input = "Blimey!";
        String expectedOutput = "!yemilB";
        String reverse= reverseString(input);
        assertEquals(expectedOutput, reverse);
    }

    @Test
    void test2(){
        String input = "hello!";
        String expectedOutput = "!olleh";
        String reverse= reverseString(input);
        assertEquals(expectedOutput, reverse);
    }

    @Test
    void test3(){
        String input = "Blimey!";
        String expectedOutput = "Blime";
        String reverse= reverseString(input);
        assertEquals(expectedOutput, reverse);
    }
}
