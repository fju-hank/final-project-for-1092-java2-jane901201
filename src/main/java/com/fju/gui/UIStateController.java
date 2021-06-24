package com.fju.gui;

import javax.swing.*;
import java.awt.*;

public class UIStateController {
    private IUIInterface m_UI;

    private JFrame frame;

    public void setJFrame(JFrame frame) {
        this.frame = frame;
    }

    public UIStateController() {};

    public void setUI(IUIInterface ui) {
        frame.setContentPane(ui.getUIPanel());
        frame.setVisible(false);
        frame.setVisible(true);
    }

}
