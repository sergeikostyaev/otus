package otus;


import java.util.Scanner;

public class HomeworkJavaSyntaxTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] testInfo = {
                {"Сколько планет в солнечной системе?", "1 - 10", "2 - 15", "3 - 9", "4 - 8", "3"},
                {"Как звали отца Александра Сергеевича Пушкина?", "1 - Денис", "2 - Петр", "3 - Александр", "4 - Сергей", "4"},
                {"Какого цвета Солнце?", "1 - Синее", "2 - Желтое", "3 - Зеленое", "4 - Фиолетовое", "2"}};

        int right = 0;
        int mist = 0;

        for (int i = 0; i < testInfo.length; i++) {
            for (int j = 0; j < testInfo[i].length - 1; j++) {
                System.out.println(testInfo[i][j]);
            }
            System.out.println();
            String res;
            do {
                System.out.println("Введите вариант ответа от 1 до 4");
                 res = sc.nextLine();
            }while(Integer.parseInt(res) < 1 || Integer.parseInt(res) > 4);
            if (res.equals(testInfo[i][5])) {
                System.out.println("Правильно");
                right++;
            } else {
                System.out.println("Неправильно");
                mist++;
            }
            System.out.println();
        }
        System.out.printf("Результат: правильно %d, неправильно %d%n", right, mist);


    }
}
