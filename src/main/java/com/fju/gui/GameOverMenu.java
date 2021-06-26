package com.fju.gui;

import com.fju.data.IDataInterface;

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
    }

    @Override
    public void uiUpdate() {
        totalQuestionLabel.setText("總回答題數:"
                + intSwitchtoString(m_Data.getTotolQuestion()));
        correctLabel.setText("對的題數"
                + intSwitchtoString(m_Data.getCorrectCount()));
        incorrectLabel.setText("錯的題數"
                + intSwitchtoString(m_Data.getIncorrectCount()));
        timeLabel.setText("總花費時間"
                + intSwitchtoString(m_Data.getTotalTime()));

    }

    @Override
    public JPanel getUIPanel() {
        return gameOverPanel;
    }

    @Override
    public void setM_Data(IDataInterface m_Data) {
        this.m_Data = m_Data;

    }

    public String intSwitchtoString(int n) {
       return Integer.toString(n);
    }
}
