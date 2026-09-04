import utils.ArrayUtils;

public class QuickSortHoare {
    public static void sort(int[] values) { sort(values, 0, values.length - 1); }

    private static void sort(int[] values, int left, int right) {
        if (left >= right) return;
        int first = left - 1, last = right + 1;
        int pivot = values[left + (right - left) / 2];
        while (true) {
            do { first++; } while (values[first] < pivot);
            do { last--; } while (values[last] > pivot);
            if (first >= last) break;
            ArrayUtils.swap(values, first, last);
        }
        sort(values, left, last);
        sort(values, last + 1, right);
    }

    public static void main(String[] args) {
        int[] values = { 4, 2, 7, 3, 1 };
        sort(values); System.out.println(java.util.Arrays.toString(values));
    }
}
