import lib.StdOut;

public class Main {

    public static void main(String[] args) {
        String benjamin = mystery("BENJAMIN");
        System.out.println(benjamin);


    }

    public static String mystery(String s) {
        int N = s.length();
        if (N <= 1) return s;
        String a = s.substring(0, N / 2);
        String b = s.substring(N / 2, N);
        return mystery(b) + mystery(a);
    }
}