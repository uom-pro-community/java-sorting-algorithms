public class CountingSort {
    public static void sort(int[] values) {
        if (values.length == 0) return;
        int minimum = values[0], maximum = values[0];
        for (int value : values) { minimum = Math.min(minimum, value); maximum = Math.max(maximum, value); }
        int[] counts = new int[maximum - minimum + 1];
        for (int value : values) counts[value - minimum]++;
        int output = 0;
        for (int index = 0; index < counts.length; index++) {
            while (counts[index]-- > 0) values[output++] = index + minimum;
        }
    }

    public static void main(String[] args) {
        int[] values = { 4, -1, 2, 4, 0, -1 };
        sort(values); System.out.println(java.util.Arrays.toString(values));
    }
}
