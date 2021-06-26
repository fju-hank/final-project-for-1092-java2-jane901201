package com.fju.data;

import java.util.ArrayList;

public abstract class IDataInterface {

    //QuestionData
    protected ArrayList<Integer> number = new ArrayList<>();
    protected ArrayList<String> question = new ArrayList<>();
    protected ArrayList<String> a = new ArrayList<>();
    protected ArrayList<String> b = new ArrayList<>();
    protected ArrayList<String> c = new ArrayList<>();
    protected ArrayList<String> d = new ArrayList<>();
    protected ArrayList<String> answer = new ArrayList<>();

    //InternetData
    protected ArrayList<String> internet = new ArrayList<>();
    protected ArrayList<String> unl = new ArrayList<>();

    //PlayData
    protected int totolQuestion;
    protected int totalTime;
    protected int correctCount;
    protected int incorrectCount;

    //QuestionData
    public ArrayList<Integer> getNumber() {
        return number;
    }

    public ArrayList<String> getQuestion() {
        return question;
    }

    public ArrayList<String> getA() {
        return a;
    }

    public ArrayList<String> getB() {
        return b;
    }

    public ArrayList<String> getC() {
        return c;
    }

    public ArrayList<String> getD() {
        return d;
    }

    public ArrayList<String> getAnswer() {
        return answer;
    }

    public int getTotolQuestion() {
        return totolQuestion;
    }

    public void setTotolQuestion(int totolQuestion) {
        this.totolQuestion = totolQuestion;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public int getCorrectCount() {
        return correctCount;
    }

    public void setCorrectCount(int correctCount) {
        this.correctCount = correctCount;
    }

    public int getIncorrectCount() {
        return incorrectCount;
    }

    public void setIncorrectCount(int incorrectCount) {
        this.incorrectCount = incorrectCount;
    }

    protected abstract void getData();

    public abstract void printData();
}
