package com.fju.game;

import com.fju.gui.GameOverMenu;
import com.fju.gui.IUIInterface;
import com.fju.gui.UIStateController;


public class IGameSystem {

    UIStateController m_UIStateController;
    GameLoop m_GameLoop;
    Reciprocal m_Reciprocal;
    IUIInterface playMenu;


    public IGameSystem(UIStateController uiStateController, IUIInterface playMenu) {
        m_GameLoop = new GameLoop(this, playMenu);
        m_Reciprocal = new Reciprocal();
        setM_UIStateController(uiStateController);
        setPlayMenu(playMenu);
        m_GameLoop.start();
    }

    public void gameOver() {
        m_GameLoop.stopLoop();
        m_UIStateController.setUI(new GameOverMenu());
    }

    public void checkTime() {
        if(m_Reciprocal.getTimeCheck()) {
            gameOver();
        }

    }

    public void checkQuestionCount() {
        if(playMenu.checkCurrentQuesiton()) {
            gameOver();
        }
    }

    public void setM_UIStateController(UIStateController uiStateController) {
        this.m_UIStateController = uiStateController;
    }

    public void setPlayMenu(IUIInterface playMenu) {
        this.playMenu = playMenu;
    }

    public int getTime() {
        return m_Reciprocal.getTime();
    }
}
