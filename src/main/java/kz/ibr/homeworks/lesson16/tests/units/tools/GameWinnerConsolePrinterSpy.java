package kz.ibr.homeworks.lesson16.tests.units.tools;

import kz.ibr.homeworks.lesson16.game.GameWinnerPrinter;
import kz.ibr.homeworks.lesson16.game.Player;

public class GameWinnerConsolePrinterSpy implements GameWinnerPrinter {

    Player winner;
    @Override
    public void printWinner(Player winner) {
        this.winner = winner;
    }

    @Override
    public void printDraw() {
        this.winner = null;
    }

    public Player getWinner() {
        return winner;
    }
}
