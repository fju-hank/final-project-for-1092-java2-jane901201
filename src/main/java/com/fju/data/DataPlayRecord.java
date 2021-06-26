package com.fju.data;

public class DataPlayRecord extends IDataInterface{
    @Override
    protected void getData() {

    }

    @Override
    public void printData() {
        System.out.println(totolQuestion + " " + totalTime + " " + correctCount +
                " " +incorrectCount);
    }
}
