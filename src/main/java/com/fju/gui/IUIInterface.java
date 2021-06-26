package com.fju.gui;

/*
有重複的function就用這個
 */

import javax.swing.*;
public abstract class IUIInterface{

    protected UIStateController uiStateController;
    protected static final JFrame frame = new JFrame();

    public IUIInterface() {
        uiStateController = new UIStateController();
        uiStateController.setJFrame(frame);
    }

    public abstract void uiInital();

    public abstract void uiUpdate();

    public void uiRelease() {
        uiStateController.releaseUI(frame);
    }

    public abstract JPanel getUIPanel(); //得到UI

    public JFrame getFrame() {
        return frame;
    }

//    public UIStateController uiStateController() {
//        return uiStateController;
//    }

    public boolean checkCurrentQuesiton() {
        return false;
    }

}
