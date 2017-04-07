package crackingcode6th.arraylist;

/**
 * Created by ritesh on 3/28/17.
 */
public class ReplacesAllSpaces {

    public static void main(String args[]) {

        String input = "Mr John Smith    ";

        final int lengthOfString = 13;

        System.out.print(replaceSpaces(input,lengthOfString));

    }

    public static String replaceSpaces(String input, final int lengthOfString) {

        char inputCharArray[] = input.toCharArray();

        int originalLength = input.length();

        int j = originalLength-1;

        for(int i = lengthOfString-1; i>=0; i--) {

            if(inputCharArray[i] == ' ') {

                inputCharArray[j--] = '0';
                inputCharArray[j--] = '2';
                inputCharArray[j--] = '%';

            }else {

                inputCharArray[j] = inputCharArray[i];
                j--;
            }
        }

        return new String(inputCharArray);
    }
}
