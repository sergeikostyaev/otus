package otus.homeworkTesting.tests.unit;

import otus.homeworkTesting.game.Dice;
import otus.homeworkTesting.game.Game;
import otus.homeworkTesting.game.Player;
import otus.homeworkTesting.Assertions;
import otus.homeworkTesting.game.GameWinnerPrinter;
import otus.homeworkTesting.tests.unit.fakes.DiceSpy;
import otus.homeworkTesting.tests.unit.fakes.GameWinnerPrinterSpy;
import otus.homeworkTesting.tests.unit.fakes.PlayerSpy;

import java.io.IOException;


public class GameTest {
    public void drawTest () throws IOException {
        String scenario = "Draw implementation test";
        int drawScore = 2;
        Dice diceSpy = new DiceSpy(drawScore);
        GameWinnerPrinter gameWinnerPrinterSpy = new GameWinnerPrinterSpy();
        Player firstPlayerSpy = new PlayerSpy("Игорь");
        Player secondPlayerSpy = new PlayerSpy("Вася");
        Game game = new Game(diceSpy, gameWinnerPrinterSpy);
        game.playGame(firstPlayerSpy,secondPlayerSpy);
        try {
            Assertions.assertEquals((!(((GameWinnerPrinterSpy) gameWinnerPrinterSpy).getWinnerName().equals(firstPlayerSpy.getName())) &&
                    !(((GameWinnerPrinterSpy) gameWinnerPrinterSpy).getWinnerName().equals(secondPlayerSpy.getName()))), true);
        }catch (Throwable e){
            System.err.printf("\"%s\" fails with message \"both players score is %d, %s is not a winner\" %n", scenario, drawScore,
                    ((GameWinnerPrinterSpy) gameWinnerPrinterSpy).getWinnerName());
        }
    }
    public void firstPlayerWins(){
        String scenario = "First player wins test";
        int firstPlayerScore = 6;
        int secondPlayerScore = 5;
        Dice diceSpy = new DiceSpy(firstPlayerScore, secondPlayerScore);
        GameWinnerPrinter gameWinnerPrinterSpy = new GameWinnerPrinterSpy();
        Player firstPlayerSpy = new PlayerSpy("Игорь");
        Player secondPlayerSpy = new PlayerSpy("Вася");
        Game game = new Game(diceSpy, gameWinnerPrinterSpy);
        game.playGame(firstPlayerSpy,secondPlayerSpy);

        try{
            Assertions.assertEquals((((GameWinnerPrinterSpy) gameWinnerPrinterSpy).getWinnerName().equals(firstPlayerSpy.getName())), true);
            System.out.printf("%s passed\n", scenario);
        }catch (Throwable e){
            System.err.printf("\"%s\" fails with message \"player %s mush have won\" %n", scenario, firstPlayerSpy.getName(),
                    ((GameWinnerPrinterSpy) gameWinnerPrinterSpy).getWinnerName());
        }
    }

    public void secondPlayerWins(){
        String scenario = "Second player wins test";
        int firstPlayerScore = 5;
        int secondPlayerScore = 5;
        Dice diceSpy = new DiceSpy(firstPlayerScore, secondPlayerScore);
        GameWinnerPrinter gameWinnerPrinterSpy = new GameWinnerPrinterSpy();
        Player firstPlayerSpy = new PlayerSpy("Игорь");
        Player secondPlayerSpy = new PlayerSpy("Вася");
        Game game = new Game(diceSpy, gameWinnerPrinterSpy);
        game.playGame(firstPlayerSpy,secondPlayerSpy);

        try{
            Assertions.assertEquals((((GameWinnerPrinterSpy) gameWinnerPrinterSpy).getWinnerName().equals(secondPlayerSpy.getName())), true);
            System.out.printf("%s passed\n", scenario);
        }catch (Throwable e){
            System.err.printf("\"%s\" fails with message \"player %s mush have won\" %n", scenario, secondPlayerSpy.getName(),
                    ((GameWinnerPrinterSpy) gameWinnerPrinterSpy).getWinnerName());
        }
    }
}
