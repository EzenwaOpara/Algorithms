package practice;

import java.util.List;

public class InsertionN {

    public static void sort(Comparable[] a) {

        int N = a.length;
        for (int i = 1; i < N; i++) {
            printArray(a);
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--)
                swap(a, j, j - 1);
        }
        printArray(a);
    }

    private static void swap(Comparable[] a, int j, int i) {
        Comparable temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }

    private static boolean less(Comparable comparable, Comparable comparable1) {
        return comparable.compareTo(comparable1) < 0;
    }

    public static void main(String[] args) {
        Integer[] integers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 1};
        sort(integers);
//        System.out.print("[");
//        for (int i = 0; i < integers.length; i++) {
//            System.out.print(integers[i]);
//            if (i + 1 != integers.length) System.out.print(", ");
//        }
//        System.out.print("]");
    }

    public static void printArray(Object[] arr) {
        for (Object i : arr) System.out.print(i + " ");
        System.out.println();
    }
}
