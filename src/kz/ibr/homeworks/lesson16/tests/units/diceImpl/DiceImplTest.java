package kz.ibr.homeworks.lesson16.tests.units.diceImpl;

import kz.ibr.homeworks.lesson16.game.Dice;
import kz.ibr.homeworks.lesson16.game.DiceImpl;
import kz.ibr.homeworks.lesson16.resources.Assertions;
import kz.ibr.homeworks.lesson16.tests.units.tools.RandomStub;
import org.testng.annotations.Test;
import java.util.random.RandomGenerator;

public class DiceImplTest {

    @Test
    public void testDiceWithSeed1(){
        RandomGenerator random = new RandomStub(0);
        Dice diceImpl = new DiceImpl(random);
        //Scenario: "Тест получения случайного числа c DiceImpl с RandomStub(0)";
        Assertions.assertEquals(1, diceImpl.roll());
    }
    @Test
    public void testDiceWithSeed2(){
        RandomGenerator random = new RandomStub(1);
        Dice diceImpl = new DiceImpl(random);
        //Scenario: "Тест получения случайного числа c DiceImpl с RandomStub(1)";
        Assertions.assertEquals(2, diceImpl.roll());
    }
}
