import utils.ArrayUtils;

public class QuickSortLomuto {
    public static void sort(int[] values) { sort(values, 0, values.length - 1); }

    private static void sort(int[] values, int left, int right) {
        if (left >= right) return;
        int pivot = values[right], boundary = left;
        for (int index = left; index < right; index++) {
            if (values[index] <= pivot) ArrayUtils.swap(values, boundary++, index);
        }
        ArrayUtils.swap(values, boundary, right);
        sort(values, left, boundary - 1);
        sort(values, boundary + 1, right);
    }

    public static void main(String[] args) {
        int[] values = { 4, 2, 7, 3, 1 };
        sort(values); System.out.println(java.util.Arrays.toString(values));
    }
}
