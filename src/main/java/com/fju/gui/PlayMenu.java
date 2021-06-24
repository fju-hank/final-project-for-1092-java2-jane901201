package com.fju.gui;

import com.fju.data.DataQuestion;
import com.fju.data.IDataInterface;

import javax.swing.*;
import java.util.ArrayList;

public class PlayMenu extends IUIInterface{
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
    private String currentAnswer = "";

    private IDataInterface data = new DataQuestion();


    public PlayMenu(JPanel playMenuPanel) {
        this.playMenuPanel = playMenuPanel;
    }

    public PlayMenu() {
        number = data.getNumber();
        question = data.getQuestion();
        a = data.getA();
        b = data.getB();
        c = data.getC();
        d = data.getD();
        answer = data.getAnswer();
        uiInital();
    }



    @Override
    public void uiInital() {
        currentNumber = 0;
        uiUpdate();
    }

    public void uiUpdate() {
        numberLabel.setText(intSwitchToString(currentNumber));
        questionLabel.setText(question.get(currentNumber));
        answerAButton.setText(a.get(currentNumber));
        answerBButton.setText(b.get(currentNumber));
        answerCButton.setText(c.get(currentNumber));
        answerDButton.setText(d.get(currentNumber));
        currentAnswer = answer.get(currentNumber);
    }

    private String intSwtichToString(ArrayList<Integer> number, int i) {
        String s = Integer.toString(number.get(i));

        return s;
    }

    private String intSwitchToString(int number) {
        String s = Integer.toString(number);

        return s;
    }

    @Override
    public JPanel getUIPanel() {
        return playMenuPanel;
    }


}
