import java.util.Arrays;

public class SortingIntroduction {
    public static void main(String[] args) {
        int[] values = { 7, 2, 9, 1, 5 };
        System.out.println("Before: " + Arrays.toString(values));
        Arrays.sort(values);
        System.out.println("After:  " + Arrays.toString(values));
    }
}
