class SumOfTwoPrimes{

    boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

}

public class P13 {
    public static void main(String[] args) {
        SumOfTwoPrimes obj = new SumOfTwoPrimes();
        int n = Integer.parseInt(args[0]);

        boolean found = false;

        for (int i = 2; i <= n / 2; i++) {
            if (obj.isPrime(i) && obj.isPrime(n - i)) {
                System.out.println(n + " = " + i + " + " + (n - i));
                found = true;
            }
        }

        if (!found) {
            System.out.println(n + " Cannot be expressed as sum of two primes.");
        }
    }
}