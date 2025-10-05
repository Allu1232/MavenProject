package javaCodings;

public class PrimeInRange {
    public static void main(String[] args) {
        int start = 1;
        int end = 50;

        System.out.println("Prime numbers between " + start + " and " + end + " are:");

        for (int n = start; n<= end; n++) {
            if (isPrime(n)) {
                System.out.print(n + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

