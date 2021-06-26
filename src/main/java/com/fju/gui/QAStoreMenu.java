package com.fju.gui;

import com.fju.data.DataQuestion;
import com.fju.data.IDataInterface;

import javax.swing.*;
import java.util.ArrayList;

public class QAStoreMenu extends IUIInterface {
    private JPanel qaStorePanel;
    private JButton mainMenuButton;
    private JTextArea m_QATextArea;

    public QAStoreMenu() {
        uiInital();
    }
    @Override
    public void uiInital() {
        mainMenuButton.addActionListener(e -> uiStateController.setUI(new MainMenu()));

        m_Data = new DataQuestion();

       m_QATextArea.setText(setM_QATextAreaString());

    }


    private String setM_QATextAreaString() {
        ArrayList<Integer> num  = m_Data.getNumber();
        ArrayList<String> question = m_Data.getQuestion();
        ArrayList<String> answer = m_Data.getAnswer();
        ArrayList<String> a = m_Data.getA();
        ArrayList<String> b = m_Data.getB();
        ArrayList<String> c = m_Data.getC();
        ArrayList<String> d = m_Data.getD();
        StringBuilder temTextAreaString = new StringBuilder();


        for (int i = 0; i < num.size(); i++) {

            String temAnswer = "";

            switch (answer.get(i)) {
                case "A":
                    temAnswer = a.get(i);
                    break;
                case "B":
                    temAnswer = b.get(i);
                    break;
                case "C":
                    temAnswer = c.get(i);
                    break;
                case "D":
                    temAnswer = d.get(i);
                    break;
                default:
                    System.out.println("Something Wrong");
                    break;
            }
            temTextAreaString.append("第").append(num.get(i)).append("題\n").
                    append("問題\n").append(question.get(i))
                    .append("\n").append("答案\n").append(temAnswer).append("\n");
//            System.out.println("第" + num.get(i) +"題" + "\n"
//                    + question.get(i) + "\n" + temAnswer  + "\n");
        }
        return temTextAreaString.toString();
    }

    @Override
    public void uiUpdate() {

    }

    @Override
    public JPanel getUIPanel() {
        return qaStorePanel;
    }

    @Override
    public void setM_Data(IDataInterface m_Data) {

    }
}
