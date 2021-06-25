package com.fju.gui;

import javax.swing.*;

public class IScreenSystem {

    protected JFrame frame;
    protected UIStateController uiStateController;

    public IScreenSystem() {
        frame = new JFrame();
        jFrameInital();
    }

    public void jFrameInital() {
        frame.setSize(300,500);
        uiStateController.setUI(new MainMenu(),frame);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//設定關閉可以關掉程式
    }

}
