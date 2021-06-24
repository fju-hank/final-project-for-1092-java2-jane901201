package com.fju.data;

import java.util.ArrayList;

public abstract class IDataInterface {

    protected ArrayList<Integer> number = new ArrayList<>();
    protected ArrayList<String> question = new ArrayList<>();
    protected ArrayList<String> a = new ArrayList<>();
    protected ArrayList<String> b = new ArrayList<>();
    protected ArrayList<String> c = new ArrayList<>();
    protected ArrayList<String> d = new ArrayList<>();
    protected ArrayList<String> answer = new ArrayList<>();

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

    protected abstract void getData();

    public abstract void printData();
}
