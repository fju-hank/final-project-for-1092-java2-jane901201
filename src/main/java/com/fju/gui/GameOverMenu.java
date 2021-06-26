package com.fju.gui;

import javax.swing.*;

public class GameOverMenu extends IUIInterface {
    private JButton mainMenuButton;
    private JPanel gameOverPanel;
    private JLabel totalQuestionLabel;
    private JLabel timeLabel;
    private JLabel gameOverLabel;
    private JLabel correctLabel;
    private JLabel incorrectLabel;

    public GameOverMenu() {
        uiInital();
    }

    @Override
    public void uiInital() {
        mainMenuButton.addActionListener(e -> uiStateController.setUI(new MainMenu()));

        totalQuestionLabel.setText("總題數3提");
        timeLabel.setText("60秒");
        correctLabel.setText("100");
        incorrectLabel.setText("80");
    }

    @Override
    public void uiUpdate() {

    }

    @Override
    public JPanel getUIPanel() {
        return gameOverPanel;
    }
}
