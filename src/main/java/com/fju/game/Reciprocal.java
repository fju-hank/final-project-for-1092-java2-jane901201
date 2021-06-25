package com.fju.game;
import java.util.Timer;
import java.util.TimerTask;

public class Reciprocal {
    private int m_Delay = 1000; //延遲
    private int period = 1000;
    private int m_seconds = 5;
    private boolean m_bEnd = false;
    private static Timer timer;

    public Reciprocal() {
        timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {
                System.out.println(m_seconds);
                m_seconds--;
                if(m_seconds <= 0) {
                    timer.cancel();
                    m_bEnd = true;
                }
            }
        }, m_Delay, period);
    }

    public boolean getTimeCheck() {
        return m_bEnd;
    }
}


