package geeksforgeeks;

/**
 * final the k largest element in an array.
 * Created by ritesh on 5/7/17.
 */
public class KLargestElementInAnArray {

    public static void main(String args[]) {

        int[] input = new int[]{1, 23, 12, 9, 30, 2, 50};

        int k = 3;

        KLargestElementInAnArray(input,k);
    }

    //Steps:
    // 1. Build max-heap. (call max-heapify)
    // 2. extract 3 largest elements.

    public static void KLargestElementInAnArray(final int[] input, int k) {

        int heapSize = input.length;

        for(int i=heapSize/2; i>=0; i--) {
            maxHeapify(input,i);
        }

        for(int i=0;i<k;i++) {
            int output = extractMax(input);

            System.out.println(output);
        }
    }

    public static int extractMax(final int[] input) {

        if(input.length<1) {
            throw new RuntimeException("Heap size less");
        }

        int max = input[0];

        input[0] = input[input.length-1];

        maxHeapify(input,0);

        return max;
    }

    public static void maxHeapify(final int[] input, int index) {

        int l = Left(index);
        int r = Right(index);

        int largest = index;

        if(l<input.length && input[l] > input[largest]) {
            largest = l;
        }

        if(r<input.length && input[r] > input[largest]) {
            largest = r;
        }

        if(largest!=index) {
            exchange(input,largest,index);
            maxHeapify(input,largest);
        }
    }

    public static void exchange(int[] input, int largest, int index) {
        int temp = input[largest];
        input[largest] = input[index];
        input[index] = temp;
    }

    public static int Left(int index) {
        return 2*index;
    }

    public static int Right(int index) {
        return 2*index + 1;
    }
}
