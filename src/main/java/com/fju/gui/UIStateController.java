package com.fju.gui;

import javax.swing.*;

public class UIStateController {

    private JFrame frame; //mainMenu不這樣寫會出問題，因為別的IUIInterface不會有frame的設定

    public void setJFrame(JFrame frame) {
        this.frame = frame;
    }


    public UIStateController() {}

    public void setUI(IUIInterface ui) {
        frame.setContentPane(ui.getUIPanel());
        frame.setVisible(false);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void releaseUI(JFrame frame) {
        frame.dispose(); //測驗
    }



}
