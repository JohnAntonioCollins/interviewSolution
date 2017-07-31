import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * @Author John Antonio Collins
 * Created by john on 7/31/17.
 */
public class CharacterCounterTest
{
    CharacterCounter characterCounter;
    HashMap<Character, Integer> expected;

    @Before
    public void before(){
        characterCounter = new CharacterCounter();
        expected = new HashMap<Character, Integer>();
        expected.put('a', 1);
        expected.put('b', 1);
        expected.put('c', 1);
        expected.put(' ', 1);
        expected.put('d', 2);
        expected.put('e', 2);
        expected.put('f', 2);
    }

    @Test
    public void count_Test(){
        characterCounter.count("abc ddeeff");
        Map actual = characterCounter.counter;
        assertEquals(".count should build a map like this", expected, actual);
    }
}
