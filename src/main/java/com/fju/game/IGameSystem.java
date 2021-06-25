package com.fju.game;

import com.fju.gui.IUIInterface;
import com.fju.gui.PlayMenu;
import com.fju.gui.UIStateController;

import java.util.ArrayList;

public class IGameSystem {

    UIStateController m_UIStateController;
    GameLoop m_GameLoop;
    Reciprocal m_Reciprocal;
    IUIInterface playMenu;


    public IGameSystem(UIStateController uiStateController, IUIInterface playMenu) {
        setPlayMenu(playMenu);
        m_GameLoop = new GameLoop(this, this.playMenu);
        m_Reciprocal = new Reciprocal();
        setM_UIStateController(uiStateController);
    }

    public void gameover() {
        m_GameLoop.stopLoop();
        //跳出結算視窗
    }

    public boolean checkTime() {

        return m_Reciprocal.getTimeCheck();
    }

    public void checkQuestionCount(ArrayList<Integer> number, int total) {
        if(number.size() == total) {
            //GameOver
        }
    }

    public void setM_UIStateController(UIStateController uiStateController) {
        this.m_UIStateController = uiStateController;
    }

    public void setPlayMenu(IUIInterface playMenu) {
        this.playMenu = playMenu;
    }
}
