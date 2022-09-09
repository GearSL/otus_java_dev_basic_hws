package kz.ibr.homeworks.lesson16.game;

public class GameWinnerConsolePrinter implements GameWinnerPrinter {
    @Override
    public void printWinner(Player winner) {
        System.out.printf("Победитель: %s%n", winner.getName());

    }

    public void printDraw() {
        System.out.println("Победитель: Дружба!");
    }
}
