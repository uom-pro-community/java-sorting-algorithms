import java.util.Arrays;
import utils.InputGenerator;

public class SortingBenchmark {
    public static void main(String[] args) {
        int[] source = InputGenerator.randomArray(10_000, 1_000_000, 7L);
        int[] values = Arrays.copyOf(source, source.length);
        long start = System.nanoTime();
        Arrays.sort(values);
        long elapsed = System.nanoTime() - start;
        System.out.printf("Arrays.sort: %.3f ms, sorted=%s%n", elapsed / 1_000_000.0, isSorted(values));
    }

    private static boolean isSorted(int[] values) {
        for (int index = 1; index < values.length; index++) if (values[index - 1] > values[index]) return false;
        return true;
    }
}
