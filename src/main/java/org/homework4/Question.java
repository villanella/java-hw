package org.homework4;

public class Question {
    private int number;
    private String text;


    public Question(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public void print_question() {
//        System.out.println(text);
          System.out.printf(
                  "Вопрос %s. %s\n",
                  number, text);
    }

//    public void check_answer(int answerIndex) {
//        return answerIndex.CorrectAnswer;
//    }
}