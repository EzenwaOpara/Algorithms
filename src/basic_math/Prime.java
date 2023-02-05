package basic_math;

public class Prime {
    public static boolean isPrime(int N) {
        if (N < 2) return false;
        for (int i = 2; i * i <= N; i++)
            if (N % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        boolean prime = Prime.isPrime(13);
        System.out.println(prime);
    }
}
