package otus;


import java.util.Scanner;

public class HomeworkJavaSyntaxTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0;

        final String[] questions = {"Сколько планет в солнечной системе?",
                "Как звали отца Александра Сергеевича Пушкина?",
                "Какого цвета Солнце?"};
        final String[][] answers = {{"1 - 10", "2 - 15", "3 - 9"},
                {"1 - Денис", "2 - Петр", "3 - Александр", "4 - Сергей"},
                {"1 - Синее", "2 - Желтое", "3 - Зеленое", "4 - Фиолетовое", "5 - Черное"}}; // работа с массивами стала легче
        final int[] keys = {3, 4, 2};

        int right = 0;
        int mist = 0;


        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String s : answers[i]) {
                System.out.println(s);
            }
            do {
                if (sc.hasNextInt()) { // нет необходимости переводить строку в int
                    res = sc.nextInt();
                    if (res > 0 && res <= answers[i].length) break;
                    System.out.printf("Введите вариант ответа от 1 до %d\n", answers[i].length);
                } else {
                    System.out.printf("Введите вариант ответа от 1 до %d\n", answers[i].length);
                    sc.next();
                }
            } while (sc.hasNext()); // условие стало меньше

            if (res == keys[i] - 1) {
                right++;
            } else {
                mist++;
            }

        }
        System.out.printf("Результат: правильно %d, неправильно %d%n", right, mist);
    }
}
