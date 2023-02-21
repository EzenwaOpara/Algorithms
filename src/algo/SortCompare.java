package algo;

import basic_math.Stopwatch;

public class SortCompare {
    public static double time(String alg, Comparable[] a) {
        Stopwatch timer = new Stopwatch();
        if (alg.equals("Insertion")) Insertion.sort(a);
        if (alg.equals("Selection")) Selection.sort(a);
        if (alg.equals("Shell")) Shell.sort(a);
        if (alg.equals("Merge")) Merge.sort(a);
        if (alg.equals("Quick")) Quick.sort(a);
//        if (alg.equals("Heap")) Heap.sort(a);
        return timer.elapsedTime();
    }

//    public static double timeRandomInput(String alg, int N, int T) { // Use alg to sort T random arrays of length N.
//        double total = 0.0;
//        Integer[] a = new Integer[N];
//        for (int t = 0; t < T; t++) { // Perform one experiment (generate and sort an array).
//            for (int i = 0; i < N; i++)
//                a[i] = StdRandom.uniform(1) + 0.0;
//            total += time(alg, a);
//        }
//        return total;
//    }

    public static void main(String[] args) {
        String alg1 = "Selection";
        String alg2 = "Insertion";
        String alg3 = "Shell";
        String alg4 = "Merge";
        String alg5 = "Quick";
        int N = 20;//array length
        int T = Integer.parseInt("1000");//max random number

        Integer[] a = new Integer[N];
        for (int i = 0; i < N; i++) a[i] = (int) (Math.random() * T);

        Integer[] a1 = new Integer[N];
        Integer[] a2 = new Integer[N];
        Integer[] a3 = new Integer[N];
        Integer[] a4 = new Integer[N];
        Integer[] a5 = new Integer[N];
        for (int i = 0; i < N; i++) {
            a1[i] =  a[i];
            a2[i] = a[i];
            a3[i] = a[i];
            a4[i] = a[i];
            a5[i] = a[i];
        }


        printArray(a3);
        double t3 = time(alg3, a3); // total for alg3
        System.out.println("Shell: " + t3);
        printArray(a3);
        System.out.println();

        printArray(a2);
        double t2 = time(alg2, a2); // total for alg2
        System.out.println("Insertion: " + t2);
        printArray(a2);
        System.out.println();

        printArray(a1);
        double t1 = time(alg1, a1); // total for alg1
        System.out.println("Selection: " + t1);
        printArray(a1);
        System.out.println();

        printArray(a4);
        double t4 = time(alg4, a4); // total for alg4
        System.out.println("Merge: " + t4);
        printArray(a4);
        System.out.println();

        printArray(a5);
        double t5 = time(alg5, a5); // total for alg5
        System.out.println("Quick: " + t5);
        printArray(a5);
    }

    public static void printArray(Comparable[] arr) {
        for (Comparable i : arr) System.out.print(i + " ");
        System.out.println();
    }
}
