package com.fju.game;

import com.fju.gui.IUIInterface;
import com.fju.gui.UIStateController;
/*
遊戲更新處
接收IGameSystem的各種資料
確認點擊
接收IUIInterface的資料
 */

public class GameLoop extends Thread{

    UIStateController m_UIStateController = new UIStateController();

    public GameLoop() {

    }



    @Override
    public void run() {
       //檢查結束條件
       //更新UI
    }

    public void checkTime(int time) {
        if(time <= 0) {
            //gameover
        }
    }

    public void checkAnswer(String playerAnswer,String correctAnswer) {
        if(playerAnswer != correctAnswer) {
            //呼叫錯誤累積function
        }
        else {
            //呼叫正確UI
        }
    }

}
