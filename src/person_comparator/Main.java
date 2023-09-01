package person_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static int personCompare() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 20));
        people.add(new Person("Charlie", 10));

        Collections.sort(people, new PersonComparator());
        System.out.println("Sorted List: " + people);

        return -1;
    }
}

record Person(String name, int age) {

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

class PersonComparator implements Comparator<Main> {
    @Override
    public int compare(Main a, Main b) {
        return a.getName().compareTo(b.getName());
    }
}
