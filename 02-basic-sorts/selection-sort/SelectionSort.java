import utils.ArrayUtils;

public class SelectionSort {
    public static void sort(int[] values) {
        for (int start = 0; start < values.length - 1; start++) {
            int smallest = start;
            for (int index = start + 1; index < values.length; index++) {
                if (values[index] < values[smallest]) {
                    smallest = index;
                }
            }
            ArrayUtils.swap(values, start, smallest);
        }
    }

    public static void main(String[] args) {
        int[] values = { 64, 25, 12, 22, 11 };
        sort(values);
        System.out.println(java.util.Arrays.toString(values));
    }
}
