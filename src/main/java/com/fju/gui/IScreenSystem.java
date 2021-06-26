package com.fju.gui;

import javax.swing.*;

/*
視窗所需要的元件
 */

public class IScreenSystem {

    JFrame frame;
    UIStateController uiStateController;
    IUIInterface ui;

    public IScreenSystem() {
        inital();

    }

    private void inital() {
        ui = new MainMenu();
        uiStateController = new UIStateController();
        uiStateController.setJFrame(frame);
        ui.setJFrame(frame); //會想辦法改掉
        frame.setContentPane(ui.getUIPanel());
        frame.setSize(300,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//設定關閉可以關掉程式
    }

    public void update() {

    }

    public void releaseFrame() {
        frame.dispose();
    }

}
