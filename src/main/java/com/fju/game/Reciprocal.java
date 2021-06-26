package com.fju.game;
import java.util.Timer;
import java.util.TimerTask;

public class Reciprocal {
    private int m_seconds = 60;
    private int m_UseSeconds = 0;
    private boolean m_bEnd = false;
    private static Timer timer;

    public Reciprocal() {
        timer = new Timer();

        //延遲
        int m_Delay = 1000;
        int period = 1000;
        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {
                //System.out.println(m_seconds);
                m_seconds -= 1;
                m_UseSeconds +=1;
                if(m_seconds <= 0) {
                    timer.cancel();
                    m_bEnd = true;
                }
            }
        }, m_Delay, period);
    }

    public boolean getTimeCheck() {
        //System.out.println(m_bEnd);
        return m_bEnd;
    }

    public int getUseTime() {
        return m_UseSeconds;
    }

    public int getCurrentTme() {
        return m_seconds;
    }
}


