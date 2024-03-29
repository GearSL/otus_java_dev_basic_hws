package kz.ibr.homeworks.lesson6;

import java.util.*;

/**
 * ДЗ "Система тестирования".
 */
public class TestSystem {
    public static void main(String[] args) {

        int correctCount = 0, wrongCount = 0;
        List<Integer> answers = new ArrayList<>();

        Object[][][] testExamples = {
                {
                    {"Вопрос 1: правильный ответ 1", "Вопрос 2: правильный ответ 2", "Вопрос 3: правильный ответ 3"}
                },
                {
                    {"Вариант ответа 1 для вопроса 1","Вариант ответа 2 для вопроса 1","Вариант ответа 3 для вопроса 1"},
                    {"Вариант ответа 1 для вопроса 2","Вариант ответа 2 для вопроса 2","Вариант ответа 3 для вопроса 2"},
                    {"Вариант ответа 1 для вопроса 3","Вариант ответа 2 для вопроса 3","Вариант ответа 3 для вопроса 3"},
                },
                {
                    {1, 2, 3},
                },
        };

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < testExamples[0][0].length; i++) {
            // Вывод вопроса на экран.
            System.out.println(testExamples[0][0][i] + ":");

            // Вывод вариантов ответов на экран.
            for(int j = 0; j < testExamples[1][1].length; j++){
                System.out.println(testExamples[1][i][j] + ";");
            }
            System.out.print("Ваш ответ: ");
            int answer = scanner.nextInt();
            // Считываем с консоли ответ пользователя.
            // Проверяем ответ увеличиваем счетчики и выводим результат.
            if (Objects.equals(testExamples[2][0][i], answer)) {
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