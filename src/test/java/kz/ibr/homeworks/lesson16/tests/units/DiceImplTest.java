package kz.ibr.homeworks.lesson16.tests.units;

import kz.ibr.homeworks.lesson16.game.Dice;
import kz.ibr.homeworks.lesson16.game.DiceImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DiceImplTest {

    @Before
    public void testBefore(){
        System.out.println("Before annotation method called!");
    }

    @Test
    public void testDiceInRange(){
        Dice diceImpl = new DiceImpl();
        //Scenario: "Тест на проверку полученного значения в рамках 1 - 6";
        for (int i = 0; i < 100; i++){
            int rollValue = diceImpl.roll();
            Assert.assertTrue(rollValue > 0 && rollValue < 7);
            System.out.println("Test called!");
        }
    }

    @After
    public void testAfter(){
        System.out.println("After annotation method called!");
    }
}
