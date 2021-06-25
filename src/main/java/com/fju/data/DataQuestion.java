package com.fju.data;

public class DataQuestion extends IDataInterface{


    public DataQuestion() {
        getData();
    }


    @Override
    protected void getData() {
        IConnectInterface iConnectInterface = new SQL();

            if(iConnectInterface.connectData()) {
                iConnectInterface.inputData(number, question, a, b, c, d, answer);
            }
            else if(iConnectInterface.connectData()){
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
