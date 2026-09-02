public class MergeSort {
    public static void sort(int[] values) {
        sort(values, new int[values.length], 0, values.length - 1);
    }

    private static void sort(int[] values, int[] buffer, int left, int right) {
        if (left >= right) return;
        int middle = left + (right - left) / 2;
        sort(values, buffer, left, middle);
        sort(values, buffer, middle + 1, right);
        merge(values, buffer, left, middle, right);
    }

    private static void merge(int[] values, int[] buffer, int left, int middle, int right) {
        for (int index = left; index <= right; index++) buffer[index] = values[index];
        int first = left, second = middle + 1;
        for (int index = left; index <= right; index++) {
            if (first > middle) values[index] = buffer[second++];
            else if (second > right) values[index] = buffer[first++];
            else if (buffer[first] <= buffer[second]) values[index] = buffer[first++];
            else values[index] = buffer[second++];
        }
    }

    public static void main(String[] args) {
        int[] values = { 38, 27, 43, 3, 9, 82, 10 };
        sort(values);
        System.out.println(java.util.Arrays.toString(values));
    }
}
