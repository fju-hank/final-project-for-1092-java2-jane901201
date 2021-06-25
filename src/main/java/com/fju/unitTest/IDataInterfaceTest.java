package com.fju.unitTest;

import com.fju.data.IDataInterface;
import com.fju.data.DataQuestion;

public class IDataInterfaceTest {
    IDataInterface iDataInterface = new DataQuestion();

    public static void main(String[] args) {
        IDataInterface iDataInterface = new DataQuestion();

        iDataInterface.printData();
    }
}
