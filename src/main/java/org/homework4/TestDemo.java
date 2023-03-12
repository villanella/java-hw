package org.homework4;
import java.util.Scanner;


public class TestDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Question[] questions = {
                new Question(1, "Что не является компилятором Java?"),
                new Question(2, "Что не является инструментом сборки?"),
                new Question(3, "Во что компилируется Java-код?"),
        };

        Answer[][] answers = {
                {new Answer(1, "Javac", false), new Answer(2, "JIT", false), new Answer(3, "JIM", true)},
                {new Answer(1, "Maven", false), new Answer(2, "Apache", true), new Answer(3, "Gradle", false)},
                {new Answer(1, "*.class", true), new Answer(2, "*.object", false), new Answer (3, "*.method", false)}
        };

        Counter correctAnswersSum  = new Counter();

        for (int i = 0; i < questions.length; i++) {
            questions[i].print_question();
            for (int j = 0; j < answers[i].length; j++) {
                answers[i][j].print_answer_variant();
                }

            try {
                int userAnswer = sc.nextInt();
                int userAnswerIndex = userAnswer - 1;
                if (answers[i][userAnswerIndex].check_answer()) {
                    System.out.println("Верно.\n");
                    correctAnswersSum.increaseCount();
                } else {
                    System.out.println("Неверно.\n");
                }
            } catch (Exception e) {
                System.out.println("Пожалуйста, введите ответ цифрой.\n");
                sc.next();
                i -= 1;
            }
        }


        System.out.println("Всего правильных ответов: " + correctAnswersSum.getCount() + " из " + questions.length + ".");
    }
}

