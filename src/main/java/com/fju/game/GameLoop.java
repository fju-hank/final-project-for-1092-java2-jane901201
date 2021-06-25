package com.fju.game;

/*
遊戲更新處
接收IGameSystem的各種資料
確認點擊
接收IUIInterface的資料
 */

import com.fju.gui.IUIInterface;
import com.fju.gui.PlayMenu;

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
            //確認時間
            //確認答題數
            System.out.println("GameLoop is used");
            //m_PlayMenu.uiUpdate();
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
