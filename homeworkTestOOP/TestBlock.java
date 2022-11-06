package otus.homeworkTestOOP;

public class TestBlock {
    private final String question;
    private final String[] answers;
    private final int key;
    TestBlock(String question, String[] answers, int key) {
        this.question = question;
        this.answers = answers;
        this.key = key;
    }
    private final UserInput ui = new IntGetter();
    boolean createTestBlock() {
        int a = 0;
        System.out.println(question);
        for (String s : answers) {
            System.out.println(s);
        }
        do {
            a = ui.read();
        } while (a < 1 || a > answers.length);
        if (a == key) {
            System.out.println("Ответ верный");
            System.out.println();
            return true;
        } else {
            System.out.println("Ответ неверный");
            System.out.println();
            return false;
        }
    }
}
