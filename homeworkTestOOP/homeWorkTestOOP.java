package otus.homeworkTestOOP;


import java.util.ArrayList;

public class homeWorkTestOOP {
    private static final String[] questions = {"Сколько планет в солнечной системе?",
            "Как звали отца Александра Сергеевича Пушкина?",
            "Какого цвета Солнце?"};
    private static final String[][] answers = {{"1 - 10", "2 - 15", "3 - 9"},
            {"1 - Денис", "2 - Петр", "3 - Александр", "4 - Сергей"},
            {"1 - Синее", "2 - Желтое", "3 - Зеленое", "4 - Фиолетовое", "5 - Черное"}};
    private static final int[] keys = {3, 4, 2};

    public static void main(String[] args) {
        ArrayList<TestBlock> al = new ArrayList<>();
        for (int i = 0; i < questions.length; i++) {
            al.add(new TestBlock(questions[i],answers[i],keys[i]));
        }
        Test t = new Test(al);
        t.runTest();
    }
}


