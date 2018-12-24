package Listeners;

import Minesweeper.MinesweeperGame;
import com.sun.corba.se.spi.monitoring.MonitoringManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JButton;

public class ButtonClickedActionListener implements ActionListener {
    
    MinesweeperGame mGame;
    
    public ButtonClickedActionListener(MinesweeperGame mGame) {
        this.mGame = mGame;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        JButton clickedBtn = (JButton) o;
        String name = clickedBtn.getName();
        if (name.equals("newGame")) {
            MinesweeperGame newGame = new MinesweeperGame();
            newGame.main(newGame, 0);
            mGame.setVisible(false);
            mGame.dispose();
        } else {
            String[] position = name.split("@", 2);
            int i = Integer.parseInt(position[0]);
            int j = Integer.parseInt(position[1]);
            mGame.clickedBtn(i, j);
        }
    }
    
}
