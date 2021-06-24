package com.fju.gui;

/*
有重複的function就用這個
 */

import javax.swing.*;

public abstract class IUIInterface {

    UIStateController uiStateController;

    public abstract void uiInital();

    public abstract void uiUpdate();

    public abstract JPanel getUIPanel(); //得到UI

    public void setUIStateController(UIStateController uiStateController) {
        this.uiStateController = uiStateController;
    }

}
