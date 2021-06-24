package com.fju.unitTest;

import com.fju.gui.IUIInterface;
import com.fju.gui.PlayMenu;
import com.fju.gui.UIStateController;

import javax.swing.*;

public class IUIStateControllerTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        IUIInterface iuiInterface = new PlayMenu();
        UIStateController uiStateController = new UIStateController();
        uiStateController.setJFrame(frame);
        uiStateController.setUI(iuiInterface);
        frame.setContentPane(iuiInterface.getUIPanel());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//設定關閉可以關掉程式

    }
}
