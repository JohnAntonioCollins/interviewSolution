import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author John Antonio Collins
 * Created by john on 7/31/17.
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String word;
        CharacterCounter characterCounter = new CharacterCounter();
        OutputFormatter outputFormatter = new OutputFormatter();
        String prefferredOutputFormat;

        System.out.println("enter a word");
        word = scan.nextLine();
        characterCounter.count(word);
        prefferredOutputFormat = outputFormatter.formatForPrintToScreen(characterCounter);
        System.out.println(prefferredOutputFormat);
    }
}

class CharacterCounter
{
    HashMap<Character, Integer> counter;

    void count(String word)
    {
        counter = new HashMap<Character, Integer>();

        for (int i = 0; i < word.length(); i++)
        {
            if (!counter.containsKey(word.charAt(i)))
            {
                counter.put(word.charAt(i), 1);
            } else
            {
                counter.put(word.charAt(i), counter.get(word.charAt(i)) + 1);
            }
        }
    }
}

class OutputFormatter
{
    StringBuffer stringBuffer;
    String outputBeingComposed;
    String prefix;
    String formattedOutput;

    String formatForPrintToScreen(CharacterCounter characterCounter)
    {
        stringBuffer = new StringBuffer();
        outputBeingComposed = "";
        prefix = "";

        for (Map.Entry<Character, Integer> entry : characterCounter.counter.entrySet())
        {
            stringBuffer.append(prefix);
            stringBuffer.append("\"" + entry.getKey() + "\" =" + entry.getValue());
            prefix = ", ";
        }
        outputBeingComposed = stringBuffer.toString();
        formattedOutput = outputBeingComposed;
        return formattedOutput;
    }
}
