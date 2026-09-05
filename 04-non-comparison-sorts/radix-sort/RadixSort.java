public class RadixSort {
    public static void sort(int[] values) {
        int maximum = 0;
        for (int value : values) if (value < 0) throw new IllegalArgumentException("Only non-negative values are supported"); else maximum = Math.max(maximum, value);
        for (int place = 1; maximum / place > 0; place *= 10) countingPass(values, place);
    }

    private static void countingPass(int[] values, int place) {
        int[] output = new int[values.length], counts = new int[10];
        for (int value : values) counts[(value / place) % 10]++;
        for (int index = 1; index < counts.length; index++) counts[index] += counts[index - 1];
        for (int index = values.length - 1; index >= 0; index--) output[--counts[(values[index] / place) % 10]] = values[index];
        System.arraycopy(output, 0, values, 0, values.length);
    }

    public static void main(String[] args) {
        int[] values = { 170, 45, 75, 90, 802, 24, 2, 66 };
        sort(values); System.out.println(java.util.Arrays.toString(values));
    }
}
