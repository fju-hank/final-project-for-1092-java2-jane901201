package com.fju.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends IUIInterface{
    private JPanel mainMenuPanel;
    private JButton internet;
    private JButton qAButton;
    private JButton gameButton;



    @Override
    public JPanel getUIPanel() {


        qAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("qaButton");

            }
        });

        return mainMenuPanel;
    }
}
