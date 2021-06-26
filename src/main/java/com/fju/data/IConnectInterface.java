package com.fju.data;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public abstract class IConnectInterface {

    protected Connection connection;
    protected Statement statement;
    protected ResultSet rs;

    protected FileInputStream fis;
    protected InputStreamReader isr;
    protected BufferedReader br;

    public abstract boolean bCheckConnectData();

    public abstract void connectData(String name);

    public void inputData(ArrayList<Integer> number, ArrayList<String> question,
                                   ArrayList<String> a, ArrayList<String> b, ArrayList<String> c,
                                   ArrayList<String> d, ArrayList<String> answer) {

    }

    public void inputData(ArrayList<String> internetName, ArrayList<String> url) {

    };
}
