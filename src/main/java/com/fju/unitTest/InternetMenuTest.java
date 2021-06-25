package com.fju.unitTest;

import com.fju.gui.InternetMenu;

import javax.swing.*;

public class InternetMenuTest {
    public static void main(String[] args) {

        InternetMenu internetMenu = new InternetMenu();

        //SwingUtilities.invokeLater(new Runnable() {
        //public void run() {
        JFrame frame = new JFrame();

        frame.setContentPane(internetMenu.getUIPanel());
        frame.setSize(300,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//設定關閉可以關掉程式
        //}
        //});

    }
}
