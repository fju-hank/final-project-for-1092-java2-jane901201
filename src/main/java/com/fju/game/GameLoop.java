package com.fju.game;

/*
遊戲更新處
接收IGameSystem的各種資料
確認點擊
接收IUIInterface的資料
 */

import com.fju.gui.IUIInterface;

public class GameLoop extends Thread{

    IGameSystem gameSystem;
    IUIInterface m_PlayMenu;
    private boolean m_bStop = false;


    public GameLoop(IGameSystem gameSystem, IUIInterface playMenu) {
        setGameSystem(gameSystem);
        setM_PlayMenu(playMenu);
    }



    @Override
    public void run() {
        while (!m_bStop) {
            gameSystem.checkQuestionCount();
            gameSystem.checkTime();
            m_PlayMenu.uiUpdate();
            //System.out.println("GameLoop is used");
        }
    }

    public void stopLoop() {
        m_bStop = true;
    }

    public void setM_PlayMenu(IUIInterface m_PlayMenu) {
        this.m_PlayMenu = m_PlayMenu;
    }

    public void setGameSystem(IGameSystem gameSystem) {
        this.gameSystem = gameSystem;
    }
}
