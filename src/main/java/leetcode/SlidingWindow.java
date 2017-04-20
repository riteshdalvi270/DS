package leetcode;

/**
 * Created by ritesh on 4/16/17.
 */
public class SlidingWindow {

    public static void main(String args[]) {

        int num[] = new int[] {-95,92,-85,59,-59,-14,88,-39,2,92,94,79,78,-58,37,48,63,-91,91,74,-28,39,90,-9,-72,-88,-72,93,38,14,-83,-2,21,4,-75,-65,3,63,100,59,-48,43,35,-49,48,-36,-64,-13,-7,-29,87,34,56,-39,-5,-27,-28,10,-57,100,-43,-98,19,-59,78,-28,-91,67,41,-64,76,5,-58,-89,83,26,-7,-82,-32,-76,86,52,-6,84,20,51,-86,26,46,35,-23,30,-51,54,19,30,27,80,45,22};

        int k = 10;

        int output[] = slidingWindow(num,k);

        for(int value : output) {
            System.out.println(value);
        }
    }

    public static int[] slidingWindow(int[] nums, int k) {

        if(nums.length == 0) {
            return nums;
        }

        if(nums.length == 1) {
            return new int[]{nums[0]};
        }

        if(k ==0) {
            return nums;
        }

        int outputLength = k == 1 ? nums.length : nums.length - (nums.length/k);
        int output[] = new int[outputLength+1];

        int max = 0;
        for(int i=0; i<nums.length; i++) {

            int condition = nums.length-i;
            if(condition >=k) {
                for (int j = i; j <= k-1 + i; j++) {

                    int num = nums[j];

                    if (max == 0) {
                        max = num;
                    } else if (num > max) {
                        max = num;
                    }
                }

                output[i] = max;
                max = 0;
            }
        }

        return output;
    }
}
