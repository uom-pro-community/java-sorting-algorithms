public class TimeComplexityExamples {
    public static long linearWork(int size) {
        long total = 0;
        for (int index = 0; index < size; index++) total += index;
        return total;
    }

    public static long quadraticWork(int size) {
        long total = 0;
        for (int first = 0; first < size; first++) {
            for (int second = 0; second < size; second++) total += first + second;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("linear(10) = " + linearWork(10));
        System.out.println("quadratic(10) = " + quadraticWork(10));
    }
}
