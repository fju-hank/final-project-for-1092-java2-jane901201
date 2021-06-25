package com.fju.unitTest;

import com.fju.gui.GameOverMenu;
import com.fju.gui.IUIInterface;

import javax.swing.*;

public class GameOverMenuTest {
    public static void main(String[] args) {
        IUIInterface gameOverMenu = new GameOverMenu();

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();


                frame.setContentPane(gameOverMenu.getUIPanel());
                frame.setSize(300,500);
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//設定關閉可以關掉程式
            }
        });

    }
}
