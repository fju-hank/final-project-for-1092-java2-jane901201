package com.fju.data;

import java.sql.*;
import java.util.ArrayList;

public class Question extends IDataInterface{

    protected ArrayList<Integer> number = new ArrayList<>();
    protected ArrayList<String> question = new ArrayList<>();
    protected ArrayList<String> a = new ArrayList<>();
    protected ArrayList<String> b = new ArrayList<>();
    protected ArrayList<String> c = new ArrayList<>();
    protected ArrayList<String> d = new ArrayList<>();
    protected ArrayList<String> answer = new ArrayList<>();

    private IConnectInterface iConnectInterface;

    public Question() {
        getData();
    }


    @Override
    protected void getData() {
            iConnectInterface = new SQL();
            if(iConnectInterface.connectData()) {
                iConnectInterface.inputData(number, question, a, b, c, d, answer);
            }
            else {
                iConnectInterface = new Local();
                iConnectInterface.connectData();
                iConnectInterface.inputData(number, question, a, b, c, d, answer);
            }

    }

    @Override
    public void printData() {
        for(int i = 0; i < number.size(); i++) {
            System.out.println(number.get(i) +"/" + a.get(i)+"/" + b.get(i) +"/" + c.get(i)
                    +"/" + d.get(i) + "/" + answer);
        }
    }
}
