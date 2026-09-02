public class InsertionSort {
    public static void sort(int[] values) {
        for (int index = 1; index < values.length; index++) {
            int current = values[index];
            int position = index - 1;
            while (position >= 0 && values[position] > current) {
                values[position + 1] = values[position];
                position--;
            }
            values[position + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] values = { 12, 11, 13, 5, 6 };
        sort(values);
        System.out.println(java.util.Arrays.toString(values));
    }
}
