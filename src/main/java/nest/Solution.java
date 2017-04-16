package nest;

/**
 * Created by ritesh on 4/14/17.
 */
import java.io.*;
import java.util.*;

/*
 * Given an input string, find the longest unique continuous
 * subString.
 * inputStr = "abcdbcghjicklmnopw";
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
    public static void main(String[] args) {

        String input = "abcdbcghjicklmnopw";

        final List<Character> output = findLongestSubstring(input);

        for(final Character c : output) {

            System.out.print(c);
        }

    }

    public static List<Character> findLongestSubstring(String input) {

        final List<Character> set = new ArrayList<>();

        int i = 0;
        int startOfSubstring = 0;
        int start = 0;
        while(i<input.length()) {

            char c = input.charAt(i);

            if(!set.contains(c)) { //c d b --- c

                set.add(c);
            }else {


                while (input.charAt(start) != c) {

                    set.remove(startOfSubstring); // b
                    start++;
                }

                set.remove(startOfSubstring); // b
            }
            i++;
        }

        return set;
    }
}

