import org.junit.jupiter.api.Test;
import static com.stringbuffer.ConcatenateString.*;
import static com.stringbuilder.ReverseUsingStringBuilder.reverseString;
import static org.junit.jupiter.api.Assertions.*;

public class ConcatenateStringTest {
    @Test
    void test1(){
        String[] input = {"You", "can", "do", "it", "!"};
        String expectedOutput = "You can do it !";
        String result = concatenate(input);
        assertEquals(expectedOutput, result);
    }
    @Test
    void test2(){
        String[] input = {"hello", "buddy"};
        String expectedOutput = "hello buddy ";
        String result = concatenate(input);
        assertEquals(expectedOutput, result);
    }
    @Test
    void test3(){
        String[] input = {"I", "am", "writing", "code"};
        String expectedOutput = "I am writing code ";
        String result = concatenate(input);
        assertEquals(expectedOutput, result);
    }
}
