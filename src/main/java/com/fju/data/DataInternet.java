package com.fju.data;

public class DataInternet extends IDataInterface{

    public DataInternet() {
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
            iConnectInterface.inputData(internetName, url);
        }
        else if(localConnect.bCheckConnectData()){ //要在加checkConnectData
            iConnectInterface = new Local();
            iConnectInterface.connectData(getClassDataName());
            iConnectInterface.inputData(internetName, url);
        }
        else {
            System.out.println("Fail to get data");
        }
    }

    @Override
    public void printData() {
        for (int i = 0; i < internetName.size(); i++) {
            System.out.println(internetName.get(i) + "/" + url.get(i));
        }

    }

    @Override
    public void setClassDataName() {
        classDataName = "internet";
    }

    @Override
    public String getClassDataName() {
        return classDataName;
    }
}
