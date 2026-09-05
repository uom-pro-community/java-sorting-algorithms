import utils.ArrayUtils;

public class HeapSort {
    public static void sort(int[] values) {
        for (int root = values.length / 2 - 1; root >= 0; root--) siftDown(values, root, values.length);
        for (int end = values.length - 1; end > 0; end--) {
            ArrayUtils.swap(values, 0, end);
            siftDown(values, 0, end);
        }
    }

    private static void siftDown(int[] values, int root, int size) {
        while (2 * root + 1 < size) {
            int child = 2 * root + 1;
            if (child + 1 < size && values[child + 1] > values[child]) child++;
            if (values[root] >= values[child]) return;
            ArrayUtils.swap(values, root, child);
            root = child;
        }
    }

    public static void main(String[] args) {
        int[] values = { 12, 11, 13, 5, 6, 7 };
        sort(values); System.out.println(java.util.Arrays.toString(values));
    }
}
