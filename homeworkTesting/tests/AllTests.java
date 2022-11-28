package otus.homeworkTesting.tests;

import otus.homeworkTesting.tests.unit.DiceImplTest;
import otus.homeworkTesting.tests.unit.GameTest;

import java.io.IOException;

public class AllTests {
    public static void main(String[] args) throws IOException {

        new DiceImplTest().lowValuesTest();
        new DiceImplTest().highValuesTest();
        new GameTest().drawTest();
        new GameTest().firstPlayerWins();
        new GameTest().secondPlayerWins();

    }
}
