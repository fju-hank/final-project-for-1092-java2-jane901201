package com.fju.gui;

import javax.swing.*;

public class PlayMenu {
    private JPanel playMenuPanel;
    private JButton answer1;
    private JButton answer2;
    private JButton answer3;
    private JButton answer4;
    private JLabel question;
    private JLabel topic;
    private JLabel time;

    public JPanel getPlayMenuPanel() {
        return playMenuPanel;
    }

    public void setPlayMenuPanel(JPanel playMenuPanel) {
        this.playMenuPanel = playMenuPanel;
    }
}
