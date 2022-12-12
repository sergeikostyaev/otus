package otus.homeworkTesting.tests.unit.fakes;

import otus.homeworkTesting.game.Player;
import otus.homeworkTesting.game.GameWinnerPrinter;


public class GameWinnerPrinterSpy implements GameWinnerPrinter {

    private String winnerName = "";

    public void printWinner(Player winner) {
        winnerName = winner.getName();
    }

    public String getWinnerName() {
        return winnerName;
    }
}
