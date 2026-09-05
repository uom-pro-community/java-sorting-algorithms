import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public static void sort(double[] values) {
        List<List<Double>> buckets = new ArrayList<>();
        for (int index = 0; index < values.length; index++) buckets.add(new ArrayList<>());
        for (double value : values) {
            if (value < 0 || value >= 1) throw new IllegalArgumentException("Values must be in [0, 1)");
            buckets.get((int) (value * values.length)).add(value);
        }
        int output = 0;
        for (List<Double> bucket : buckets) {
            Collections.sort(bucket);
            for (double value : bucket) values[output++] = value;
        }
    }

    public static void main(String[] args) {
        double[] values = { 0.42, 0.32, 0.23, 0.52, 0.25, 0.47, 0.51 };
        sort(values); System.out.println(java.util.Arrays.toString(values));
    }
}
