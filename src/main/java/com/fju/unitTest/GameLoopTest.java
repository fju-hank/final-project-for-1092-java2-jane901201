package com.fju.unitTest;

import com.fju.game.IGameSystem;
import com.fju.gui.PlayMenu;

import javax.swing.*;

public class GameLoopTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        PlayMenu playMenu = new PlayMenu();
        IGameSystem gameSystem = new IGameSystem(playMenu);
        //GameLoop gameLoop = new GameLoop();
        frame.setContentPane(playMenu.getUIPanel());
        frame.setVisible(true);

    }
}
