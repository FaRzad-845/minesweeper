package Minesweeper;

import java.awt.Color;
import jaco.mp3.player.MP3Player;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;

public class loginPage extends javax.swing.JFrame {

    public static boolean beginner;
    public static boolean intermdiate;
    public static boolean expert;
    public static boolean custom;
    public static int length;
    public static int width;
    public static int MineNumber;
    private final String filePath = "C:\\Users\\heram\\Documents\\NetBeansProjects\\JframeCalculater\\src\\Minesweeper\\Setting.Properties";

    public static boolean isBeginner() {
        return beginner;
    }

    public static boolean isIntermdiate() {
        return intermdiate;
    }

    public static boolean isExpert() {
        return expert;
    }

    public static boolean isCustom() {
        return custom;
    }

    public static int getLength() {
        return length;
    }

    public static int getwidth() {
        return width;
    }

    public static int getMineNumber() {
        return MineNumber;
    }

    public static void setBeginner(boolean beginner) {
        loginPage.beginner = beginner;
    }

    public static void setIntermdiate(boolean intermdiate) {
        loginPage.intermdiate = intermdiate;
    }

    public static void setCustom(boolean custom) {
        loginPage.custom = custom;
    }

    public static void setLength(int length) {
        loginPage.length = length;
    }

    public static void setWidth(int width) {
        loginPage.width = width;
    }

    public static void setMineNumber(int MineNumber) {
        loginPage.MineNumber = MineNumber;
    }

    public static void setExpert(boolean expert) {
        loginPage.expert = expert;
    }

    public static final String SONG = "C:\\Users\\heram\\Downloads\\Music\\01 Afterburner.mp3";
    MP3Player mp3player = new MP3Player(new File(SONG));
    private boolean IS_PLAYING;

    public loginPage() {
        initComponents();
        mp3player.play();
        IS_PLAYING = true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_fullname = new javax.swing.JTextField();
        button1 = new java.awt.Button();
        jPanel3 = new javax.swing.JPanel();
        txt_fullname1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(471, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        buttonGroup1.add(jRadioButton3);
        buttonGroup1.add(jRadioButton4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(32, 33, 35));
        jLabel3.setForeground(new java.awt.Color(32, 33, 35));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\heram\\Desktop\\c1a5a82fc3651bea2858481f0974d86e.jpg")); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 760, 440));

        jPanel5.setBackground(new java.awt.Color(32, 33, 35));
        jPanel5.setPreferredSize(new java.awt.Dimension(1250, 440));

        jLabel1.setForeground(new java.awt.Color(57, 113, 177));
        jLabel1.setText("name");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));

