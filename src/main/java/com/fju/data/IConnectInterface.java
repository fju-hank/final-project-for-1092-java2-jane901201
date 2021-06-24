package com.fju.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public abstract class IConnectInterface {

    protected Connection connection;
    protected Statement statement;
    protected ResultSet rs;

    public abstract boolean connectData();

    public abstract void inputData(ArrayList<Integer> number, ArrayList<String> question,
                                   ArrayList<String> a, ArrayList<String> b, ArrayList<String> c,
                                   ArrayList<String> d, ArrayList<String> answer);
}
