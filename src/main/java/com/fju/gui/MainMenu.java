package com.fju.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends IUIInterface{
    private JPanel mainMenuPanel;
    private JButton internet;
    private JButton qAButton;
    private JButton gameButton;
    private JLabel sqlTest;

    public MainMenu() {
        uiInital();
    }

    @Override
    public void uiInital() {

        qAButton.addActionListener(new ActionListener() { //按鈕聆聽功能
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("qaButton");

            }
        });
    }

    @Override
    public void uiUpdate() {

    }

    @Override
    public JPanel getUIPanel() {



        return mainMenuPanel;
    }
}
