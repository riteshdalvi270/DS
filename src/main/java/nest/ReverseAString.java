package nest;

/**
 * Created by ritesh on 4/8/17.
 */
public class ReverseAString {

    public static void main(String args[]) {

        String input = "Hello World";

        reverseAString(input);
    }

    public static void reverseAString(final String input) {

        char[] inputChars = input.toCharArray();

        for(int i = inputChars.length-1; i>=0; i--) {

            System.out.print(inputChars[i]);
        }
    }
}
