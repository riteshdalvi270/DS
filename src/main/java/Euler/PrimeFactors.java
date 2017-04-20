package Euler;

/**
 * Created by ritesh on 4/16/17.
 */
public class PrimeFactors {

    public static void main(String args[]) {

        long number = 600851475143L;

        System.out.println(riteshMaxPrimeFactor(number));

        System.out.println(run());
    }


    public static long riteshMaxPrimeFactor(long number) {

        long maxPrimeFactor = 0;
        long primeFactor = 0;

        while(number >= 1) {

            long primeInput = number;

            for(int i = 2; i<Math.sqrt(primeInput); i++) {

                if (i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0) {
                    if (primeInput % i == 0) {
                        primeFactor = i;
                    }
                }
            }

            if(maxPrimeFactor == 0) {
                maxPrimeFactor = primeFactor;
            }else if(primeFactor > maxPrimeFactor) {
                maxPrimeFactor = primeFactor;
            }

            number = number / maxPrimeFactor;
        }

        return maxPrimeFactor;
    }

    /*
	 * By the fundamental theorem of arithmetic, every integer n > 1 has a unique factorization as a product of prime numbers.
	 * In other words, the theorem says that n = p_0 * p_1 * ... * p_{m-1}, where each p_i > 1 is prime but not necessarily unique.
	 * Now if we take the number n and repeatedly divide out its smallest factor (which must also be prime), then the last
	 * factor that we divide out must be the largest prime factor of n. For reference, 600851475143 = 71 * 839 * 1471 * 6857.
	 */
    // not my solution
    public static String run() {
        long n = 600851475143L;
        while (true) {
            long p = smallestFactor(n);
            if (p < n)
                n /= p;
            else
                return Long.toString(n);
        }
    }


    // Returns the smallest factor of n, which is in the range [2, n]. The result is always prime.
    private static long smallestFactor(long n) {
        if (n <= 1)
            throw new IllegalArgumentException();
        for (long i = 2, end = (long) Math.sqrt(n); i <= end; i++) {
            if (n % i == 0)
                return i;
        }
        return n;  // n itself is prime
    }

}
