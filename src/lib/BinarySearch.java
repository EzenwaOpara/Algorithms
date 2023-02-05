package lib;

public class BinarySearch {

    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }

    public static int rank(int key, int[] a, int lo, int hi) {
        // Index of key in a[], if present, is not smaller than lo and not larger than hi.
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) return rank(key, a, lo, mid - 1);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi);
        else return mid;
    }


//    public static int rank(int key, int[] a) { // Array must be sorted.
//        int lo = 0;
//        int hi = a.length - 1;
//        while (lo <= hi) { // Key is in a[lo..hi] or not present.
//            int mid = lo + (hi - lo) / 2;
//            if (key < a[mid]) hi = mid - 1;
//            else if (key > a[mid]) lo = mid + 1;
//            else return mid;
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        int[] whitelist = In.readInts(args[0]);
//        Arrays.sort(whitelist);
//        while (!StdIn.isEmpty()) { // Read key, print if not in whitelist.
//            int key = StdIn.readInt();
//            if (rank(key, whitelist) < 0)
//                StdOut.println(key);
//        }
//    }
}
