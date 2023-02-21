import java.util.*;

public class DP {
    static int count = 0;
    static List<Integer> integers = new ArrayList<>();

    public static void main(String[] args) {
//        Map<Integer, Integer> map = new HashMap<>();
//        int fib = fib(50, map);
//        System.out.println(fib);


//        Map<String, Integer> map = new HashMap<>();
//        int gridTraveller = gridTraveller(18, 18, map);
//        System.out.println(gridTraveller);

//        int[] a = {3, 7, 4, 5};
//        int[] a1 = {2, 3};
//        int[] a2 = {2, 4};
//        int[] a3 = {2, 3, 5};
//        int[] a4 = {7, 14};
//
//        Map<Integer, Boolean> map = new HashMap<>();
//        Map<Integer, Boolean> map1 = new HashMap<>();
//        Map<Integer, Boolean> map2 = new HashMap<>();
//        Map<Integer, Boolean> map3 = new HashMap<>();
//        Map<Integer, Boolean> map4 = new HashMap<>();
//
//        boolean b = canSum(18, a, map);
//        System.out.println(b);
//        boolean b1 = canSum(7, a1, map1);
//        System.out.println(b1);
//        boolean b2 = canSum(7, a2, map2);
//        System.out.println(b2);
//        boolean b3 = canSum(7, a3, map3);
//        System.out.println(b3);
//        boolean b4 = canSum(45000, a4, map4);
//        System.out.println(b4);


//        int[] a = {2, 3};
//        List<Integer> b = new ArrayList<>();
//        int[] howSum = howSum(7, a, b);
//        for (int i = 0; i < howSum.length; i++) System.out.print(howSum[i] + ", ");

    }

    private static int fib(int n, Map<Integer, Integer> map) {
        if (map.containsKey(n)) return map.get(n);
        if (n <= 2) return 1;
        map.put(n, fib(n - 1, map) + fib(n - 2, map));
        return map.get(n);
    }

    private static int gridTraveller(int m, int n, Map<String, Integer> map) {
        String key = m + "," + n;
        if (map.containsKey(key)) return map.get(key);
        if (m == 1 && n == 1) return 1;
        if (m == 0 || n == 0) return 0;
        map.put(key, gridTraveller(m - 1, n, map) + gridTraveller(m, n - 1, map));
        return map.get(key);
    }

    private static boolean canSum(int target, int[] a, Map<Integer, Boolean> map) {
        if (map.containsKey(target)) return map.get(target);
        if (target == 0) return true;
        if (target < 0) return false;
        for (int i = 0; i < a.length; i++) {
            int num = target - a[i];
            if (canSum(num, a, map)) {
                map.put(num, true);
                return map.get(num);
            }
        }
        map.put(target, false);
        return map.get(target);
    }

    public static int[] howSum(int target, int[] a, List<Integer> b) {

        if (target == 0) return new int[1];
        if (target < 0) return null;

        for (int i = 0; i < a.length; i++) {
            int remainder = target - a[i];
            int[] remainderResult = howSum(remainder, a,b);
            if (remainderResult != null) b.add(i);
            if (!b.isEmpty()) {
                int[] c = new int[b.size()];
                for(int j=0;j<b.size();j++) c[j] = b.get(j);
                return c;
            }
        }
        return null;
    }


}