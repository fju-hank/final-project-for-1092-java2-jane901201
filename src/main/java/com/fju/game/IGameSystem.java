package com.fju.game;

public class IGameSystem {



    public void checkTime(int time) {
        if(time <= 0) {
            //gameover
        }
    }

    public void checkAnswer(String playerAnswer,String correctAnswer) {
        if(playerAnswer != correctAnswer) {
            //呼叫錯誤UI
        }
        else {
            //呼叫正確UI
        }
    }
}
