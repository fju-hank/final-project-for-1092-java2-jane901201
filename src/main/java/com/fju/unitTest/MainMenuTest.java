package com.fju.unitTest;

import com.fju.gui.IUIInterface;
import com.fju.gui.MainMenu;
import com.fju.gui.UIStateController;

import javax.swing.*;

public class MainMenuTest {
    public static void main(String[] args) {
        IUIInterface mainMenu = new MainMenu();
        UIStateController uiStateController = new UIStateController();

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();

            uiStateController.setJFrame(frame);

            frame.setContentPane(mainMenu.getUIPanel());
            frame.setSize(300,500);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//設定關閉可以關掉程式
        });

    }
}
