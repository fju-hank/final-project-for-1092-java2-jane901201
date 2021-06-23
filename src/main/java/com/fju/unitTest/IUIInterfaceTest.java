package com.fju.unitTest;

import com.fju.gui.IUIInterface;
import com.fju.gui.InternetMenu;
import com.fju.gui.MainMenu;
import com.fju.gui.PlayMenu;

import javax.swing.*;

public class IUIInterfaceTest {
    public static void main(String[] args) {

        //IUIInterface iuiInterface = new MainMenu();
        //IUIInterface iuiInterface = new InternetMenu();
        IUIInterface iuiInterface = new PlayMenu();
        JFrame frame = new JFrame();

        frame.setContentPane(iuiInterface.getUIPanel());
        frame.setSize(300,500);
        frame.setVisible(true);


    }
}
