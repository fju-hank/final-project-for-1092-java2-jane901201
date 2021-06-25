package com.fju.gui;

/*
有重複的function就用這個
 */

import javax.swing.*;

public abstract class IUIInterface extends IScreenSystem{


    public IUIInterface() {
    }

    public abstract void uiInital();

    public abstract void uiUpdate();

    public abstract JPanel getUIPanel(); //得到UI


    protected void switchUI(IUIInterface ui) {
        uiStateController.setUI(ui, frame);
    }

    public boolean checkCurrentQuesiton() {
        return false;
    }



}
