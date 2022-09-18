package kz.ibr.homeworks.lesson16.tests.units;

import kz.ibr.homeworks.lesson16.game.*;
import kz.ibr.homeworks.lesson16.resources.Assertions;
import kz.ibr.homeworks.lesson16.tests.units.tools.DiceImplFake;
import kz.ibr.homeworks.lesson16.tests.units.tools.GameWinnerConsolePrinterSpy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;
import org.testng.annotations.Test;

@RunWith(MockitoJUnitRunner.class)
public class GameTest {

//    @Mock
//    Dice mockedDiceImpl;
//    @Mock
//    GameWinnerPrinter mockedWinnerPrinter;

    //TODO: Почему то не получилось использовать аннотацию и пришлось определить Captor в ручную, разобраться почему.
//    @Captor
//    ArgumentCaptor argCaptor;

    Player player1 = new Player("player1");
    Player player2 = new Player("player2");

    @Test
    public void player1WonTest(){
        Dice mockedDiceImpl = Mockito.mock(DiceImpl.class);
        GameWinnerPrinter mockedWinnerPrinter = Mockito.mock(GameWinnerConsolePrinter.class);

        Mockito.when(mockedDiceImpl.roll()).thenReturn(1, 2);
        ArgumentCaptor<Player> arg = ArgumentCaptor.forClass(Player.class);

        Game game = new Game(mockedDiceImpl, mockedWinnerPrinter);
        game.playGame(player1, player2);

        Mockito.verify(mockedDiceImpl).roll();
        Mockito.verify(mockedWinnerPrinter).printWinner(arg.capture());

        //Scenario: "Тест ПЕРВЫЙ игрок получил число больше";
        System.out.println("Captor res" + arg.getValue());
        Assert.assertEquals(player1, arg.getValue());
    }

    @Test
    public void player2WonTest(){
        DiceImplFake diceImpl = new DiceImplFake(2);
        GameWinnerConsolePrinterSpy printer = new GameWinnerConsolePrinterSpy();
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");
        startGame(diceImpl, printer, player1, player2);
        //Scenario: "Тест ВТОРОЙ игрок получил число больше";
        Assertions.assertEquals(player2, printer.getWinner());
    }

    @Test
    public void friendshipWonTest(){
        DiceImplFake diceImpl = new DiceImplFake(3);
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
