package org.homework12.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IntegerToWord {
    private static Map<Integer, String> currencyRubMap = new HashMap<>();

    static {
        currencyRubMap.put(1, " рубль");
        currencyRubMap.put(2, " рубля");
        currencyRubMap.put(3, " рубля");
        currencyRubMap.put(4, " рубля");
        currencyRubMap.put(5, " рублей");
        currencyRubMap.put(6, " рублей");
        currencyRubMap.put(7, " рублей");
        currencyRubMap.put(8, " рублей");
        currencyRubMap.put(9, " рублей");
        currencyRubMap.put(0, " рублей");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        InputReader inputReader;

        if (args.length > 0) {
            String filename = args[0];
            inputReader = new FileInputReader(filename);
        } else {
            inputReader = new ConsoleInputReader(scanner);
        }

        int number = inputReader.readInput("Enter an integer: ");
        System.out.println(convertToWord(number));

        scanner.close();
    }
    public static String convertToWord(int number) {
        int lastDigit = number % 10;
        String currency = currencyRubMap.get(lastDigit);
        return number + currency;
    }

}