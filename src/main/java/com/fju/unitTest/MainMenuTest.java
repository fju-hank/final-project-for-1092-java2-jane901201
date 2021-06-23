package com.fju.unitTest;

import com.fju.gui.MainMenu;

import javax.swing.*;

public class MainMenuTest {
    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
        JFrame frame = new JFrame();

        frame.setContentPane(new MainMenu().getUIPanel());
        frame.setSize(300,500);


        frame.setVisible(true);
    }
}
