import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    record Person(String name, int age) { }

    public static void main(String[] args) {
        var people = new java.util.ArrayList<>(List.of(new Person("Mina", 31), new Person("Alex", 24)));
        people.sort(Comparator.comparingInt(Person::age));
        System.out.println(people);
    }
}
