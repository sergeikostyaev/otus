package otus;


import java.util.Scanner;

public class HomeWorkTestOOP {
    private static final String[] questions = {"Сколько планет в солнечной системе?",
            "Как звали отца Александра Сергеевича Пушкина?",
            "Какого цвета Солнце?"};
    private static final String[][] answers = {{"1 - 10", "2 - 15", "3 - 9"},
            {"1 - Денис", "2 - Петр", "3 - Александр", "4 - Сергей"},
            {"1 - Синее", "2 - Желтое", "3 - Зеленое", "4 - Фиолетовое", "5 - Черное"}};
    private static final int[] keys = {3, 4, 2};

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            Test.runTest(questions,answers,keys,sc);
        }
    }
}

class Test {
    private static final int[] resList = {0, 0};
    public static void runTest(String[] questions, String[][] answers, int[] keys, Scanner sc){
        for (int i = 0; i < questions.length; i++) {
            TestBlock.createTestBlock(questions[i], answers[i],keys[i],sc,resList);
        }
        System.out.printf("Результат: правльно %d, неправильно %d",resList[1],resList[0]);
    }
}

class TestBlock {

    public static void createTestBlock(String question, String[] answers, int key, Scanner sc, int[] resList) {
        int a = 0;
        System.out.println(question);
        for (String s : answers) {
            System.out.println(s);
        }
        do {
            a = Tools.intGetter(sc, "Введите ответ в диапазоне от 1 до " + answers.length);
        } while (a < 1 || a > answers.length);
        if (a == key) {
            resList[1]++;
            System.out.println("Ответ верный");
            System.out.println();
        } else {
            resList[0]++;
            System.out.println("Ответ неверный");
            System.out.println();
        }
    }
}
class Tools {
    public static int intGetter(Scanner sc, String question) {
        int res = 0;
        System.out.println(question);
        do {
            if (sc.hasNextInt()) {
                res = sc.nextInt();
                break;
            } else {
                System.out.println("Введите число");
                sc.next();
            }
        } while (sc.hasNext());
        return res;
    }
}