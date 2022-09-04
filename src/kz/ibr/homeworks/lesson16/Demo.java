package kz.ibr.homeworks.lesson16;

import kz.ibr.homeworks.lesson16.game.*;

import java.util.Random;

public class Demo {

    public static void main(String[] args) {
        Random random = new Random();
        Dice dice = new DiceImpl(random);

        GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
        Game game = new Game(dice, winnerPrinter);
        game.playGame(new Player("Вася"), new Player("Игорь"));
    }
}
