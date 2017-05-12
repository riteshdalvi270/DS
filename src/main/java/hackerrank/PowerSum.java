package hackerrank;

import java.util.Scanner;

/**
 * Created by ritesh on 5/11/17.
 */
public class PowerSum {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double n = scanner.nextDouble();

        int ways = 0;
        countWays(x,n,1, ways);

        System.out.println(ways);
    }

    public static void countWays(double x, double n, double fact,int ways) {

        if(Math.pow(fact,n) > x) {
            return;
        }

        if(Math.pow(fact,n) < x) {
            fact = fact + 1;
        }

        if(x == 0) {
            ways = ways + 1;
        }

        for(int i = 1; i<=10; i++) {
            countWays(x-Math.pow(i,n), n, fact, ways);
        }

        return;
    }
}
