package com.fju.gui;

/*
有重複的function就用這個
 */

import javax.swing.*;
public abstract class IUIInterface{

    protected UIStateController uiStateController;
    protected JFrame frame;

    public IUIInterface() {
        frame = new JFrame();
        uiStateController = new UIStateController();
        uiStateController.setJFrame(frame);
    }

    public abstract void uiInital();

    public abstract void uiUpdate();

    public abstract JPanel getUIPanel(); //得到UI

    public void setJFrame(JFrame frame) {
        this.frame = frame;
    }

    public JFrame getFrame() {
        return frame;
    }

    public boolean checkCurrentQuesiton() {
        return false;
    }

}
