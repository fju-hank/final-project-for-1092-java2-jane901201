package com.fju.gui;

/*
有重複的function就用這個
 */

import com.fju.data.IDataInterface;

import javax.swing.*;
import java.util.ArrayList;

public abstract class IUIInterface{

    protected UIStateController uiStateController;
    protected IDataInterface m_Data;
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


    public ArrayList<Integer> setPlayData() {
        return null;
    }

    public abstract void setM_Data(IDataInterface m_Data);


}
