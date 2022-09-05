package kz.ibr.homeworks.lesson16.tests.units.tools;

import kz.ibr.homeworks.lesson16.game.Dice;

public class DiceImplFake implements Dice {
    int winningCall;
    int callsCount;


    public DiceImplFake(int winningCall) {
        this.winningCall = winningCall;
    }

    private int countAndReturnDice(){
        this.callsCount ++;
        if(callsCount == winningCall){
            return 2;
        }
        return 1;
    }

    @Override
    public int roll() {
        return countAndReturnDice();
    }
}
