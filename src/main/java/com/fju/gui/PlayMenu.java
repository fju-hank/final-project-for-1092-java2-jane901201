package com.fju.gui;

import com.fju.data.DataQuestion;
import com.fju.data.IDataInterface;
import com.fju.game.IGameSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PlayMenu extends IUIInterface {
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

    private ArrayList<Integer> number = new ArrayList<>();
    private ArrayList<String> question = new ArrayList<>();
    private ArrayList<String> a = new ArrayList<>();
    private ArrayList<String> b = new ArrayList<>();
    private ArrayList<String> c = new ArrayList<>();
    private ArrayList<String> d = new ArrayList<>();
    private ArrayList<String> answer = new ArrayList<>();
    private int currentNumber = 0;
    private int m_CurrectCount = 0; //正確答案數量
    private int m_IncurrectCount = 0; //不正確答案數量
    private int m_QuestionNumber = 0; //題數
    private String playerAnswer = "";
    private String correctAnswer = "";

    private IDataInterface data;
    private IGameSystem gameSystem;
    private UIStateController uiStateController;


    public PlayMenu() {
        number = data.getNumber();
        question = data.getQuestion();
        a = data.getA();
        b = data.getB();
        c = data.getC();
        d = data.getD();
        answer = data.getAnswer();
        currentNumber = 0;
        uiInital();
    }



    @Override
    public void uiInital() {

        answerAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playerAnswer = "A";
            }
        });
        answerBButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playerAnswer = "B";
            }
        });

        answerCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playerAnswer = "C";
            }
        });

        answerDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playerAnswer = "D";
            }
        });

        data = new DataQuestion();
        uiStateController = new UIStateController();
        gameSystem = new IGameSystem(uiStateController, this);

        uiUpdate();
    }

    public void uiUpdate() {
        numberLabel.setText(intSwitchToString(currentNumber));
        questionLabel.setText(question.get(currentNumber));
        answerAButton.setText(a.get(currentNumber));
        answerBButton.setText(b.get(currentNumber));
        answerCButton.setText(c.get(currentNumber));
        answerDButton.setText(d.get(currentNumber));
        correctAnswer = answer.get(currentNumber);



    }

    private String intSwtichToString(ArrayList<Integer> number, int i) {
        String s = Integer.toString(number.get(i));

        return s;
    }

    private String intSwitchToString(int number) {
        String s = Integer.toString(number);

        return s;
    }

    public void addQuestionNumber() {
        m_QuestionNumber++;
    }

    public void addCurrectCount() {
        m_CurrectCount++;
    }

    public void addIncurrentCount() {
        m_IncurrectCount++;
    }

    private void checkAnswer(String playerAnswer, String correctAnswer) {
        if(playerAnswer.equals(correctAnswer)) {
            addCurrectCount();
        }
        else {
            addIncurrentCount();
        }
    }

    @Override
    public JPanel getUIPanel() {
        return playMenuPanel;
    }





}
