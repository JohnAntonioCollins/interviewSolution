import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

/**
 * @Author John Antonio Collins
 * Created by john on 7/31/17.
 */
public class OutputFormatterTest
{
    OutputFormatter outputFormatter;
    String expected;
    String actual;
    CharacterCounter characterCounter;

    @Before
    public void before()
    {
        outputFormatter = new OutputFormatter();
        expected = "\" \"=1, \"a\"=1, \"b\"=1, \"c\"=1, \"d\"=2, \"e\"=2, \"f\"=2";

        characterCounter = new CharacterCounter();
        characterCounter.counter = new HashMap<Character, Integer>();
        characterCounter.counter.put('a', 1);
        characterCounter.counter.put('b', 1);
        characterCounter.counter.put('c', 1);
        characterCounter.counter.put(' ', 1);
        characterCounter.counter.put('d', 2);
        characterCounter.counter.put('e', 2);
        characterCounter.counter.put('f', 2);
    }

    @Test
    public void formatForPrintToScreenTest(){
        actual = outputFormatter.formatForPrintToScreen(characterCounter);
        assertEquals(expected, actual);
    }
}
