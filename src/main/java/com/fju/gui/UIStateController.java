package com.fju.gui;

import javax.swing.*;

public class UIStateController {
    public void setUI(IUIInterface ui, JFrame frame) {
        frame.setContentPane(ui.getUIPanel());
        frame.setVisible(false);
        frame.setVisible(true);
    }
}
