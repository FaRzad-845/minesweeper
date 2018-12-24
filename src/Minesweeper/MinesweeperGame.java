package Minesweeper;

import Listeners.ButtonClickedActionListener;
import Listeners.ButtonClickedMouseListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JLabel;

public class MinesweeperGame extends JFrame {

    public JLabel timer;
    private final String filePath = "YOURPATH\\Setting.Properties";
    private final File file = new File(filePath);
    private JPanel panel1;
    private JPanel panel2;
    private JButton[][] btn;
    private int counter = 1;
    private ButtonClickedActionListener btnClick;
    private ButtonClickedMouseListener rightBtnClick;
    private Boolean isFirstTime = true;

    private final int[][] gameBoard = new int[loginPage.width][loginPage.length];
    private final Boolean[][] isBtnClicked = new Boolean[loginPage.width][loginPage.length];
    private final Boolean[][] isBtnFlageedAsBomb = new Boolean[loginPage.width][loginPage.length];

    public void main(MinesweeperGame mGame, int status) {
        btnClick = new ButtonClickedActionListener(mGame);
        rightBtnClick = new ButtonClickedMouseListener(mGame);
        fillWithDefaults();
        initializeUI(mGame);
        if (status != 0) {
            isFirstTime = false;
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
                Path myPath = Paths.get(filePath);
                String[] strArray = Files.lines(myPath)
                        .map(s -> s.split("@"))
                        .findFirst()
                        .get();
                for (int i = 0; i < strArray.length; i++) {
                    String[] eachBtn = strArray[i].split(",", 0);
                    for (int j = 0; j < eachBtn.length; j++) {
                        int x = Integer.valueOf(eachBtn[j].split("\\*")[0]);
                        String y = eachBtn[j].split("\\*")[1];
                        FillBoardWithLastSavedPlace(i, j, x, y);
                    }
                }

                for (int i = 0; i < strArray.length; i++) {
                    String[] eachBtn = strArray[i].split(",", 0);
                    for (int j = 0; j < eachBtn.length; j++) {
                        int x = Integer.valueOf(eachBtn[j].split("\\*")[0]);
                        String y = eachBtn[j].split("\\*")[1];
                        FillBoardWithLastSaved(i, j, x, y);

                    }
                }
            } catch (IOException e) {
            }
        }

