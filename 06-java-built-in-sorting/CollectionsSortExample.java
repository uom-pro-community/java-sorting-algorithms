import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortExample {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>(List.of(5, 1, 4, 2, 8));
        Collections.sort(values);
        System.out.println(values);
    }
}
