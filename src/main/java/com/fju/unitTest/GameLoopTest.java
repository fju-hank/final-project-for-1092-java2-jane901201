package com.fju.unitTest;

import com.fju.game.GameLoop;
import com.fju.game.IGameSystem;
import com.fju.gui.IUIInterface;
import com.fju.gui.PlayMenu;
import com.fju.gui.UIStateController;

import javax.swing.*;

public class GameLoopTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        IUIInterface playMenu = new PlayMenu();
        UIStateController uiStateController = new UIStateController();
        IGameSystem gameSystem = new IGameSystem(uiStateController, playMenu);
        GameLoop gameLoop = new GameLoop(gameSystem, playMenu);
        frame.setContentPane(playMenu.getUIPanel());
        frame.setVisible(true);

    }
}
