package com.fju.game;

public class QuestionControl {
    private int m_CurrectCount = 0; //正確答案
    private int m_IncurrectCount = 0; //不正確答案
    private int m_QuestionNumber = 0; //題數
    private boolean m_TimeEnd = false;

    //確認答案被點擊，題數增加

    public void addQuestionNumber() {
        m_QuestionNumber++;
    }

    public void addCurrectCount() {
        m_CurrectCount++;
    }

    public void addIncurrentCount() {
        m_IncurrectCount++;
    }



    //當題目答完or時間到，遊戲結束


}
