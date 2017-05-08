package geeksforgeeks;

/**
 * Created by ritesh on 5/6/17.
 */
public class SumOfSubSquares {

    public static void main(String args[]) {

        final int[][] input = new int[][] {
                {1,1,1,1,1},
                {2,2,2,2,2},
                {3,3,3,3,3},
                {4,4,4,4,4},
                {5,5,5,5,5},
        };

        int[][] output = findSum(input, 3);

        for(int i = 0; i< output.length; i++) {
            for(int j=0; j<output[0].length; j++) {

                System.out.print(output[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static int[][] findSum(final int[][] input, int k) {

        int row = input.length;
        int column = input[0].length;

        int[][] output = new int[k][k];

        int sum = 0;

        for(int i=0; i<row; i++) {


            if(i-k >= 0) {
                break;
            }

            for(int j=0; j<column; j++) {


                if(j-k >= 0) {
                    break;
                }

               for(int m = j; m<k+j; m++) {

                   int q = i;

                   while(q<k+i) {
                       sum = sum + input[q][m];
                       q++;
                   }
               }

               output[i][j] = sum;
                sum = 0;


            }

        }

        return output;
    }
}
