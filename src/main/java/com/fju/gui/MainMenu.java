package com.fju.gui;

import com.fju.data.IDataInterface;

import javax.swing.*;

public class MainMenu extends IUIInterface {
    private JPanel mainMenuPanel;
    private JButton gameButton;
    private JButton qAButton;
    private JButton internetButton;
    private JLabel connectTestLabel;


    public MainMenu() {

        uiInital();
    }

    @Override
    public void uiInital() {

        gameButton.addActionListener(e -> switchUI(new PlayMenu()));

        //按鈕聆聽功能
        qAButton.addActionListener(e -> switchUI(new QAStoreMenu()));

        internetButton.addActionListener(e -> switchUI(new InternetMenu()));

    }

    @Override
    public void uiUpdate() {

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
