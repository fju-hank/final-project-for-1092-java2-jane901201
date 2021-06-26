package com.fju.data;

import java.sql.*;
import java.util.ArrayList;

public class SQL extends IConnectInterface{


    @Override
    public boolean bCheckConnectData() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            //Connection connection = DriverManager.getConnection("");
            connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/climbing?user=root&password=hmt736539&useUnicode=true&characterEncoding=UTF-8");
            statement = connection.createStatement();
            rs = statement.executeQuery("SELECT * FROM qa_depository");
            rs = statement.executeQuery("SELECT * FROM internet");
            System.out.println("succeed connect to SQL data");
            return true;

        }catch (SQLException | ClassNotFoundException throwables) {
            //throwables.printStackTrace();
            System.out.println("false connect to SQL data");
            System.out.println("try connect to local data");
            return false;
        }
    }

    @Override
    public void connectData(String name) {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            //Connection connection = DriverManager.getConnection("");
            connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/climbing?user=root&password=hmt736539&useUnicode=true&characterEncoding=UTF-8");
            statement = connection.createStatement();
            switch (name) {
                case "question":
                    rs = statement.executeQuery("SELECT * FROM qa_depository");
                    break;
                case "internet":
                    rs = statement.executeQuery("SELECT * FROM internet");
                    break;
                default:
                    System.out.println("Something Wrong");

            }


            System.out.println("succeed connect to SQL data");


        }catch (SQLException | ClassNotFoundException throwables) {
            //throwables.printStackTrace();
        }
    }


    @Override
    public void inputData(ArrayList<Integer> number, ArrayList<String> question,
                          ArrayList<String> a, ArrayList<String> b, ArrayList<String> c,
                          ArrayList<String> d, ArrayList<String> answer){
        try {
            while(rs.next()) {
                number.add(rs.getInt("number"));
                question.add(rs.getString("question"));
                a.add(rs.getString("a"));
                b.add(rs.getString("b"));
                c.add(rs.getString("c"));
                d.add(rs.getString("d"));
                answer.add(rs.getString("answer"));
            }
        } catch (SQLException | NullPointerException throwables) {
            System.out.println("Fail to add question data");
        }
    }

    @Override
    public void inputData(ArrayList<String> internetName, ArrayList<String> url) {
        try {
            while(rs.next()) {
                internetName.add(rs.getString("name"));
                url.add(rs.getString("url"));
            }
        }catch (SQLException throwables) {
            System.out.println("Fail to add internet data");
        }

    }
}
