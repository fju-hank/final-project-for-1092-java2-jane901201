package com.fju.unitTest;

import com.fju.gui.PlayMenu;

import javax.swing.*;

public class PlayMenuTest {

    JFrame frame = new JFrame();

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        PlayMenu playMenu = new PlayMenu();
        frame.setContentPane(new PlayMenu().getUIPanel());
        frame.setSize(300,500);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//設定關閉可以關掉程式

    }
}
