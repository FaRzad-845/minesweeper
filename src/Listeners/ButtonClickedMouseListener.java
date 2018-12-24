package Listeners;

import Minesweeper.MinesweeperGame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

public class ButtonClickedMouseListener implements MouseListener {

    MinesweeperGame mGame;

    public ButtonClickedMouseListener(MinesweeperGame mGame) {
        this.mGame = mGame;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (SwingUtilities.isRightMouseButton(e)) {
            Object o = e.getSource();
            JButton clickedBtn = (JButton) o;
            String name = clickedBtn.getName();
            String[] position = name.split("@", 2);
            int i = Integer.parseInt(position[0]);
            int j = Integer.parseInt(position[1]);
            mGame.rightClickedBtn(i, j);
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
