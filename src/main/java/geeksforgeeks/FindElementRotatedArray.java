package geeksforgeeks;

/**
 * Created by ritesh on 4/19/17.
 */
public class FindElementRotatedArray {

    public static void main(String args[]) {

        int input[] = new int[]{5,6,7,8,9,10,1,2,3};

        int key = 3;

        findElement(input,key);
    }

    public static int findElement(int input[], int key) {

        int start = 0;
        int end = input.length-1;

        int mid = (start+end)/2;

        int midValue = input[mid];

        if(key == midValue) {
            return mid;
        }

        if(key>=input[start]) {

            return findElement(input,start,end,key);
        }

        if(key<=input[end]) {
            return findElement(input,start,end,key);
        }

        return 0;
    }

    public static int findElement(int[] input, int start, int end, int key) {

        if(input[start] ==  key) {
            return start;
        }

        return 0;
    }
}
