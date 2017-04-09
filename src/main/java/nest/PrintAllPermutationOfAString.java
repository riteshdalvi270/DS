package nest;

/**
 * Created by ritesh on 4/8/17.
 */
public class PrintAllPermutationOfAString {

    public static void main(String args[]) {

        final String input = "ABC";

        //permutationOfStringsInterative(input);

        permute(input.toCharArray(),0,input.length()-1);
    }


    // not working.
    private static void permutationOfStringsInterative(final String input) {

        System.out.println(input);

        char temp;

        char[] in = input.toCharArray();

        for(int i = 0; i< in.length; i++) {

            for(int j = i; j< in.length; j++) {

                if(j+1 >= in.length) {
                    continue;
                }

                temp = in[j];
                in[j] = in[j+1];
                in[j+1] = temp;

                System.out.println(in);
            }

            in = input.toCharArray();
        }
    }

    private static void permute(char[] str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                swap(str,l,i);
                permute(str, l+1, r);
                swap(str,l,i);
            }
        }
    }

    private static void swap(char in[], int a, int b) {
        char temp;

        temp = in[a];
        in[a] = in[b];
        in[b] = temp;
    }
}
