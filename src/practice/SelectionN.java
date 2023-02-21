package practice;

public class SelectionN {

    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i; j < N; j++) if (less(a[j], a[min])) min = j;
            swap(a, i, min);
        }
    }

    private static void swap(Comparable[] a, int i, int min) {
        Comparable temp = a[i];
        a[i] = a[min];
        a[min] = temp;
    }

    private static boolean less(Comparable comparable, Comparable comparable1) {
        return comparable.compareTo(comparable1) < 0;
    }

    public static void main(String[] args) {
        Integer[] integers = {1, 4, 6, 4, 5, 6, 7, 0, 2, 1};
        sort(integers);
        System.out.print("[");
        for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[i]);
            if (i + 1 != integers.length) System.out.print(", ");
        }
        System.out.print("]");
    }

}
