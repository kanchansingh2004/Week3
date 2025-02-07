import org.junit.jupiter.api.Test;
import static com.stringbuilder.RemoveDuplicates.*;
import static org.junit.jupiter.api.Assertions.*;

public class RemoveDuplicatesTest {
    @Test
    void tes1(){
        String input = "hello";
        String expectedOutput = "helo";
        String result = removeDuplicates(input);
        assertEquals(expectedOutput,result);
    }

    @Test
    void tes2(){
        String input = "helloo";
        String expectedOutput = "helo";
        String result = removeDuplicates(input);
        assertEquals(expectedOutput,result);
    }

    @Test
    void tes3(){
        String input = "fanbase";
        String expectedOutput = "fanbase";
        String result = removeDuplicates(input);
        assertEquals(expectedOutput,result);
    }
}
