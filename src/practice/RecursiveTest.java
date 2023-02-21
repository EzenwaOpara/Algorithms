package practice;

public class RecursiveTest {

    public static long recursiveFactorial(long number) {
        if (number <= 1) return 1;
        else return number * recursiveFactorial(number - 1);
    }

    public static long iterativeFactorial(long number) {
        long factorial = 1;
        for (long i = number; i > 1; i--) factorial *= i;
        return factorial;
    }

    public static int mystery(int a, int b) {
        if (b == 1)
            return a;
        else return a + mystery(a, b - 1);
    }

    public static long power(int base, int exponent) {
        if (exponent == 1) return base;
        else return base * power(base, exponent - 1);
    }

    public static int gcd(int x, int y) {
        if (y == 0) return x;
        else return gcd(y, x % y);
    }

    public static String palindrome(String s, int length) {
        if (length == 1) return String.valueOf(s.charAt(0));
        else return s.charAt(length - 1) + palindrome(s.substring(0, s.length() - 1), s.length() - 1);
    }

    public static boolean palindromeTest(String s) {
        String palindrome = palindrome(s, s.length());
        if (s.equals(palindrome)) return true;
        return false;
    }

    public static void main(String[] args) {

        boolean test = palindromeTest("wewewewe");
        System.out.println("Palindrome: " + test);

//        int mystery = mystery(2, 4);
//        System.out.println(mystery);

//        long power = power(4, 2);
//        System.out.println(power);

//        long gcd = gcd(18, 22);
//        System.out.println(gcd);
//        long N = 30;
//        long recursiveFactorial = recursiveFactorial(N);
//        long start = System.currentTimeMillis();
//        System.out.println("Recursive Factorial: " + recursiveFactorial);
//        long stop = System.currentTimeMillis();
//        System.out.println("Recursive time: " + (stop - start) / 1000.0);
//
//        long start1 = System.currentTimeMillis();
//        long iterativeFactorial = iterativeFactorial(N);
//        long stop1 = System.currentTimeMillis();
//        System.out.println("Iterative Factorial: " + iterativeFactorial);
//        System.out.printf("Iterative time: %.9f\n", (stop1 - start1 + 0.0) / 1000.0);
    }


}
