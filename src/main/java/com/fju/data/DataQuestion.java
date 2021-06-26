package com.fju.data;

public class DataQuestion extends IDataInterface{


    public DataQuestion() {
        setClassDataName();
        getData();
    }


    @Override
    protected void getData() {
        IConnectInterface iConnectInterface;
        IConnectInterface sqlConnect = new SQL();
        IConnectInterface localConnect = new Local();
        //System.out.println(sqlConnect.connectData());
            if(sqlConnect.bCheckConnectData()) {
                iConnectInterface = new SQL();
                iConnectInterface.connectData(getClassDataName());
                iConnectInterface.inputData(number, question, a, b, c, d, answer);
            }
            else if(localConnect.bCheckConnectData()){
                iConnectInterface = new Local();
                iConnectInterface.connectData(getClassDataName());
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

    @Override
    public void setClassDataName() {
        classDataName = "question";
    }

    @Override
    public String getClassDataName() {
        return classDataName;
    }
}
