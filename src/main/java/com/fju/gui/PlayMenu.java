package com.fju.gui;

import com.fju.data.DataQuestion;
import com.fju.data.IDataInterface;
import com.fju.game.IGameSystem;


import javax.swing.*;

import java.util.ArrayList;

public class PlayMenu extends IUIInterface {

    private IDataInterface data;
    private IGameSystem gameSystem;

    private JPanel playMenuPanel;
    private JLabel questionLabel;
    private JButton answerAButton;
    private JButton answerBButton;
    private JButton answerCButton;
    private JButton answerDButton;
    private JLabel numberLabel;
    private JLabel timeLabel;
    private JLabel correctLabel;
    private JLabel incorrectLabel;

    private final int number; //總題數
    private final ArrayList<String> question;
    private final ArrayList<String> a;
    private final ArrayList<String> b;
    private final ArrayList<String> c;
    private final ArrayList<String> d;
    private final ArrayList<String> answer;
    private int currentNumber; //當前題數
    private int m_CorrectCount = 0; //正確答案數量
    private int m_IncorrectCount = 0; //不正確答案數量
    private String playerAnswer = ""; //玩家答案
    private String correctAnswer = ""; //當前答案




    public PlayMenu() {
        uiInital();
        gameSystem = new IGameSystem(uiStateController, this);
        number = data.getNumber().size(); //這邊的宣告都走問題
        question = data.getQuestion();
        a = data.getA();
        b = data.getB();
        c = data.getC();
        d = data.getD();
        answer = data.getAnswer();
        currentNumber = 1;

        uiUpdate();

    }


    @Override
    public void uiInital() {

        answerAButton.addActionListener(e -> {
            playerAnswer = "A";
            checkAnswer();
        });
        answerBButton.addActionListener(e -> {
            playerAnswer = "B";
            checkAnswer();
        });

        answerCButton.addActionListener(e -> {
            playerAnswer = "C";
            checkAnswer();
        });

        answerDButton.addActionListener(e -> {
            playerAnswer = "D";
            checkAnswer();
        });

        data = new DataQuestion();
        uiStateController = new UIStateController();
        gameSystem = new IGameSystem(uiStateController, this);

    }

    @Override
    public void uiUpdate() {
       try {
           numberLabel.setText(intSwitchToString(currentNumber));
           questionLabel.setText(question.get(arrayListNumber()));
           correctLabel.setText("O:" + intSwitchToString(m_CorrectCount));
           incorrectLabel.setText("X:" + intSwitchToString(m_IncorrectCount));
           timeLabel.setText(intSwitchToString(gameSystem.getTime()));
           answerAButton.setText(a.get(arrayListNumber()));
           answerBButton.setText(b.get(arrayListNumber()));
           answerCButton.setText(c.get(arrayListNumber()));
           answerDButton.setText(d.get(arrayListNumber()));
           correctAnswer = answer.get(arrayListNumber());
       } catch (IndexOutOfBoundsException ignored) {

       }



    }



    private String intSwitchToString(int number) {
        return Integer.toString(number);
    }


    private void addCurrectCount() {
        m_CorrectCount++;
    }

    private void addIncurrentCount() {
        m_IncorrectCount++;
    }

    private int arrayListNumber() {
        return currentNumber - 1;
    }

    private void checkAnswer() {
        if(playerAnswer.equals(correctAnswer) && arrayListNumber() > number) {
            addCurrectCount();
        }
        else {
            addIncurrentCount();
        }
        currentNumber++;
    }

    @Override
    public JPanel getUIPanel() {
        return playMenuPanel;
    }

    @Override
    public boolean checkCurrentQuesiton() {
        //System.out.println(currentNumber == number);
            return arrayListNumber() == number;
    }

    public void setJFrame(JFrame frame) {
        uiStateController.setJFrame(frame);
    }
}
