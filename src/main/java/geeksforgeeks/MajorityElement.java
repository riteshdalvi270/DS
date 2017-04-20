package geeksforgeeks;

/**
 * Created by ritesh on 4/19/17.
 */
public class MajorityElement {

    public static void main(String args[]) {

        int[] input = new int[]{3, 3, 4, 2, 4, 4, 2, 4};

        System.out.println(findMajorityElement(input));
    }

    public static int findMajorityElement(int[] input) {

        int count = 0;

        for(int i=0; i<input.length; i++) {

            int left = i+1;
            int right = input.length-1;
            int value = input[i];

            count++;

            while(left<right) {

                if(value == input[left]) {

                    count++;

                    if(count > (input.length-1)/2) {

                        return value;
                    }
                }

                if(value == input[right]) {

                        count++;

                        if(count > (input.length-1)/2) {

                            return value;

                }
            }


                left++;
                right--;
        }

        count = 0;
    }

     return 0;
    }
}
