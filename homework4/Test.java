package otus.homework4;

import java.util.ArrayList;

public class Test {
    private final ArrayList<TestBlock> al;

    public Test(ArrayList<TestBlock> al) {
        this.al = al;
    }

    private int correct = 0;
    private int incorrect = 0;

    public void runTest() {
        for (TestBlock testBlock : al) {
            int res = testBlock.createTestBlock() ? correct++ : incorrect++;
        }
        System.out.printf("Результат: правльно %d, неправильно %d", correct, incorrect);
    }
}
