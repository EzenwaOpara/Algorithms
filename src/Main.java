import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private int[] elements;
    public static void main(String[] args) {}
    public int computeDifference(){
        int max = 0;
        int abs = 0;
        for (int i=0;i<elements.length;i++){
            for (int j=0;j< elements.length;j++){
                int a = elements[i] - elements[j];
                abs = Math.abs(a);
                if (abs>max) max = abs;
            }
        }
        return max;
    }
}