        txt_fullname.setBackground(new java.awt.Color(32, 33, 35));
        txt_fullname.setForeground(new java.awt.Color(187, 187, 240));
        txt_fullname.setBorder(null);
        txt_fullname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_fullnameMouseClicked(evt);
            }
        });
        txt_fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fullnameActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(126, 87, 194));
        button1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        button1.setLabel("start");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        txt_fullname1.setBackground(new java.awt.Color(32, 33, 35));
        txt_fullname1.setForeground(new java.awt.Color(187, 187, 240));
        txt_fullname1.setBorder(null);
        txt_fullname1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_fullname1MouseClicked(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setForeground(new java.awt.Color(57, 113, 177));
        jLabel2.setText("student NO.");

        jRadioButton1.setBackground(new java.awt.Color(32, 33, 35));
        jRadioButton1.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(183, 183, 183));
        jRadioButton1.setText("Beginner");
        jRadioButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(32, 33, 35));
        jRadioButton2.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(183, 183, 183));
        jRadioButton2.setText("Intermediate");
        jRadioButton2.setBorder(null);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setBackground(new java.awt.Color(32, 33, 35));
        jRadioButton3.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(183, 183, 183));
        jRadioButton3.setText("Expert");
        jRadioButton3.setBorder(null);
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setBackground(new java.awt.Color(32, 33, 35));
        jRadioButton4.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(183, 183, 183));
        jRadioButton4.setText("Custom");
        jRadioButton4.setBorder(null);
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\heram\\Desktop\\qq2\\kisspng-mouse-mats-logo-brand-symbol-sound-flame-speaker-picture-book-5ae587ffa3a6c1.9673462015249919996703.jpg")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(72, 159, 120));
        jLabel4.setText("Height");

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(72, 159, 120));
        jLabel5.setText("Width");

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(72, 159, 120));
        jLabel6.setText("Mines");

        jLabel7.setFont(new java.awt.Font("Dutch801 Rm BT", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(183, 183, 183));
        jLabel7.setText("9");

        jLabel8.setFont(new java.awt.Font("Dutch801 Rm BT", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(183, 183, 183));
        jLabel8.setText("16");

        jLabel9.setFont(new java.awt.Font("Dutch801 Rm BT", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(183, 183, 183));
        jLabel9.setText("20");

        jLabel10.setFont(new java.awt.Font("Dutch801 Rm BT", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(183, 183, 183));
        jLabel10.setText("9");

        jLabel11.setFont(new java.awt.Font("Dutch801 Rm BT", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(183, 183, 183));
        jLabel11.setText("16");

        jLabel12.setFont(new java.awt.Font("Dutch801 Rm BT", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(183, 183, 183));
        jLabel12.setText("20");

        jLabel13.setFont(new java.awt.Font("Dutch801 Rm BT", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(183, 183, 183));
        jLabel13.setText("10");

        jLabel14.setFont(new java.awt.Font("Dutch801 Rm BT", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(183, 183, 183));
        jLabel14.setText("40");

        jLabel15.setFont(new java.awt.Font("Dutch801 Rm BT", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(183, 183, 183));
        jLabel15.setText("99");

        jTextField4.setBackground(new java.awt.Color(160, 160, 160));
        jTextField4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 0, 0));
        jTextField4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setBackground(new java.awt.Color(160, 160, 160));
        jTextField5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 0, 0));
        jTextField5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(160, 160, 160));
        jTextField2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(644, 644, 644)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(txt_fullname1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(txt_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton2)
                                            .addComponent(jRadioButton3)
                                            .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRadioButton4))
                                        .addGap(74, 74, 74)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(56, 56, 56)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)))
                            .addComponent(jLabel5))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel6))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel15)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(128, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_fullname1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel13)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 1250, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        int status = 0;
        String name = txt_fullname.getName();
        //mp3player.pause();

        //if the last item selected set the value from that
        if (buttonGroup1.getSelection().equals(jRadioButton4.getModel())) {
            setLength(Integer.parseInt(jTextField2.getText()));
            setWidth(Integer.parseInt(jTextField4.getText()));
            setMineNumber(Integer.parseInt(jTextField5.getText()));
        }

        File f = new File(filePath);
        if (f.exists() && !f.isDirectory() && f.length() != 0) {
            checkNewGameOrLoad game = new checkNewGameOrLoad();
            game.main();
        } else {
            MinesweeperGame game = new MinesweeperGame();
            game.main(game, 0);
        }


    }//GEN-LAST:event_button1ActionPerformed

    private void txt_fullname1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_fullname1MouseClicked

        jLabel2.setForeground(new Color(240, 240, 240));
        jLabel1.setForeground(new Color(57, 113, 177));
    }//GEN-LAST:event_txt_fullname1MouseClicked

    // no need *FARZAD*
    private void txt_fullnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_fullnameMouseClicked

        jLabel1.setForeground(new Color(240, 240, 240));
        jLabel2.setForeground(new Color(57, 113, 177));
    }//GEN-LAST:event_txt_fullnameMouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

        jTextField2.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        setLength(9);
        setWidth(9);
        setMineNumber(10);
        jLabel7.setForeground(new java.awt.Color(190, 43, 43));
        jLabel10.setForeground(new java.awt.Color(190, 43, 43));
        jLabel13.setForeground(new java.awt.Color(190, 43, 43));
        jLabel8.setForeground(new java.awt.Color(183, 183, 183));
        jLabel11.setForeground(new java.awt.Color(183, 183, 183));
        jLabel14.setForeground(new java.awt.Color(183, 183, 183));
        jLabel9.setForeground(new java.awt.Color(183, 183, 183));
        jLabel12.setForeground(new java.awt.Color(183, 183, 183));
        jLabel15.setForeground(new java.awt.Color(183, 183, 183));
        jTextField2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jTextField4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jTextField5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (IS_PLAYING) {
            jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\heram\\Desktop\\qq2\\kisspng-mouse-mats-logo-brand-symbol-sound-flame-speaker-picture-book-5ae587ffa3a6c1.967346201524991999670.jpg"));
            mp3player.pause();
            IS_PLAYING = false;
        } else {
            jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\heram\\Desktop\\qq2\\kisspng-mouse-mats-logo-brand-symbol-sound-flame-speaker-picture-book-5ae587ffa3a6c1.9673462015249919996703.jpg"));
            mp3player.play();
            IS_PLAYING = true;
        }

        // new MP3Player(new File("C:\\Users\\heram\\Downloads\\Music\\01 Afterburner.mp3")).play();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed

        jTextField2.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        setLength(16);
        setWidth(16);
        setMineNumber(40);
        jLabel8.setForeground(new java.awt.Color(190, 43, 43));
        jLabel11.setForeground(new java.awt.Color(190, 43, 43));
        jLabel14.setForeground(new java.awt.Color(190, 43, 43));
        jLabel9.setForeground(new java.awt.Color(183, 183, 183));
        jLabel12.setForeground(new java.awt.Color(183, 183, 183));
        jLabel15.setForeground(new java.awt.Color(183, 183, 183));
        jLabel7.setForeground(new java.awt.Color(183, 183, 183));
        jLabel10.setForeground(new java.awt.Color(183, 183, 183));
        jLabel13.setForeground(new java.awt.Color(183, 183, 183));// TODO add your handling code here:
        jTextField2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jTextField4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jTextField5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed

        jTextField2.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        setLength(20);
        setWidth(20);
        setMineNumber(99);
        jLabel9.setForeground(new java.awt.Color(190, 43, 43));
        jLabel12.setForeground(new java.awt.Color(190, 43, 43));
        jLabel15.setForeground(new java.awt.Color(190, 43, 43));
        jLabel7.setForeground(new java.awt.Color(183, 183, 183));
        jLabel10.setForeground(new java.awt.Color(183, 183, 183));
        jLabel13.setForeground(new java.awt.Color(183, 183, 183));
        jLabel8.setForeground(new java.awt.Color(183, 183, 183));
        jLabel11.setForeground(new java.awt.Color(183, 183, 183));
        jLabel14.setForeground(new java.awt.Color(183, 183, 183));// TODO add your handling code here:
        jTextField2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jTextField4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jTextField5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        setWidth(Integer.parseInt(jTextField4.getText()));         // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

        setLength(Integer.parseInt(jTextField2.getText()));
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed

        jTextField2.setEditable(true);
        jTextField4.setEditable(true);
        jTextField5.setEditable(true);

        jTextField2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 51, 51), new java.awt.Color(255, 51, 51)));
        jTextField4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 51, 51), new java.awt.Color(255, 51, 51)));
        jTextField5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 51, 51), new java.awt.Color(255, 51, 51)));// TODO add your handling code here:
        jLabel8.setForeground(new java.awt.Color(183, 183, 183));
        jLabel11.setForeground(new java.awt.Color(183, 183, 183));
        jLabel14.setForeground(new java.awt.Color(183, 183, 183));
        jLabel9.setForeground(new java.awt.Color(183, 183, 183));
        jLabel12.setForeground(new java.awt.Color(183, 183, 183));
        jLabel15.setForeground(new java.awt.Color(183, 183, 183));
        jLabel7.setForeground(new java.awt.Color(183, 183, 183));
        jLabel10.setForeground(new java.awt.Color(183, 183, 183));
        jLabel13.setForeground(new java.awt.Color(183, 183, 183));
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        setMineNumber(Integer.parseInt(jTextField5.getText()));         // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void txt_fullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fullnameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField txt_fullname;
    private javax.swing.JTextField txt_fullname1;
    // End of variables declaration//GEN-END:variables
}
