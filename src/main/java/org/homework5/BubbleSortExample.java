package org.homework5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BubbleSortExample {
    public static void bubbleSort(List<Integer> numbers) {
        int n = numbers.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    // Swap numbers[j] and numbers[j+1]
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }
    }
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(7);
        numbers.add(1);
        numbers.add(3);

        System.out.println("Before sorting: " + numbers);

        bubbleSort(numbers);

        System.out.println("After sorting: " + numbers);
    }
}
