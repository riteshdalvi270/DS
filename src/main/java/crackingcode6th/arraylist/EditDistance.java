package crackingcode6th.arraylist;

/**
 * Created by ritesh on 3/28/17.
 */
public class EditDistance {

    public static void main(String args[]) {

        final String input1 = "Pale";
        final String input2 = "Ple";

        System.out.println(editDistance(input1.toCharArray(),input2.toCharArray(),0, 0,0));


        final String input3 = "Pales";
        final String input4 = "Pale";

        System.out.println(editDistance(input3.toCharArray(),input4.toCharArray(),0, 0,0));

        final String input5 = "Pale";
        final String input6 = "Bale";

        System.out.println(editDistance(input5.toCharArray(),input6.toCharArray(),0, 0,0));

        final String input7 = "Pale";
        final String input8 = "Bake";

        System.out.println(editDistance(input7.toCharArray(),input8.toCharArray(),0, 0,0));
    }

    public static int editDistance(final char[] input1, final char[] input2, int length1, int length2, int count) {


        if(length1 > input1.length-1 && length2 <= input2.length-1) {

            count = count + 1;

            return count;
        }

        if(length1 <= input1.length-1 && length2 > input2.length-1) {

            count = count + 1;

            return count;
        }


        if(length1 > input1.length-1 || length2 > input2.length-1) {

           return count;
        }

        if(input1[length1]!=input2[length2]) {
            count = count + 1;
        }

        return Math.min(editDistance(input1,input2, length1+1,length2+1, count),
                editDistance(input1,input2,length1+1,length2,count));
    }
}
