import org.junit.jupiter.api.Test;

import static com.linearsearch.FindSpecificWord.*;
import static org.junit.jupiter.api.Assertions.*;

public class FindSpecificWordTest {
    @Test
    void test1(){
        String[] input = {"Hello everyone", "Hello everyone, how are you?", "Hello everyone, wassup?"};
        String word = "was";
        String expectedString = "Hello everyone, wassup?";
        String result = findSpecificWord(input,word);
        assertEquals(expectedString,result);
    }

    @Test
    void test2(){
        String[] input = {"Hello everyone", "Hello everyone, how are you?", "Hello everyone, wassup?"};
        String word = "are";
        String expectedString = "Hello everyone, how are you?";
        String result = findSpecificWord(input,word);
        assertEquals(expectedString,result);
    }

    @Test
    void test3(){
        String[] input = {"Hello everyone", "Hello everyone, how are you?", "Hello everyone, wassup?"};
        String word = "ever";
        String expectedString = "Hello everyone, wassup?";
        String result = findSpecificWord(input,word);
        assertEquals(expectedString,result);
    }
}
