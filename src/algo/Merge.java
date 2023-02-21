package algo;

public class Merge {

    private static Comparable[] aux;

    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    private static void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;
        for (int k = lo; k < a.length; k++) aux[k] = a[k];
        for (int k = lo; k < a.length; k++) {
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (less(aux[j], aux[i])) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }

    private static boolean less(Comparable aux, Comparable aux1) {
        return aux.compareTo(aux1) < 0;
    }

    public static void main(String[] args) {

        String[] s = {"Z", "E", "G", "Z" ,"M","R", "A", "C", "E", "R", "T"};
        for (int i = 0; i < s.length; i++) System.out.print(s[i] + " ");
        System.out.println();
        System.out.println();
        sort(s);
    }
}
