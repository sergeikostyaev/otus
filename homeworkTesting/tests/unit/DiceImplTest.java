package otus.homeworkTesting.tests.unit;


import otus.homeworkTesting.game.DiceImpl;
import otus.homeworkTesting.Assertions;


public class DiceImplTest {
    public void lowValuesTest() {
        String scenario = "Exceeds the range of values test";
        DiceImpl di = new DiceImpl();
        int lowestValue = 1;
        int temp = 0;

        try {
            for (int i = 0; i < 100; i++) {
                temp = di.roll();
                Assertions.assertEquals((temp >= lowestValue), true);
            }
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%d less than %d\" %n", scenario, temp, lowestValue);
        }
    }

    public void highValuesTest() {
        String scenario = "Below the range of values test";
        DiceImpl di = new DiceImpl();
        int highestValue = 6;
        int temp = 0;

        try {
            for (int i = 0; i < 100; i++) {
                temp = di.roll();
                Assertions.assertEquals((temp <= highestValue), true);
            }
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%d more than %d\" %n", scenario, temp, highestValue);
        }
    }
}