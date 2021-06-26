package com.fju.gui;

import javax.swing.*;

public class UIStateController {



    private PlayMenu m_UI;

    private JFrame frame; //mainMenu不這樣寫會出問題，因為別的IUIInterface不會有frame的設定

    public void setJFrame(JFrame frame) {
        this.frame = frame;
    }


    public UIStateController() {}

    public void setUI(IUIInterface ui) {
            frame.setContentPane(ui.getUIPanel());
            frame.setVisible(false);
            frame.setVisible(true);
    }

    public void releaseUI(JFrame frame) {
        frame.dispose(); //測驗
    }



}
