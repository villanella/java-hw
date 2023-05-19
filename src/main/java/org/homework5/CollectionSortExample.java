package org.homework5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(7);
        numbers.add(1);
        numbers.add(3);

        System.out.println("Before sorting: " + numbers);

        Collections.sort(numbers);

        System.out.println("After sorting: " + numbers);
    }
}