        mainLayout();
        showin();
        ShowTime(mGame);
    }

    private void ShowTime(MinesweeperGame mGame) {
        Timer timer = new Timer();
        TimerTask task = new TimerHelper(mGame);
        timer.schedule(task, 0, 1000);
    }

    private void mainLayout() {
        setLayout(new FlowLayout());
        setTitle("Minesweeper");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                writeUserStatusToFile();
            }

            private void writeUserStatusToFile() {
                try {
                    if (!file.exists()) {
                        file.createNewFile();
                    } else {
                        clearTheFile();
                    }
                    try (FileWriter writer = new FileWriter(filePath, true)) {
                        for (int i = 0; i < loginPage.width; i++) {
                            for (int j = 0; j < loginPage.length; j++) {
                                if (isBtnClicked[i][j]) {
                                    writer.write(String.valueOf(gameBoard[i][j]) + "*ISCLICKED,");
                                } else if (isBtnFlageedAsBomb[i][j]) {
                                    writer.write(String.valueOf(gameBoard[i][j]) + "*ISFLAGED,");
                                } else {
                                    writer.write(String.valueOf(gameBoard[i][j]) + "*NOTCLICKED,");
                                }
                            }
                            writer.write("@");
                        }
                        //writer.write("#" + TimerHelper.currentSecond);
                        writer.write("\n");
                    }
                } catch (IOException err) {
                }
            }
        });

    }

    private void initializeUI(MinesweeperGame mGame) {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        JPanel mainPanel = new JPanel();
        panel1 = new JPanel(new GridLayout(1, loginPage.width));
        panel2 = new JPanel();

        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        //BoxLayout g1 = new BoxLayout(panel1, BoxLayout.X_AXIS);
        //panel1.setLayout(g1);
        timer = new JLabel();
        timer.setAlignmentX(Component.LEFT_ALIGNMENT);
        timer.setHorizontalAlignment(JLabel.LEFT);

        JButton newGame = new JButton();
        newGame.setPreferredSize(new Dimension(25, 25));
        newGame.addActionListener(btnClick);
        newGame.setName("newGame");
        newGame.setAlignmentX(Component.RIGHT_ALIGNMENT);
        newGame.setIcon(new javax.swing.ImageIcon("C:\\Users\\heram\\Desktop\\c1a5a82fc3651bea2858481f0974d86e.jpg"));

        panel1.add(timer);
        panel1.add(newGame);
        //panel1.add(Box.createRigidArea(new Dimension((loginPage.width - 1) * 15 - 80, 50)));

        GridLayout g2 = new GridLayout(loginPage.width + 1, loginPage.length);
        panel2.setLayout(g2);

        btn = new JButton[loginPage.width][loginPage.length];

        for (int i = 0; i < loginPage.width; i++) {
            for (int j = 0; j < loginPage.length; j++) {
                btn[i][j] = new JButton();
                btn[i][j].setPreferredSize(new Dimension(25, 25));
                btn[i][j].setBorder(new LineBorder(Color.BLACK));
                btn[i][j].setBorderPainted(true);
                btn[i][j].addActionListener((ActionListener) btnClick);
                btn[i][j].addMouseListener(rightBtnClick);
                btn[i][j].setName(i + "@" + j);
                panel2.add(btn[i][j]);

            }
        }
        mainPanel.add(panel1);
        mainPanel.add(panel2);
        setContentPane(mainPanel);

        pack();

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        setVisible(true);
    }

    private Boolean isMine(int i, int j) {
        return gameBoard[i][j] == -1;
    }

    public Boolean Win() {
        return (counter == (loginPage.width * loginPage.length) - loginPage.MineNumber);
    }

    public void clickedBtn(int i, int j) {
        if (isFirstTime) {
            isFirstTime = false;
            gameBoard[i][j] = -2;
            for (int k = -1; k <= 1; k++) {
                for (int l = -1; l <= 1; l++) {
                    try {
                        gameBoard[i + k][j + l] = -2;
                    } catch (Exception e) {
                    }
                }
            }
            placingMines();
        }
        if (!isBtnClicked[i][j] && !isBtnFlageedAsBomb[i][j]) {
            isBtnClicked[i][j] = true;

            if (isMine(i, j) && !isFirstTime) {
                for (int a = 0; a < loginPage.width; a++) {
                    for (int b = 0; b < loginPage.length; b++) {
                        if (gameBoard[a][b] == -1) {
                            btn[a][b].setBackground(Color.RED);
                        }
                    }

                }
                WinOrLoose loose = new WinOrLoose();
                loose.main("Suprise You Loose");
                this.setVisible(false);
                this.dispose();
                clearTheFile();
            } else if (gameBoard[i][j] != 0) {
                if (Win()) {
                    WinOrLoose win = new WinOrLoose();
                    win.main("Suprise You win");
                    this.setVisible(false);
                    this.dispose();
                    clearTheFile();

//                    try {
//                        Database.Data.send("mehdi", TimerHelper.getCurrentSecond());
//                    } catch (SQLException ex) {
//                        Logger.getLogger(MinesweeperGame.class.getName()).log(Level.SEVERE, null, ex);
//                    }
                }
                btn[i][j].setText(String.valueOf(gameBoard[i][j]));
                btn[i][j].setBackground(Color.WHITE);
            } else {
                counter++;
                btn[i][j].setBackground(Color.BLUE);

                for (int k = -1; k <= 1; k++) {
                    for (int l = -1; l <= 1; l++) {
                        try {
                            clickedBtn(i + k, j + l);
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                }
            }
        }

    }

    public void rightClickedBtn(int i, int j) {
        if (!isBtnFlageedAsBomb[i][j]) {
            btn[i][j].setBackground(Color.GREEN);
            isBtnFlageedAsBomb[i][j] = true;
        } else {
            btn[i][j].setBackground(Color.ORANGE);
            isBtnFlageedAsBomb[i][j] = false;
        }

    }

    private void fillWithDefaults() {
        for (int i = 0; i < loginPage.width; i++) {
            for (int j = 0; j < loginPage.length; j++) {
                gameBoard[i][j] = 0;
                isBtnClicked[i][j] = false;
                isBtnFlageedAsBomb[i][j] = false;
            }
        }

    }

    private void placingMines() {
        Random rand = new Random();
        int first_rand, second_rand;
        int mines_number = 0;
        while (mines_number < loginPage.MineNumber) {
            first_rand = rand.nextInt(loginPage.width);
            second_rand = rand.nextInt(loginPage.length);
            if (gameBoard[first_rand][second_rand] != -1 && gameBoard[first_rand][second_rand] != -2) {
                gameBoard[first_rand][second_rand] = -1;
                mines_number++;
            }
        }
        for (int i = 0; i < loginPage.width; i++) {
            for (int j = 0; j < loginPage.length; j++) {
                if (gameBoard[i][j] == -2) {
                    gameBoard[i][j] = 0;
                }
            }
        }
        Neighbour();

    }

    private void nthNeighbour(int i, int j) {
        try {
            if (!isMine(i, j)) {
                gameBoard[i][j] += 1;

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void Neighbour() {
        for (int i = 0; i < loginPage.width; i++) {
            for (int j = 0; j < loginPage.length; j++) {
                if (isMine(i, j)) {
                    //----------------- 1th Neighbour (South) -----------------
                    nthNeighbour(i + 1, j);
                    //----------------- 2th Neighbour (South-East) ------------
                    nthNeighbour(i + 1, j + 1);
                    //----------------- 3th Neighbour (South-West) ------------
                    nthNeighbour(i + 1, j - 1);
                    //----------------- 4th Neighbour (North) -----------------
                    nthNeighbour(i - 1, j);
                    //----------------- 5th Neighbour (North-East) ------------
                    nthNeighbour(i - 1, j + 1);
                    //----------------- 6th Neighbour (North-West) ------------
                    nthNeighbour(i - 1, j - 1);
                    //----------------- 7th Neighbour (East) ------------------
                    nthNeighbour(i, j + 1);
                    //----------------- 8th Neighbour (West) ------------------
                    nthNeighbour(i, j - 1);
                }
            }
        }
    }

    private void FillBoardWithLastSavedPlace(int index, int index1, int x, String y) {
        gameBoard[index][index1] = x;

    }

    private void FillBoardWithLastSaved(int index, int index1, int x, String y) {
        switch (y) {
            case "ISCLICKED":
                clickedBtn(index, index1);
                break;
            case "ISFLAGED":
                rightClickedBtn(index, index1);
                break;
            default:
                break;

        }
    }

    private void showin() {
        for (int i = 0; i < loginPage.width; i++) {
            for (int j = 0; j < loginPage.length; j++) {
                System.out.print(gameBoard[i][j]);
            }
            System.out.println("");
        }
    }

    private void clearTheFile() {
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.print("");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MinesweeperGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
