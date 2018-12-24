package Minesweeper;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Minesweeper extends JFrame {

    public static void main(String[] args) {
        loginPage login_page = new loginPage();
       Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        login_page.setLocation(dim.width / 2 - login_page.getSize().width / 2, dim.height / 2 - login_page.getSize().height / 2);
        login_page.setVisible(true);
    }
}
