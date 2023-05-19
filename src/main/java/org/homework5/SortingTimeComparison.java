package org.homework5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static org.homework5.BubbleSortExample.bubbleSort;

public class SortingTimeComparison {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            numbers.add(random.nextInt(1000));
        }

        List<Integer> numbersCopy = new ArrayList<>(numbers);

        // Measure time for bubble sort
        long bubbleSortStartTime = System.currentTimeMillis();
        bubbleSort(numbers);
        long bubbleSortEndTime = System.currentTimeMillis();
        long bubbleSortTime = bubbleSortEndTime - bubbleSortStartTime;

        // Measure time for Collections.sort()
        long collectionsSortStartTime = System.currentTimeMillis();
        Collections.sort(numbersCopy);
        long collectionsSortEndTime = System.currentTimeMillis();
        long collectionsSortTime = collectionsSortEndTime - collectionsSortStartTime;

        System.out.println("Bubble Sort of 1000 numbers Time: " + bubbleSortTime + " ms");
        System.out.println("Collections.sort() of 1000 numbers Time: " + collectionsSortTime + " ms");

    }
}
