public class QuickSort {
    public static void sort(int[] values) {
        sort(values, 0, values.length - 1);
    }

    private static void sort(int[] values, int left, int right) {
        if (left >= right) return;
        int pivot = values[left + (right - left) / 2];
        int first = left, last = right;
        while (first <= last) {
            while (values[first] < pivot) first++;
            while (values[last] > pivot) last--;
            if (first <= last) {
                int temporary = values[first]; values[first++] = values[last]; values[last--] = temporary;
            }
        }
        sort(values, left, last);
        sort(values, first, right);
    }

    public static void main(String[] args) {
        int[] values = { 10, 7, 8, 9, 1, 5 };
        sort(values);
        System.out.println(java.util.Arrays.toString(values));
    }
}
