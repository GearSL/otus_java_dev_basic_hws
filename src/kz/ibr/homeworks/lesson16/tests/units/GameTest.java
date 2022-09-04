package kz.ibr.homeworks.lesson16.tests.units;

import kz.ibr.homeworks.lesson16.game.*;
import kz.ibr.homeworks.lesson16.resources.Assertions;
import kz.ibr.homeworks.lesson16.tests.units.tools.GameWinnerConsolePrinterSpy;
import kz.ibr.homeworks.lesson16.tests.units.tools.RandomFake;
import org.testng.annotations.Test;

import java.util.random.RandomGenerator;


public class GameTest {

    @Test
    public void player1WonTest(){
        RandomGenerator random = new RandomFake(1);
        GameWinnerConsolePrinterSpy printer = new GameWinnerConsolePrinterSpy();
        startGame(random, printer);
        //Scenario: "Тест оба игрока получили равные числа";
        Assertions.assertEquals("player1", printer.getWinnerName());
    }

    @Test
    public void player2WonTest(){
        RandomGenerator random = new RandomFake(2);
        GameWinnerConsolePrinterSpy printer = new GameWinnerConsolePrinterSpy();
        startGame(random, printer);
        //Scenario: "Тест оба игрока получили равные числа";
        Assertions.assertEquals("player2", printer.getWinnerName());
    }

    @Test
    public void friendshipWonTest(){
        RandomGenerator random = new RandomFake(3);
        GameWinnerConsolePrinterSpy printer = new GameWinnerConsolePrinterSpy();
        startGame(random, printer);
        //Scenario: "Тест оба игрока получили равные числа";
        Assertions.assertEquals("friendship", printer.getWinnerName());
    }

    private void startGame(RandomGenerator random, GameWinnerPrinter printer) {
        Dice diceImpl = new DiceImpl(random);

        Player player1 = new Player("player1");
        Player player2 = new Player("player2");

        Game game = new Game(diceImpl, printer);
        game.playGame(player1, player2);
    }
}
