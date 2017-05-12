package square;

import assistant.TrieAssistant;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ritesh on 5/8/17.
 */
public class WordBreak {

    public static void main(String args[]) {

        final String input = "leetcode";

        final String[] dict = new String[]{"leet","code"};

        System.out.println(wordbreakHashSolution(input,dict));

        final TrieAssistant trieAssistant = new TrieAssistant();
    }

    public static boolean wordbreakHashSolution(final String input, final String[] dict) {

        final Map<Integer,String> hashCodeByString = new HashMap<>();

        for(final String dt : dict) {

            int hashCode = convertIntoHashCode(dt);

            hashCodeByString.put(hashCode,dt);
        }

        boolean found = false;

        char[] inputChar = input.toCharArray();

        int counter = 1;
        int sum = 0;
        for(char in : inputChar) {

            sum = sum + counter * in;
            counter++;

            if(hashCodeByString.containsKey(sum)) {
                System.out.println(hashCodeByString.get(sum));
                counter = 1;
                sum = 0;
                found = true;
            }
        }

        return found;
    }

    public static int convertIntoHashCode(final String dt) {

        char[] dtChar = dt.toCharArray();

        int sum = 0;

        int counter = 1;

        for(char dtValue : dtChar) {

           sum = sum + counter * dtValue;
           counter++;
        }

        return sum;
    }
}
