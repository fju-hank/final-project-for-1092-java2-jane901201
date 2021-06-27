package com.fju.game;

import com.fju.data.DataPlayRecord;
import com.fju.data.IDataInterface;
import com.fju.gui.GameOverMenu;
import com.fju.gui.IUIInterface;
import com.fju.gui.UIStateController;

import java.util.ArrayList;


public class IGameSystem {

    UIStateController m_UIStateController;
    GameLoop m_GameLoop;
    Reciprocal m_Reciprocal;
    IUIInterface playMenu;
    IDataInterface playRecord = new DataPlayRecord();


    public IGameSystem(UIStateController uiStateController, IUIInterface playMenu) {
        m_GameLoop = new GameLoop(this, playMenu);
        m_Reciprocal = new Reciprocal();
        setM_UIStateController(uiStateController);
        setPlayMenu(playMenu);
        m_GameLoop.start();
    }

    public void gameOver() {
        playDataStore();
        m_GameLoop.stopLoop();
        IUIInterface gameOverMenu = new GameOverMenu();
        gameOverMenu.setM_Data(playRecord);
        gameOverMenu.uiUpdate();
        m_UIStateController.setUI(gameOverMenu);
    }

    private void playDataStore() {
        ArrayList<Integer> tem = playMenu.setPlayData();
        playRecord.setTotalTime(getUseTime());
        playRecord.setTotolQuestion(Math.max(tem.get(0) - 1, 0));
        playRecord.setCorrectCount(tem.get(1));
        playRecord.setIncorrectCount(tem.get(2));
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

    public int getUseTime() {
        return m_Reciprocal.getUseTime();
    }

    public int getcurrentTime() {
        return m_Reciprocal.getCurrentTme();
    }
}
