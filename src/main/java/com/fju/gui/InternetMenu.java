package com.fju.gui;

import com.fju.data.DataInternet;
import com.fju.data.IDataInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InternetMenu extends IUIInterface {
    private JPanel internetMenuPanel;
    private JButton mainMenuButton;
    private JButton internetButton;
    private JPanel testScrollPanel;
    private JButton[] buttons;
    private IDataInterface data = new DataInternet();

    public InternetMenu() {
        uiInital();
    }

    @Override
    public void uiInital() {
        buttons = new JButton[20];
        testScrollPanel.setLayout(new GridLayout(0, 1));
        mainMenuButton.addActionListener(e -> uiStateController.setUI(new MainMenu()));
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            buttons[i].setText(Integer.toString(i));
            buttons[i].setContentAreaFilled(false);
            buttons[i].addActionListener(e ->
                    System.out.println("OME"));
            testScrollPanel.add(buttons[i]);//, 3 + i
        }


//        internetButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                try {
//
//                    Runtime.getRuntime().exec("cmd /c start https://www.itread01.com/p/274982.html");
//                } catch (Exception ex) {
//                    System.out.println("error");
//                    ex.printStackTrace();
//                }
//            }
//        });
    }

    @Override
    public void uiUpdate() {

    }

    @Override
    public JPanel getUIPanel() {
        return internetMenuPanel;
    }

    private void setInternetButton() {

    }

    @Override
    public void setM_Data(IDataInterface m_Data) {

    }


}
