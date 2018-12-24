package Minesweeper;

import java.util.TimerTask;

public class TimerHelper extends TimerTask {

    MinesweeperGame mGame;
    private static int currentSecond = 0;

    public TimerHelper(MinesweeperGame mGame) {
        this.mGame = mGame;
    }

    @Override
    public void run() {
        mGame.timer.setText("Timer ran " + ++currentSecond);
    }

    public static int getCurrentSecond() {
        return currentSecond;
    }

    public void setCurrentSecond(int currentSecond) {
        this.currentSecond = currentSecond;
    }
    
}
