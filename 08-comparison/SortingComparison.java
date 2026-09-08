import java.util.Arrays;
import utils.ArrayUtils;
import utils.InputGenerator;

public class SortingComparison {
    public static void main(String[] args) {
        int[] original = InputGenerator.randomArray(12, 100, 42L);
        int[] mergeInput = ArrayUtils.copyOf(original);
        int[] javaInput = ArrayUtils.copyOf(original);
        MergeSort.sort(mergeInput);
        Arrays.sort(javaInput);
        System.out.println("Input: " + Arrays.toString(original));
        System.out.println("Merge sort: " + Arrays.toString(mergeInput));
        System.out.println("Arrays.sort: " + Arrays.toString(javaInput));
        System.out.println("Same result: " + Arrays.equals(mergeInput, javaInput));
    }
}
