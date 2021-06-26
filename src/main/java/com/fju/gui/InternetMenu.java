package com.fju.gui;

import com.fju.data.DataInternet;
import com.fju.data.IDataInterface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InternetMenu extends IUIInterface {
    private JPanel internetMenuPanel;
    private JButton mainMenuButton;
    private JButton internetButton;
    private IDataInterface data = new DataInternet();

    public InternetMenu() {
        uiInital();
    }

    @Override
    public void uiInital() {
        mainMenuButton.addActionListener(e -> uiStateController.setUI(new MainMenu()));
        internetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    Runtime.getRuntime().exec("cmd /c start https://www.itread01.com/p/274982.html");
                } catch (Exception ex) {
                    System.out.println("error");
                    ex.printStackTrace();
                }
            }
        });
    }

    @Override
    public void uiUpdate() {

    }

    @Override
    public JPanel getUIPanel() {
        return internetMenuPanel;
    }

    @Override
    public void getData() {

    }
}
