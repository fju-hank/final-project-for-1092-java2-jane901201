package com.fju.unitTest;

import com.fju.game.GameLoop;
import com.fju.gui.IUIInterface;
import com.fju.gui.PlayMenu;

import javax.swing.*;

public class GameLoopTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        IUIInterface iuiInterface = new PlayMenu();
        GameLoop gameLoop = new GameLoop();
        frame.setContentPane(iuiInterface.getUIPanel());
        frame.setVisible(true);

    }
}
