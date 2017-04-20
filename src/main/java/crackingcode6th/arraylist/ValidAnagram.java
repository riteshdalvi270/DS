package crackingcode6th.arraylist;

/**
 * Created by ritesh on 4/19/17.
 */
public class ValidAnagram {

    public static void main(String args[]) {

        final String anagram1 = "rat";
        final String anagram2 = "car";

        System.out.println(anangrams(anagram1,anagram2));
    }

    public static boolean anangrams(final String anagram1,final String anagram2) {

        if(anagram1.length() != anagram2.length()) {
            return false;
        }

        int ascii[] = new int[128];

        char[] anagram1Char = anagram1.toCharArray();

        for(int i=0;i<anagram1Char.length;i++) {

            ascii[anagram1Char[i]]++;
        }

        char[] anagram2Char = anagram2.toCharArray();

        for(int i=0; i<anagram2Char.length;i++) {

            ascii[anagram2Char[i]]--;
        }

        for(char anagram1CharValue : anagram1Char) {

            if(ascii[anagram1CharValue] > 0) {
                return false;
            }
        }

        return true;
    }
}
