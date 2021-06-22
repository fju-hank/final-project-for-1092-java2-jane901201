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
    private JLabel Correct;
    private JLabel incorrect;

    public PlayMenu(JPanel playMenuPanel) {
        this.playMenuPanel = playMenuPanel;
    }

    public PlayMenu() {

    }

    public JButton getAnswer1() {
        return answer1;
    }

    public JPanel getPlayMenuPanel() {
        return playMenuPanel;
    }

    public void setPlayMenuPanel(JPanel playMenuPanel) {
        this.playMenuPanel = playMenuPanel;
    }
}
