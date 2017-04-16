package hackerrank;

import java.util.Scanner;

/**
 * Created by ritesh on 4/15/17.
 */
public class MinMax {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();

        long input[] = new long[] {a,b,c,d,e};
        int length = input.length;

        int counter;
        long sum;

        long min = 0;
        long max= 0;

        for(int i=0; i<input.length; i++) {

            counter = 0;
            sum =0;

            for(int j=i+1; j<input.length; j++) {

                if(counter >4) {

                    if(min == 0 && max == 0) {
                        min = sum;
                        max = sum;
                    }

                    if(sum<min) {
                        min = sum;
                    }

                    if(sum > max) {
                        max = sum;
                    }

                    sum = 0;
                    counter = 0;
                    j = i+2;

                    System.out.println(min + " "+ max);
                }

                if(length - j <3) {
                    break;
                }

                sum = input[i] + input[j];

                counter++;
            }
        }

        System.out.print(min +" "+ max);

    }
}
