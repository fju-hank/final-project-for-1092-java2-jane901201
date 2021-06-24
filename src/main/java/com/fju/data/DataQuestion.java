package com.fju.data;

import java.sql.*;
import java.util.ArrayList;

public class DataQuestion extends IDataInterface{


    private IConnectInterface iConnectInterface;


    public DataQuestion() {
        getData();
    }


    @Override
    protected void getData() {
        final boolean  succeedConnect = true;
        iConnectInterface = new SQL();

            if(succeedConnect == iConnectInterface.connectData()) {
                iConnectInterface.inputData(number, question, a, b, c, d, answer);
            }
            else if(succeedConnect == iConnectInterface.connectData()){
                iConnectInterface = new Local();
                iConnectInterface.inputData(number, question, a, b, c, d, answer);
            }
            else {
                System.out.println("Fail to get data");
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
