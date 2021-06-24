package com.fju.gui;

import javax.swing.*;

public class PlayMenu extends IUIInterface{
    private JPanel playMenuPanel;
    private JButton answer1Button;
    private JButton answer2Button;
    private JButton answer3Button;
    private JButton answer4Button;
    private JLabel questionLabel;
    private JLabel currectQuestionLabel;
    private JLabel time;
    private JLabel correctLabel;
    private JLabel incorrectLabel;

    public PlayMenu(JPanel playMenuPanel) {
        this.playMenuPanel = playMenuPanel;
    }

    public PlayMenu() {
        uiInital();
    }


    @Override
    public void uiInital() {

    }

    public void uiUpdate() {

    }

    @Override
    public JPanel getUIPanel() {
        return playMenuPanel;
    }


}
