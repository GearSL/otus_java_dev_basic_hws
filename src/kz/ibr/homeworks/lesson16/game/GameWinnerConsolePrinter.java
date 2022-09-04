package kz.ibr.homeworks.lesson16.game;

import java.util.Objects;

public class GameWinnerConsolePrinter implements GameWinnerPrinter {
    @Override
    public void printWinner(Player winner) {
        if(Objects.isNull(winner)){
            System.out.println("Победитель: Дружба!");
        } else {
            System.out.printf("Победитель: %s%n", winner.getName());
        }
    }
}
