package com.fju.data;

public class DataQuestion extends IDataInterface{


    public DataQuestion() {
        getData();
    }


    @Override
    protected void getData() {
        IConnectInterface iConnectInterface;
        IConnectInterface sqlConnect = new SQL();
        IConnectInterface localConnect = new Local();

            if(sqlConnect.connectData()) {
                iConnectInterface = new SQL();
                iConnectInterface.inputData(number, question, a, b, c, d, answer);
            }
            else if(localConnect.connectData()){
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
            System.out.println(number.get(i) +"/" + question.get(i) + "/" + a.get(i)+"/" + b.get(i) +"/" + c.get(i)
                    +"/" + d.get(i) + "/" + answer);
        }
    }
}
