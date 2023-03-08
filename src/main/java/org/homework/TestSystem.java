package org.homework;

import java.util.Scanner;

public class TestSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] correctAnswers = {3, 2, 1};
        String[] questions = new String[]{
                "Что не является компилятором Java?\n1. Javac\n2. JIT\n3. JIM",
                "Что не является инструментом сборки?\n1. Maven\n2. Apache\n3. Gradle",
                "Во что компилируется java-код?\n1. *.class\n2. *.object\n3. *.method"
        };
        int result = 0;
        for (int i = 0; i < questions.length; i++) {
            String question = questions[i];
            System.out.println(question);
            try {
                int answer = sc.nextInt();
                if (answer == correctAnswers[i]) {
                    System.out.println("Верно.\n");
                    result += 1;
                } else {
                    System.out.println("Неверно.\n");
                }
            } catch (Exception e) {
                System.out.println("Пожалуйста, введите ответ цифрой.\n");
                sc.next();
                i -= 1;
            }
        }
        System.out.println("Всего правильных ответов: " + result + " из " + questions.length + ".");
    }
}
