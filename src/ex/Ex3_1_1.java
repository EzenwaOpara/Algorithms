package ex;

public class Ex3_1_1<Key extends Comparable<Key>, Value> {

    private Key keys[];
    private Value value[];
    private int N;

    Ex3_1_1(int cap) {
        keys = (Key[]) new Comparable[cap];
        value = (Value[]) new Object[cap];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public Value get(Key key) {
        if (isEmpty()) return null;
        int i = rank(key);
        if (i < N && keys[i].compareTo(key) == 0) return value[i];
        else return null;
    }

    private int rank(Key key) {
        int lo = 0, hi = N - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int cmp = keys[mid].compareTo(key);
            if (cmp < 0) hi = mid - 1;
            else if (cmp > 0) lo = mid + 1;
            else return mid;
        }
        return lo;
    }

    public void put(Key key, Value val) {
        int i = rank(key);
        if (i < N && keys[i].compareTo(key) == 0) {
            value[i] = val;
            return;
        }
        for (int j = N; j > i; j--) {
            keys[j] = keys[j - 1];
            value[j] = value[j - 1];
        }
        keys[i] = key;
        value[i] = val;
        N++;
    }

    public static void main(String[] args) {
        Ex3_1_1<String, Double> gradeToScore = new Ex3_1_1<>(11);
        initGradeSystem(gradeToScore);
        String[] grades = {"A", "A+", "B+", "B-", "A+", "A-"};
        Double totalPoints = 0.0;
        for (int i = 0; i < grades.length; i++) {
            totalPoints += gradeToScore.get(grades[i]);
        }
        System.out.printf("CGPA: %.2f", totalPoints /grades.length );
    }

    private static void initGradeSystem(Ex3_1_1<String, Double> gradeToScore) {
        gradeToScore.put("A+", 4.33);
        gradeToScore.put("A", 4.0);
        gradeToScore.put("A-", 3.67);
        gradeToScore.put("B+", 3.33);
        gradeToScore.put("B", 3.00);
        gradeToScore.put("B-", 2.67);
        gradeToScore.put("C+", 2.33);
        gradeToScore.put("C", 2.00);
        gradeToScore.put("C-", 1.67);
        gradeToScore.put("D", 1.00);
        gradeToScore.put("F", 0.00);
    }
}
