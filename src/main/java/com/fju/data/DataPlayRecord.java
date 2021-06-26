package com.fju.data;

public class DataPlayRecord extends IDataInterface{

    public DataPlayRecord() {
        setClassDataName();
    }
    @Override
    protected void getData() {

    }

    @Override
    public void printData() {
        System.out.println(totolQuestion + " " + totalTime + " " + correctCount +
                " " +incorrectCount);
    }

    @Override
    public void setClassDataName() {
        classDataName = "playRecord";
    }

    @Override
    public String getClassDataName() {
        return classDataName;
    }
}
