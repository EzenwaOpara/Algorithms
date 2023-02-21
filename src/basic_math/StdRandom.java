package basic_math;

public class StdRandom {

    public static void shuffle(Object[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) { // Exchange a[i] with random element in a[i..N-1]
            int r = i + StdRandom.uniform(N - i);
            Object temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    public static int discrete(double[] a) { // Entries in a[] must sum to 1.
        double r = StdRandom.random();
        double sum = 0.0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
            if (sum >= r) return i;
        }
        return -1;
    }

    public static int uniform(int lo, int hi) {
        return lo + StdRandom.uniform(hi - lo);
    }

    public static int uniform(int N) {
        return (int) (StdRandom.random() * N);
    }

    public static double uniform(double a, double b) {
        return a + StdRandom.random() * (b - a);
    }

    static double random() {
        return 0.0;//for now
    }
}
