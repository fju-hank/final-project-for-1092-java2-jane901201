package com.fju.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends IUIInterface {
    private JPanel mainMenuPanel;
    private JButton gameButton;
    private JButton qAButton;
    private JButton internetButton;
    private JLabel connectTestLabel;

    PlayMenu ui;


    public MainMenu() {

        uiInital();
    }

    @Override
    public void uiInital() {

        gameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              switchUI(new PlayMenu());
            }
        });

        qAButton.addActionListener(new ActionListener() { //按鈕聆聽功能
            @Override
            public void actionPerformed(ActionEvent e) {
                switchUI(new QAStoreMenu());
            }
        });

        internetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchUI(new InternetMenu());
            }
        });

    }

    @Override
    public void uiUpdate() {

    }

    private void switchUI(IUIInterface ui) {
        uiStateController.setUI(ui);
    }

    @Override
    public JPanel getUIPanel() {



        return mainMenuPanel;
    }
}
