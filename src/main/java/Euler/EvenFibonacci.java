package Euler;

/**
 * Created by ritesh on 4/16/17.
 */
public class EvenFibonacci {

    public static void main(String args[]) {

        int sum = 0;

        int a = 1;
        int b = 2;
        int x = 0;

        while(a<4000000) {

          if(a%2==0) {
              x = x + a;
          }

          sum = a + b;
          a = b;
          b = sum;
        }

        System.out.println(x);
    }
}
