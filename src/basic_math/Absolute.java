package basic_math;

public class Absolute {

    public static double abs(double x) {
        if (x < 0.0) return -x;
        else return x;
    }

    public static int abs(int x) {
        if (x < 0) return -x;
        else return x;
    }

    public static void main(String[] args) {
        int abs = Absolute.abs(-1);
        System.out.println(abs);
    }
}
