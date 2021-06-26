package com.fju.gui;

import com.fju.data.DataInternet;
import com.fju.data.IDataInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class InternetMenu extends IUIInterface {
    private JPanel internetMenuPanel;
    private JButton mainMenuButton;
    private JPanel buttonScrollPanel;
    private JButton[] buttons;



    public InternetMenu() {
        uiInital();
    }

    @Override
    public void uiInital() {
        m_Data = new DataInternet();
        ArrayList<String> url = m_Data.getUrl();
        ArrayList<String> name = m_Data.getInternetName();
        int internetCount = m_Data.getInternetName().size();
        buttons = new JButton[internetCount];
        buttonScrollPanel.setLayout(new GridLayout(0, 1));
        mainMenuButton.addActionListener(e -> uiStateController.setUI(new MainMenu()));
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            buttons[i].setText(name.get(i));
            buttons[i].setContentAreaFilled(false);
            int temi = i;
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        Runtime.getRuntime().exec("cmd /c start " +
                                url.get(temi));
                    } catch (IOException ioException) {
                        System.out.println("Not connect url");
                    }
                }
            });
            buttonScrollPanel.add(buttons[i]);
        }
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
