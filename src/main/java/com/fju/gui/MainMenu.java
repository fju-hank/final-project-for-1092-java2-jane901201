package com.fju.gui;

import javax.swing.*;

public class MainMenu extends IUIInterface{
    private JPanel mainMenuPanel;
    private JButton internet;
    private JButton qAButton = new JButton();
    private JButton gameButton;



    @Override
    public JPanel getUIPanel() {
        return mainMenuPanel;
    }
}
