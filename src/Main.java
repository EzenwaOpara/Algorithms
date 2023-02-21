import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        Map<Integer, Long> map = new HashMap<>();
        int n = 50;
        long sum = fib(n, map);
        System.out.println("Sum of first " + n + " fib numbers is: " + sum);
    }

    private static long fib(int i, Map<Integer, Long> map) {
        if (map.containsKey(i)) return map.get(i);
        if (i <= 2) return 1;
        map.put(i, fib(i - 1, map) + fib(i - 2, map));
        return map.get(i);
    }
}