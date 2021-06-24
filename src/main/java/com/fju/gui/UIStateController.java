package com.fju.gui;

import javax.swing.*;

public class UIStateController {
    private IUIInterface m_UI;


    public UIStateController() {};

    public void setUI(IUIInterface ui, JFrame frame) {
        frame.setContentPane(ui.getUIPanel());
    }

}
