package kz.ibr.homeworks.lesson8;

import kz.ibr.homeworks.lesson8.answer.AnswerOption;
import kz.ibr.homeworks.lesson8.question.Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ДЗ "Система тестирования".
 */
public class TestSystem {
    public static void main(String[] args) {

        int correctCount = 0, wrongCount = 0;
        List<Question> questions = new ArrayList<>();
        List<Integer> answers = new ArrayList<>();

        Question question = new Question("Вопрос 1: правильный ответ 1");
        question.setAnswerOption("Вариант ответа 1 для вопроса 1", true);
        question.setAnswerOption("Вариант ответа 2 для вопроса 1", false);
        question.setAnswerOption("Вариант ответа 3 для вопроса 1", false);
        questions.add(question);

        question = new Question("Вопрос 2: правильный ответ 2");
        question.setAnswerOption("Вариант ответа 1 для вопроса 2", false);
        question.setAnswerOption("Вариант ответа 2 для вопроса 2", true);
        question.setAnswerOption("Вариант ответа 3 для вопроса 2", false);
        questions.add(question);

        question = new Question("Вопрос 3: правильный ответ 3");
        question.setAnswerOption("Вариант ответа 1 для вопроса 3", false);
        question.setAnswerOption("Вариант ответа 2 для вопроса 3", false);
        question.setAnswerOption("Вариант ответа 3 для вопроса 3", true);
        questions.add(question);

        Scanner scanner = new Scanner(System.in);
        for (Question value : questions) {
            System.out.println(value.getQuestionText());
            for (AnswerOption answerOption : value.getAnswerOptions()){
                System.out.println(answerOption.getAnswer());
            }
            System.out.print("Ваш ответ: ");
            int answer = scanner.nextInt();
            // Считываем с консоли ответ пользователя.
            // Проверяем ответ увеличиваем счетчики и выводим результат.
            if (value.checkAnswer(answer)) {
                correctCount++;
            } else {
                wrongCount++;
            }
            answers.add(answer);
        }

        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
        System.out.println("Ваши ответы:" + answers);
    }
}
