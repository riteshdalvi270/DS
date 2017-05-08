package geeksforgeeks;

/**
 * Created by ritesh on 5/7/17.
 */
public class ConnectNRopes {

    public static void main(String args[]) {

        int[] input = new int[]{4,3,2,6};

        final Heap minHeap = createAndBuildMinHeap(input, input.length);
        int cost = findMinCost(minHeap);

        System.out.println(cost);
    }

    static class Heap {
        int[] input;
        int size;
        int capacity;

        Heap(int n) {
            capacity = 0;
            size = n;
            input = new int[n];
        }
    }

    public static Heap createAndBuildMinHeap(int[] input,int n) {

        final Heap minHeap = new Heap(n);

        for(int i=0; i<input.length; i++) {
            minHeap.input[i] = input[i];
        }

        minHeap.capacity = n;

        buildMinHeapify(minHeap);

        return minHeap;
    }

    //Steps:
    // 1. Build max heap
    // 2. Extract first two min and add it
    // 3. insert it again in the heap.
    public static int findMinCost(final Heap minHeap) {

        return findCost(minHeap);
    }

    private static void buildMinHeapify(final Heap minHeap) {

        int n= minHeap.capacity - 1;

        for(int i = (n-1)/2; i>=0; i--) {
            minHeapify(minHeap,i);
        }

    }

    private static int findCost(final Heap minHeap) {

        if(minHeap.capacity == 1) {
            return minHeap.input[0];
        }

        int min1 = extractMin(minHeap);
        int min2 = extractMin(minHeap);

        int sum = min1 + min2;

        insertIntoMinHeap(minHeap,sum);

        return findCost(minHeap);
    }

    private static void insertIntoMinHeap(final Heap minHeap, int key) {

        minHeap.capacity = minHeap.capacity + 1;

        heapIncreaseKey(minHeap,key);
    }

    private static void heapIncreaseKey(final Heap minHeap, int key) {

        int i = minHeap.capacity - 1;

        minHeap.input[i] = key;

        while(i> 1 && key < minHeap.input[i/2]) {
            exchange(minHeap.input,i,i/2);
            i = i/2;
        }
    }

    private static int extractMin(final Heap minHeap) {

        int min = minHeap.input[0];

        minHeap.input[0] = minHeap.input[minHeap.capacity-1];

        minHeap.capacity = minHeap.capacity -1;

        minHeapify(minHeap,0);

        return min;
    }

    private static void minHeapify(final Heap minHeap, int i) {

        int left = 2*i;
        int right = 2*i+1;

        int smallest = i;

        if(left<minHeap.capacity&& minHeap.input[left] < minHeap.input[smallest]) {
            smallest = left;
        }

        if(right<minHeap.capacity && minHeap.input[right] < minHeap.input[smallest]) {
            smallest = right;
        }

        if(smallest!=i) {
            exchange(minHeap.input, smallest, i);
            minHeapify(minHeap,smallest);
        }
    }


    private static void exchange(final int[] input, int i, int j) {

        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}
