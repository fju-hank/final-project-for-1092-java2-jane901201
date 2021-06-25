package com.fju.unitTest;

import com.fju.gui.GameOverMenu;
import com.fju.gui.IUIInterface;
import com.fju.gui.PlayMenu;
import com.fju.gui.UIStateController;

import javax.swing.*;

public class GameOverMenuTest {
    public static void main(String[] args) {
        IUIInterface gameOverMenu = new GameOverMenu();
        UIStateController uiStateController = new UIStateController();

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();

                uiStateController.setJFrame(frame);
                gameOverMenu.setUIStateController(uiStateController);

                frame.setContentPane(gameOverMenu.getUIPanel());
                frame.setSize(300,500);
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//設定關閉可以關掉程式
            }
        });

    }
}
