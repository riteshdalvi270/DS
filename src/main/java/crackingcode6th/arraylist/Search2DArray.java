package crackingcode6th.arraylist;

/**
 * Created by ritesh on 4/18/17.
 */
public class Search2DArray {

    public static void main(String args[]) {

        int[][] input = new int[][]{
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
            };

        System.out.println(searchTwoDimensionalArray(input,9));
    }

    public static boolean searchTwoDimensionalArray(final int[][] input, int target) {

        if(input.length == 0) {
            return false;
        }

        int column = 0;
        int row = 0;

        for(int i = 0; i<input.length;i++) {

            if(target < input[i][input[0].length-1]) {
                row = i;
                break;
            }
        }

        for(int i=input[0].length-1;i>=0;i--) {

            if(target > input[row][i]) {
                column = i;
                break;
            }
        }

        for(int i=column;i<input[0].length;i++) {

            if(target == input[i][column]) {
                return true;
            }

            if(target < input[i][column]) {
                row = i;
                break;
            }
        }

        for(int i = 0; i<input.length-1; i++) {

            if(target == input[row][i]) {
                return true;
            }
        }

        return false;
    }
}
