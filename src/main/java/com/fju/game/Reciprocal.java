package com.fju.game;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Reciprocal {
    private int delay = 1000; //延遲
    private int period = 1000;
    private int seconds = 5;
    private static Timer timer;

    public Reciprocal() {
        timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {
                System.out.println(seconds);
                seconds--;
                if(seconds <= 0) {
                    timer.cancel();
                    //呼叫結算介面
                }
            }
        }, delay, period);
    }
}


