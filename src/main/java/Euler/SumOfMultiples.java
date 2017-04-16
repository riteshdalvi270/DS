package Euler;

/**
 * Sum of all multiples of 3 or 5 below 100.
 * Created by ritesh on 4/15/17.
 */
public class SumOfMultiples {

    public static void main(String args[]) {

        int number1 = 3;
        int number2 = 5;

        int sum = 0;
        for(int i=1; i< 1000; i++) {

            if(i%number1 == 0 || i%number2 == 0) {
                sum = sum + i;
            }
        }

        System.out.println(sum);
    }
}
