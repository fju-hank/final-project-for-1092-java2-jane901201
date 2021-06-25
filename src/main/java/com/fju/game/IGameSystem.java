package com.fju.game;

import com.fju.gui.IUIInterface;
import com.fju.gui.MainMenu;


public class IGameSystem extends Thread{

    IUIInterface playMenu;
    Reciprocal m_Rreciprocal;

    private boolean m_bStop = false;


    public IGameSystem(IUIInterface playMenu) {
        m_Rreciprocal = new Reciprocal();
        this.playMenu = playMenu;
        start();
    }

    public void gameOver() {
        stopLoop();
    }

    public void checkTime() {
        if(m_Rreciprocal.getTimeCheck()) {
        }

    }

    public void checkQuestionCount() {
        if(playMenu.checkCurrentQuesiton()) {
            gameOver();
        }
    }



    public void uiUpdate() {
        playMenu.uiUpdate();
    }

    public int getTime() {
        return m_Rreciprocal.getTime();
    }




    @Override
    public void run() {
        while (!m_bStop) {
            checkQuestionCount();
            checkTime();
            uiUpdate();
            //System.out.println("GameLoop is used");
        }
    }

    public void stopLoop() {
        m_bStop = true;
    }

}
