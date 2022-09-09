package kz.ibr.homeworks.lesson16.game;

import java.util.Random;
public class DiceImpl implements Dice {

    @Override
    public int roll() {
        // https://docs.oracle.com/javase/8/docs/api/java/util/Random.html

        //Ошибка, не был указан предел рандома, по условиям бросаются кости 1 - 6
        //return new Random().nextInt();
        return new Random().nextInt(6) + 1;
    }
}
