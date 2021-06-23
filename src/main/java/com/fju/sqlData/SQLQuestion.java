package com.fju.sqlData;

import java.util.ArrayList;
import java.sql.*;

public class SQLQuestion extends ISQLInetface{
    protected ArrayList<Integer> number = new ArrayList<>();
    protected ArrayList<String> question = new ArrayList<>();
    protected ArrayList<String> a = new ArrayList<>();
    protected ArrayList<String> b = new ArrayList<>();
    protected ArrayList<String> c = new ArrayList<>();
    protected ArrayList<String> d = new ArrayList<>();
    protected ArrayList<String> answer = new ArrayList<>();


    public SQLQuestion() {
        getSQLData();
    }


    @Override
    protected void getSQLData() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            //Connection connection = DriverManager.getConnection("");
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/climbing?user=root&password=hmt736539&useUnicode=true&characterEncoding=UTF-8");
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM qa_depository");
            while(rs.next()) {
                number.add(rs.getInt("number"));
                question.add(rs.getString("question"));
                a.add(rs.getString("a"));
                b.add(rs.getString("b"));
                c.add(rs.getString("c"));
                d.add(rs.getString("d"));
                answer.add(rs.getString("answer"));

            }
        }catch (SQLException | ClassNotFoundException throwables) {
            //throwables.printStackTrace();
            System.out.println("false connect to SQL data");
            System.out.println("Connect to local data");
        }
    }

    @Override
    public void printSQLData() {
        for(int i = 0; i < number.size(); i++) {
            System.out.println(number.get(i) +"/" + a.get(i)+"/" + b.get(i) +"/" + c.get(i)
                    +"/" + d.get(i) + "/" + answer);
        }
    }
}
