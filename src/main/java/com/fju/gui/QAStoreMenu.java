package com.fju.gui;

import javax.swing.*;

public class QAStoreMenu extends IUIInterface {
    private JPanel qaStorePanel;
    private JScrollBar scrollBar1;
    private JButton mainMenuButton;

    public QAStoreMenu() {
        uiInital();
    }
    @Override
    public void uiInital() {
        mainMenuButton.addActionListener(e -> uiStateController.setUI(new MainMenu()));
    }

    @Override
    public void uiUpdate() {

    }

    @Override
    public JPanel getUIPanel() {
        return qaStorePanel;
    }

    @Override
    public void getData() {

    }
}
