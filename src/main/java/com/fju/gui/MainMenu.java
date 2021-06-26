package com.fju.gui;

import com.fju.data.IDataInterface;

import javax.swing.*;

public class MainMenu extends IUIInterface {
    private JPanel mainMenuPanel;
    private JButton gameButton;
    private JButton qAButton;
    private JButton internetButton;
    private JLabel connectTestLabel;
    private JButton exitButton;


    public MainMenu() {
        uiInital();
    }

    @Override
    public void uiInital() {
        gameButton.addActionListener(e -> switchUI(new PlayMenu()));
        //按鈕聆聽功能
        qAButton.addActionListener(e -> switchUI(new QAStoreMenu()));
        internetButton.addActionListener(e -> switchUI(new InternetMenu()));
        exitButton.addActionListener(e -> System.exit(0));
    }

    @Override
    public void uiUpdate() {
        connectTestLabel.setText(connectTest);
    }

    private void switchUI(IUIInterface ui) {
        uiStateController.setUI(ui);
        //this.uiRelease();
    }

    @Override
    public JPanel getUIPanel() {



        return mainMenuPanel;
    }

    @Override
    public void setM_Data(IDataInterface m_Data) {

    }
}
