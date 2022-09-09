package kz.ibr.homeworks.lesson16.game;

public class Game {

    private final Dice dice;
    private final GameWinnerPrinter winnerPrinter;

    public Game(Dice dice, GameWinnerPrinter winnerPrinter) {
        this.dice = dice;
        this.winnerPrinter = winnerPrinter;
    }

    public void playGame(Player player1, Player player2) {
        int player1Result = dice.roll();
        int player2Result = dice.roll();

        //Ошибка, т.к. у нас могут выпасть равные значения для обоих игроков, поэтому переписал данный блок
        //Player winner = (player1Result > player2Result)? player1: player2;
        //Чтобы было более читабельно и не пришлось как в прошлой вызывать принтер printWinner(null) добавил новый метод
        //printDraw() для вывода ничьей
        if(player1Result > player2Result){
            winnerPrinter.printWinner(player1);
        } else if (player1Result < player2Result){
            winnerPrinter.printWinner(player2);
        } else {
            winnerPrinter.printDraw();
        }
    }
}
