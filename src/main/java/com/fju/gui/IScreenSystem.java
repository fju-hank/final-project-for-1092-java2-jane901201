package com.fju.gui;

import javax.swing.*;

/*
視窗所需要的元件
 */

public class IScreenSystem {

    JFrame frame;
    IUIInterface ui;

    public IScreenSystem() {
        inital();

    }

    private void inital() {
        ui = new MainMenu();
        frame = ui.getFrame();
        frame.setContentPane(ui.getUIPanel());
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//設定關閉可以關掉程式
    }

    public void update() {

    }

    public IUIInterface getUI() {
        return ui;
    }

}
