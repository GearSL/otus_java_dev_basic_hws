package kz.ibr.homeworks.lesson16.tests.units;

import kz.ibr.homeworks.lesson16.game.*;
import kz.ibr.homeworks.lesson16.resources.Assertions;
import kz.ibr.homeworks.lesson16.tests.units.tools.DiceImplFake;
import kz.ibr.homeworks.lesson16.tests.units.tools.GameWinnerConsolePrinterSpy;
import org.testng.annotations.Test;


public class GameTest {

    @Test
    public void player1WonTest(){
        DiceImplFake diceImpl = new DiceImplFake();
        diceImpl.setWinningCall(1);
        GameWinnerConsolePrinterSpy printer = new GameWinnerConsolePrinterSpy();
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");
        startGame(diceImpl, printer, player1, player2);
        //Scenario: "Тест ПЕРВЫЙ игрок получил число больше";
        Assertions.assertEquals(player1, printer.getWinner());
    }

    @Test
    public void player2WonTest(){
        DiceImplFake diceImpl = new DiceImplFake();
        diceImpl.setWinningCall(2);
        GameWinnerConsolePrinterSpy printer = new GameWinnerConsolePrinterSpy();
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");
        startGame(diceImpl, printer, player1, player2);
        //Scenario: "Тест ВТОРОЙ игрок получил число больше";
        Assertions.assertEquals(player2, printer.getWinner());
    }

    @Test
    public void friendshipWonTest(){
        DiceImplFake diceImpl = new DiceImplFake();
        diceImpl.setWinningCall(3);
        GameWinnerConsolePrinterSpy printer = new GameWinnerConsolePrinterSpy();
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");
        startGame(diceImpl, printer, player1, player2);
        //Scenario: "Тест ОБА игрока получили равные числа";
        Assertions.assertEquals(null, printer.getWinner());
    }

    private void startGame(Dice diceImpl, GameWinnerPrinter printer, Player player1, Player player2) {
        Game game = new Game(diceImpl, printer);
        game.playGame(player1, player2);
    }
}
