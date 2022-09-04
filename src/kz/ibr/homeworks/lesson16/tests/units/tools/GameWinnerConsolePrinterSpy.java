package kz.ibr.homeworks.lesson16.tests.units.tools;

import kz.ibr.homeworks.lesson16.game.GameWinnerPrinter;
import kz.ibr.homeworks.lesson16.game.Player;

import java.util.Objects;

public class GameWinnerConsolePrinterSpy implements GameWinnerPrinter {

    Player winner;
    @Override
    public void printWinner(Player winner) {
        this.winner = winner;
    }

    public String getWinnerName() {
        if(Objects.isNull(this.winner)){
            return "friendship";
        }
        return winner.getName();
    }
}
