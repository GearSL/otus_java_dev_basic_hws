package kz.ibr.homeworks.lesson16.tests.units.diceImpl;

import kz.ibr.homeworks.lesson16.game.Dice;
import kz.ibr.homeworks.lesson16.game.DiceImpl;
import kz.ibr.homeworks.lesson16.resources.Assertions;
import org.testng.annotations.Test;

public class DiceImplTest {

    @Test
    public void testDiceInRange(){
        Dice diceImpl = new DiceImpl();
        //Scenario: "Тест на проверку полученного значения в рамках 1 - 6";
        for (int i = 0; i < 100; i++){
            int rollValue = diceImpl.roll();
            Assertions.assertEquals(true, rollValue > 0 && rollValue < 7);
        }
    }
}
