package basic_math;

import lib.BinarySearch;
import lib.In;
import lib.StdOut;

import java.util.Arrays;

public class ThreeSumFast {
    public static int count(int[] a) { // Count triples that sum to 0.
        Arrays.sort(a);
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                if (BinarySearch.rank(-a[i] - a[j], a) > j)
                    cnt++;
        return cnt;
    }

    public static void main(String[] args) {
//        int[] a = In.readInts(args[0]);
        StdOut.println(count(new int[]{-40, -20, -10, 0, 5, 10, 30, 40}));
    }
}
